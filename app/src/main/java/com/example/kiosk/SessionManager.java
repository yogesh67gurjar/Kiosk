package com.example.kiosk;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final String PREF_NAME = "UserSession";
    private static final String IS_LOGGED_IN = "IsLoggedIn";
    private static final Integer ShopID = 0;
    private static final String PASSWORD = "Password";

    public SessionManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setLoggedIn(boolean isLoggedIn) {
        editor.putBoolean(IS_LOGGED_IN, isLoggedIn);
        editor.apply();
    }

    public boolean isLoggedIn() {
        return sharedPreferences.getBoolean(IS_LOGGED_IN, false);
    }

    public void saveUserInfo(int username, String password) {
        editor.putInt(String.valueOf(ShopID), username);
        editor.putString(PASSWORD, password);
        editor.apply();
    }

    public Integer getUsername() {
        return sharedPreferences.getInt(String.valueOf(ShopID), 0);
    }

    public String getPassword() {
        return sharedPreferences.getString(PASSWORD, "");
    }

    public void logout() {
        editor.clear();
        editor.apply();
    }
}
