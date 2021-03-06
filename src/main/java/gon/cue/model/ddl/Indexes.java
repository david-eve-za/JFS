/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl;


import gon.cue.model.ddl.tables.Directory;
import gon.cue.model.ddl.tables.Drelation;
import gon.cue.model.ddl.tables.Files;
import gon.cue.model.ddl.tables.Frelation;
import gon.cue.model.ddl.tables.Permisions;
import gon.cue.model.ddl.tables.Users;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIMARY_KEY_6 = Indexes0.PRIMARY_KEY_6;
    public static final Index DRELATION_DIRECTORY_FK_INDEX_6 = Indexes0.DRELATION_DIRECTORY_FK_INDEX_6;
    public static final Index DRELATION_PERMISIONS_FK_INDEX_6 = Indexes0.DRELATION_PERMISIONS_FK_INDEX_6;
    public static final Index DRELATION_USERS_FK_INDEX_6 = Indexes0.DRELATION_USERS_FK_INDEX_6;
    public static final Index PRIMARY_KEY_3 = Indexes0.PRIMARY_KEY_3;
    public static final Index FRELATION_FILES_FK_INDEX_9 = Indexes0.FRELATION_FILES_FK_INDEX_9;
    public static final Index FRELATION_PERMISIONS_FK_INDEX_9 = Indexes0.FRELATION_PERMISIONS_FK_INDEX_9;
    public static final Index FRELATION_USERS_FK_INDEX_9 = Indexes0.FRELATION_USERS_FK_INDEX_9;
    public static final Index PRIMARY_KEY_F = Indexes0.PRIMARY_KEY_F;
    public static final Index PRIMARY_KEY_4 = Indexes0.PRIMARY_KEY_4;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index PRIMARY_KEY_6 = createIndex("PRIMARY_KEY_6", Directory.DIRECTORY, new OrderField[] { Directory.DIRECTORY.ID }, true);
        public static Index DRELATION_DIRECTORY_FK_INDEX_6 = createIndex("DRELATION_DIRECTORY_FK_INDEX_6", Drelation.DRELATION, new OrderField[] { Drelation.DRELATION.DID }, false);
        public static Index DRELATION_PERMISIONS_FK_INDEX_6 = createIndex("DRELATION_PERMISIONS_FK_INDEX_6", Drelation.DRELATION, new OrderField[] { Drelation.DRELATION.PID }, false);
        public static Index DRELATION_USERS_FK_INDEX_6 = createIndex("DRELATION_USERS_FK_INDEX_6", Drelation.DRELATION, new OrderField[] { Drelation.DRELATION.IDUSER }, false);
        public static Index PRIMARY_KEY_3 = createIndex("PRIMARY_KEY_3", Files.FILES, new OrderField[] { Files.FILES.ID }, true);
        public static Index FRELATION_FILES_FK_INDEX_9 = createIndex("FRELATION_FILES_FK_INDEX_9", Frelation.FRELATION, new OrderField[] { Frelation.FRELATION.FID }, false);
        public static Index FRELATION_PERMISIONS_FK_INDEX_9 = createIndex("FRELATION_PERMISIONS_FK_INDEX_9", Frelation.FRELATION, new OrderField[] { Frelation.FRELATION.PID }, false);
        public static Index FRELATION_USERS_FK_INDEX_9 = createIndex("FRELATION_USERS_FK_INDEX_9", Frelation.FRELATION, new OrderField[] { Frelation.FRELATION.IDUSER }, false);
        public static Index PRIMARY_KEY_F = createIndex("PRIMARY_KEY_F", Permisions.PERMISIONS, new OrderField[] { Permisions.PERMISIONS.ID }, true);
        public static Index PRIMARY_KEY_4 = createIndex("PRIMARY_KEY_4", Users.USERS, new OrderField[] { Users.USERS.ID }, true);
    }
}
