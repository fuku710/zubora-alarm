package com.example.naoto.zuboraalarm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.naoto.zuboraalarm.TimetableDBContract.timetable;

public class TimetableDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "timetable.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_TIMETABLES =
            "CREATE TABLE " + timetable.TABLE_NAME + " (" +
                    timetable._ID + " INTERGER PRIMARY KEY," +
                    timetable.COLUMN_NAME_SUBJECT + TEXT_TYPE + COMMA_SEP +
                    timetable.COLUMN_NAME_TIME_PERIOD + INT_TYPE + COMMA_SEP +
                    timetable.COLUMN_NAME_CLASSROOM + TEXT_TYPE + COMMA_SEP +
                    timetable.COLUMN_NAME_TEACHER + TEXT_TYPE + COMMA_SEP +
                    timetable.COLUMN_NAME_MEMO + TEXT_TYPE + " )";

    private static final String SQL_DELETE_TIMETABLES = "DROP TABLE IF EXISTS " + timetable.TABLE_NAME;

    public TimetableDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREATE_TIMETABLES);
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL(SQL_DELETE_TIMETABLES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
