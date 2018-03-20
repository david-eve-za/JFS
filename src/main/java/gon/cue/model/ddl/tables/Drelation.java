/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl.tables;


import gon.cue.model.ddl.Indexes;
import gon.cue.model.ddl.Keys;
import gon.cue.model.ddl.Public;
import gon.cue.model.ddl.tables.records.DrelationRecord;

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
public class Drelation extends TableImpl<DrelationRecord> {

    private static final long serialVersionUID = 2075805007;

    /**
     * The reference instance of <code>PUBLIC.DRELATION</code>
     */
    public static final Drelation DRELATION = new Drelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DrelationRecord> getRecordType() {
        return DrelationRecord.class;
    }

    /**
     * The column <code>PUBLIC.DRELATION.IDUSER</code>.
     */
    public final TableField<DrelationRecord, Integer> IDUSER = createField("IDUSER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.DRELATION.DID</code>.
     */
    public final TableField<DrelationRecord, Long> DID = createField("DID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.DRELATION.PID</code>.
     */
    public final TableField<DrelationRecord, byte[]> PID = createField("PID", org.jooq.impl.SQLDataType.VARBINARY.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.DRELATION</code> table reference
     */
    public Drelation() {
        this(DSL.name("DRELATION"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.DRELATION</code> table reference
     */
    public Drelation(String alias) {
        this(DSL.name(alias), DRELATION);
    }

    /**
     * Create an aliased <code>PUBLIC.DRELATION</code> table reference
     */
    public Drelation(Name alias) {
        this(alias, DRELATION);
    }

    private Drelation(Name alias, Table<DrelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Drelation(Name alias, Table<DrelationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DRELATION_DIRECTORY_FK_INDEX_6, Indexes.DRELATION_PERMISIONS_FK_INDEX_6, Indexes.DRELATION_USERS_FK_INDEX_6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DrelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DrelationRecord, ?>>asList(Keys.DRELATION_USERS_FK, Keys.DRELATION_DIRECTORY_FK, Keys.DRELATION_PERMISIONS_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Drelation as(String alias) {
        return new Drelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Drelation as(Name alias) {
        return new Drelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Drelation rename(String name) {
        return new Drelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Drelation rename(Name name) {
        return new Drelation(name, null);
    }
}