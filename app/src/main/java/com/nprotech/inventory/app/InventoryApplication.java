package com.nprotech.inventory.app;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

public class InventoryApplication extends MultiDexApplication {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        InventoryApplication.context = getApplicationContext();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * @return - it returns the application context
     */
    public static Context getAppContext() {
        return InventoryApplication.context;
    }
}