package com.example.kiosk.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = CartModel.class, version = 3, exportSchema = false)
public abstract class DatabaseHelper extends RoomDatabase {

    public static final String DATABASE_NAME = "cartDatabase";

    public abstract CartDao cartDao();

    public static DatabaseHelper instance;

    public static synchronized DatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), DatabaseHelper.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

}
