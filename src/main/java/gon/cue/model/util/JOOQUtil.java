package gon.cue.model.util;

import static org.jooq.impl.DSL.constraint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gon.cue.model.ddl.Public;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.jooq.Constraint;
import org.jooq.DSLContext;
import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.UniqueKey;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

public class JOOQUtil {

    private Connection   conn;
    protected DSLContext create;

    static {
        ConsoleAppender console = new ConsoleAppender(); // create appender
        // configure the appender
        console.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        console.setThreshold(Level.ALL);
        console.activateOptions();
        // add appender to any Logger (here is root)
        Logger.getRootLogger().addAppender(console);

        FileAppender fa = new FileAppender();
        fa.setName("FileLogger");
        fa.setFile("INFO.log");
        fa.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n"));
        fa.setThreshold(Level.ALL);
        fa.setAppend(true);
        fa.activateOptions();

        // add appender to any Logger (here is root)
        Logger.getRootLogger().addAppender(fa);
        // repeat with all other desired appenders
    }

    public JOOQUtil(String DBName, String User, String Pass) {


        StringBuilder strConnect = new StringBuilder();

        strConnect.append("jdbc:h2:file:./").append(DBName).append(";DB_CLOSE_DELAY=-1;MVCC=TRUE");

        Settings settings = new Settings();

        settings.withExecuteLogging(true);

        try {

            conn = DriverManager.getConnection(strConnect.toString(), User, Pass);

            create = DSL.using(conn, SQLDialect.H2, settings);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    protected void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void createSchema() {

        //		System.out.println();

        Public.PUBLIC.getSequences().forEach(item -> {
            //			System.out.println("Execute query: \n" + create.createSequenceIfNotExists(item));
            create.createSequenceIfNotExists(item).execute();
        });

        //		System.out.println();

        Public.PUBLIC.getTables()
                     .forEach(item -> {
                                  List<Constraint> constraints = new ArrayList<Constraint>();

                                  if (!item.getKeys().isEmpty()) {
                                      for (UniqueKey< ? > key : item.getKeys()) {
                                          if (key.isPrimary()) {
                                              constraints.add(constraint(key.getName()).primaryKey(key.getFieldsArray()));
                                          }
                                          if (!key.isPrimary()) {
                                              constraints.add(constraint(key.getName()).unique(key.getFieldsArray()));
                                          }
                                      }
                                  }

                                  if (!item.getReferences().isEmpty()) {
                                      for (ForeignKey< ? , ? > key : item.getReferences()) {
                                          key.getFields().stream().forEach(action -> {
                                              System.out.println(action.getName());
                                          });

                                          constraints.add(constraint(key.getName()).foreignKey(key.getFieldsArray())
                                                                                   .references(key.getKey().getTable(),
                                                                                               key.getKey().getFieldsArray()));
                                      }
                                  }

                                  //			System.out.println("Execute query: \n"
                                  //					+ create.createTableIfNotExists(item).columns(item.fields()).constraints(constraints));
                                  create.createTableIfNotExists(item).columns(item.fields()).constraints(constraints).execute();

                                  System.out.println();
                              });
    }

    protected void recreateSchema() {

        Public.PUBLIC.getTables().stream().forEach(item -> {
            //			System.out.println(create.dropTableIfExists(item));
            create.dropTableIfExists(item).execute();
        });

        System.out.println();

        Public.PUBLIC.getSequences().forEach(item -> {
            //			System.out.println("Execute query: \n" + create.dropSequenceIfExists(item));
            create.dropSequenceIfExists(item).execute();
        });

        this.createSchema();
    }
}
