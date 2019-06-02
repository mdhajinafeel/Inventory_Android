package com.nprotech.inventory.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

public class DBHelper extends OrmLiteSqliteOpenHelper {

    static final int DB_VERSION = 1;
    Context context;

    /**
     * @param context - set DB context
     */
    public DBHelper(Context context) {
        super(context, getDbpath(context), null, DB_VERSION);
        this.context = context;
    }

    /**
     * @param context - set DB Context
     * @return - This method is to get the DB path
     */
    public static String getDbpath(Context context) {
        return "/data/data/" + context.getPackageName() + "/files/DB_INVENTORY_RETAILER.db3";
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    @Override
    public void close() {

    }
}