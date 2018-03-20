/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl.tables;


import gon.cue.model.ddl.Indexes;
import gon.cue.model.ddl.Keys;
import gon.cue.model.ddl.Public;
import gon.cue.model.ddl.tables.records.FilesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = -1024951258;

    /**
     * The reference instance of <code>PUBLIC.FILES</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>PUBLIC.FILES.ID</code>.
     */
    public final TableField<FilesRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.FILES.FNAME</code>.
     */
    public final TableField<FilesRecord, String> FNAME = createField("FNAME", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.FILES.FEXT</code>.
     */
    public final TableField<FilesRecord, String> FEXT = createField("FEXT", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>PUBLIC.FILES.FSIZE</code>.
     */
    public final TableField<FilesRecord, Long> FSIZE = createField("FSIZE", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>PUBLIC.FILES.FCONTENT</code>.
     */
    public final TableField<FilesRecord, byte[]> FCONTENT = createField("FCONTENT", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>PUBLIC.FILES.FOWNER</code>.
     */
    public final TableField<FilesRecord, Integer> FOWNER = createField("FOWNER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.FILES</code> table reference
     */
    public Files() {
        this(DSL.name("FILES"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.FILES</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>PUBLIC.FILES</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FilesRecord, Long> getIdentity() {
        return Keys.IDENTITY_FILES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilesRecord> getPrimaryKey() {
        return Keys.FILES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilesRecord>> getKeys() {
        return Arrays.<UniqueKey<FilesRecord>>asList(Keys.FILES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }
}
