package com.example.afinal;


import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "USer";
    private static final int DB_VERSION = 1;

    public static final String TABLE_NAME = "User";


    public static final String COL_NAME = "name";
    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME
                + " (_id INTEGER , "
                + COL_NAME + " TEXT, " + COL_USERNAME + " TEXT, "
                + COL_PASSWORD + " INTEGER);");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + COL_NAME + ", " + COL_USERNAME + ", " + COL_PASSWORD +  ") VALUES ('1', 'Android Studio', 'android'" + ", '123456');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + COL_NAME + ", " + COL_USERNAME + ", " + COL_PASSWORD +  ") VALUES ('2', 'Promlert Lovichit', 'android'" + ", '456789');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + COL_NAME + ", " + COL_USERNAME + ", " + COL_PASSWORD +  ") VALUES ('3', 'Mark zuckerberg', 'android'" + ", '789012');");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
