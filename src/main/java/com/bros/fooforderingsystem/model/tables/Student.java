/*
 * This file is generated by jOOQ.
 */
package com.bros.fooforderingsystem.model.tables;


import com.bros.fooforderingsystem.model.Keys;
import com.bros.fooforderingsystem.model.Public;
import com.bros.fooforderingsystem.model.tables.records.StudentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>public.student.id</code>.
     */
    public final TableField<StudentRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.student.name</code>.
     */
    public final TableField<StudentRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.student.email</code>.
     */
    public final TableField<StudentRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.student.phone</code>.
     */
    public final TableField<StudentRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.student.created_at</code>.
     */
    public final TableField<StudentRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.student.updated_at</code>.
     */
    public final TableField<StudentRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>public.student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    /**
     * Create a <code>public.student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    public <O extends Record> Student(Table<O> child, ForeignKey<O, StudentRecord> key) {
        super(child, key, STUDENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.STUDENT_PKEY;
    }

    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.STUDENT_PKEY);
    }

    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
