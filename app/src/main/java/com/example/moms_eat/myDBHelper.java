package com.example.moms_eat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDBHelper extends SQLiteOpenHelper {

    public myDBHelper(Context context) {
        super(context, "FoodListDB", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
