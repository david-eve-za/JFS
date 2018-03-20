/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl.tables;


import gon.cue.model.ddl.Indexes;
import gon.cue.model.ddl.Keys;
import gon.cue.model.ddl.Public;
import gon.cue.model.ddl.tables.records.FrelationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Frelation extends TableImpl<FrelationRecord> {

    private static final long serialVersionUID = 325129866;

    /**
     * The reference instance of <code>PUBLIC.FRELATION</code>
     */
    public static final Frelation FRELATION = new Frelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FrelationRecord> getRecordType() {
        return FrelationRecord.class;
    }

    /**
     * The column <code>PUBLIC.FRELATION.IDUSER</code>.
     */
    public final TableField<FrelationRecord, Integer> IDUSER = createField("IDUSER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.FRELATION.FID</code>.
     */
    public final TableField<FrelationRecord, Long> FID = createField("FID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.FRELATION.PID</code>.
     */
    public final TableField<FrelationRecord, byte[]> PID = createField("PID", org.jooq.impl.SQLDataType.VARBINARY.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.FRELATION</code> table reference
     */
    public Frelation() {
        this(DSL.name("FRELATION"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.FRELATION</code> table reference
     */
    public Frelation(String alias) {
        this(DSL.name(alias), FRELATION);
    }

    /**
     * Create an aliased <code>PUBLIC.FRELATION</code> table reference
     */
    public Frelation(Name alias) {
        this(alias, FRELATION);
    }

    private Frelation(Name alias, Table<FrelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Frelation(Name alias, Table<FrelationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.FRELATION_FILES_FK_INDEX_9, Indexes.FRELATION_PERMISIONS_FK_INDEX_9, Indexes.FRELATION_USERS_FK_INDEX_9);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FrelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FrelationRecord, ?>>asList(Keys.FRELATION_USERS_FK, Keys.FRELATION_FILES_FK, Keys.FRELATION_PERMISIONS_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Frelation as(String alias) {
        return new Frelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Frelation as(Name alias) {
        return new Frelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Frelation rename(String name) {
        return new Frelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Frelation rename(Name name) {
        return new Frelation(name, null);
    }
}
