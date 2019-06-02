package com.nprotech.inventory.databases;

import android.content.Context;

public class DBManager {

    static DBManager dbInstance;

    /**
     * @param context - set DB context
     * @return - returns the instance of DB
     */
    public static DBManager getInstance(Context context) {
        if (null == dbInstance) {
            dbInstance = new DBManager(context);
        }
        return dbInstance;
    }

    private DBHelper dbHelper;

    /**
     * @param ctx - DB context
     */
    private DBManager(Context ctx) {
        dbHelper = new DBHelper(ctx);
    }

    /**
     * @return - DB helper data
     */
    public DBHelper getHelper() {
        return dbHelper;
    }
}