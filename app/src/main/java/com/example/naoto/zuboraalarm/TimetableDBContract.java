package com.example.naoto.zuboraalarm;

import android.provider.BaseColumns;

public final class TimetableDBContract {
    private TimetableDBContract(){}

    public static class timetable implements BaseColumns{
        public static final String TABLE_NAME = "timetable";
        public static final String COLUMN_NAME_SUBJECT = "subject";
        public static final String COLUMN_NAME_TIME_PERIOD = "time_period";
        public static final String COLUMN_NAME_CLASSROOM = "classroom";
        public static final String COLUMN_NAME_TEACHER = "teacher";
        public static final String COLUMN_NAME_MEMO = "memo";
    }
}
