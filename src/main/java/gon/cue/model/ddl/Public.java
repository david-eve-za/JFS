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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 523490366;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.DIRECTORY</code>.
     */
    public final Directory DIRECTORY = Directory.DIRECTORY;

    /**
     * The table <code>PUBLIC.DRELATION</code>.
     */
    public final Drelation DRELATION = Drelation.DRELATION;

    /**
     * The table <code>PUBLIC.FILES</code>.
     */
    public final Files FILES = Files.FILES;

    /**
     * The table <code>PUBLIC.FRELATION</code>.
     */
    public final Frelation FRELATION = Frelation.FRELATION;

    /**
     * The table <code>PUBLIC.PERMISIONS</code>.
     */
    public final Permisions PERMISIONS = Permisions.PERMISIONS;

    /**
     * The table <code>PUBLIC.USERS</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                Directory.DIRECTORY,
                Files.FILES,
                Permisions.PERMISIONS,
                Users.USERS,
                Drelation.DRELATION,
                Frelation.FRELATION);
    }
}
