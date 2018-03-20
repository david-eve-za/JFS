package gon.cue.model.crud;

import gon.cue.model.util.JOOQUtil;

import java.io.File;

import org.jooq.Record;
import org.jooq.SelectWhereStep;
import org.jooq.Table;
import org.jooq.impl.DSL;

public class Operations extends JOOQUtil {
    private final static Operations _operations = new Operations();

    static {
        File f = new File("FileSystem.mv.db");

        if (!f.exists()) {
            f = null;
            getOperations().createSchema();
        }

    }

    public static Operations getOperations() {
        return _operations;
    }

    public Operations() {
        super("FileSystem", "root", "toor");
    }

    public void close() {
        super.closeConnection();
    }

    public Number Count(Table< ? > t) {
        return create.select(DSL.count()).from(t).fetchOne(0, int.class);
    }

    public Record create(Table< ? > t) {
        return create.newRecord(t);
    }

    public SelectWhereStep< ? > findOn(Table< ? > t) {
        return create.selectFrom(t);
    }

    public void reCreateDataBase() {
        super.recreateSchema();
    }
}
