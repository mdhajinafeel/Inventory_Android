package com.nprotech.inventory.helper;

public class PreferenceManager {

    static PreferenceManager instance;

    public static PreferenceManager getInstance() {
        if (instance == null) {
            instance = new PreferenceManager();
        }
        return instance;
    }
}