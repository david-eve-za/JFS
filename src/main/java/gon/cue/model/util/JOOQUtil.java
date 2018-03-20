package gon.cue.model.util;

import gon.cue.model.ddl.Public;
import org.apache.log4j.*;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.constraint;

public class JOOQUtil {

    private Connection conn;
    protected DSLContext create;
    private Logger log = Logger.getLogger(JOOQUtil.class.getName());
    
    /*
    * Configure Logger to use log4j
    * */
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

    /*
    * @constructor
    * 
    * @params
    * */
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

        Public.PUBLIC.getSequences().forEach(item -> {
            create.createSequenceIfNotExists(item).execute();
        });

        Public.PUBLIC.getTables()
                .forEach((Table<?> item) -> {
                    List<Constraint> constraints = new ArrayList<>();

                    if (!item.getKeys().isEmpty()) {
                        for (UniqueKey<?> key : item.getKeys()) {
                            if (key.isPrimary()) {
                                constraints.add(constraint(key.getName()).primaryKey(key.getFieldsArray()));
                            }
                            if (!key.isPrimary()) {
                                constraints.add(constraint(key.getName()).unique(key.getFieldsArray()));
                            }
                        }
                    }

                    if (!item.getReferences().isEmpty()) {
                        for (ForeignKey<?, ?> key : item.getReferences()) {
                            constraints.add(constraint(key.getName()).foreignKey(key.getFieldsArray())
                                    .references(key.getKey().getTable(),
                                            key.getKey().getFieldsArray()));
                        }
                    }
                    create.createTableIfNotExists(item).columns(item.fields()).constraints(constraints).execute();
                });
    }
}
