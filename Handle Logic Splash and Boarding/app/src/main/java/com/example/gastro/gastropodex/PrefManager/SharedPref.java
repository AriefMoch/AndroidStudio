package com.example.gastro.gastropodex.PrefManager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by gastro on 11/8/17.
 */

public class SharedPref {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "shared_pref";
    private static final String PREF_FIRST = "first";
    private static final String PREF_LOG = "log";
    private static final String PREF_DATA_SAVE = "data_save";

    public SharedPref(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        this.editor = this.sharedPreferences.edit();
    }

    /**
     * first open
     */
    public boolean setFirstOpen(boolean firstOpen) {
        editor.putBoolean(PREF_FIRST, firstOpen);
        editor.commit();
        return firstOpen;
    }

    public boolean isFirstOpen() {
        return sharedPreferences.getBoolean(PREF_FIRST, true);}

    /**
     *Log
     */
    public void setLogin(long dataLogin) {
        editor.putLong(PREF_LOG, dataLogin);
        editor.commit();
        saveData();
    }

    public long getLogin() {
        return sharedPreferences.getLong(PREF_LOG, 0);
    }

    public void saveData() {
        editor.putBoolean(PREF_DATA_SAVE, true);
        editor.commit();
    }

    public boolean isDataSaved() {
        return sharedPreferences.getBoolean(PREF_DATA_SAVE, false);
    }
}
