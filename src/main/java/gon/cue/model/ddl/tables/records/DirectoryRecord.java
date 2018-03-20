/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl.tables.records;


import gon.cue.model.ddl.tables.Directory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DirectoryRecord extends UpdatableRecordImpl<DirectoryRecord> implements Record4<Long, String, Long, Integer> {

    private static final long serialVersionUID = 1669404005;

    /**
     * Setter for <code>PUBLIC.DIRECTORY.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.DIRECTORY.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.DIRECTORY.DNAME</code>.
     */
    public void setDname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.DIRECTORY.DNAME</code>.
     */
    public String getDname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.DIRECTORY.DPARENT</code>.
     */
    public void setDparent(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.DIRECTORY.DPARENT</code>.
     */
    public Long getDparent() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>PUBLIC.DIRECTORY.DOWNER</code>.
     */
    public void setDowner(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.DIRECTORY.DOWNER</code>.
     */
    public Integer getDowner() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Directory.DIRECTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Directory.DIRECTORY.DNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Directory.DIRECTORY.DPARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Directory.DIRECTORY.DOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getDparent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getDparent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DirectoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DirectoryRecord value2(String value) {
        setDname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DirectoryRecord value3(Long value) {
        setDparent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DirectoryRecord value4(Integer value) {
        setDowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DirectoryRecord values(Long value1, String value2, Long value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DirectoryRecord
     */
    public DirectoryRecord() {
        super(Directory.DIRECTORY);
    }

    /**
     * Create a detached, initialised DirectoryRecord
     */
    public DirectoryRecord(Long id, String dname, Long dparent, Integer downer) {
        super(Directory.DIRECTORY);

        set(0, id);
        set(1, dname);
        set(2, dparent);
        set(3, downer);
    }
}