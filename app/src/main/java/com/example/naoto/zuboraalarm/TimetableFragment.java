package com.example.naoto.zuboraalarm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Time;

/* TimetableFragment

時間割を表示するためのFragment

 */

public class TimetableFragment extends Fragment {
    OnTimetableListener mListener;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try {
            mListener = (OnTimetableListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_timetable, container, false);

        view.findViewById(R.id.Mon1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"月");
            }
        });
        view.findViewById(R.id.Mon2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(2,"月");
            }
        });
        view.findViewById(R.id.Mon3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(3,"月");
            }
        });
        view.findViewById(R.id.Mon4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(4,"月");
            }
        });
        view.findViewById(R.id.Mon5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(5,"月");
            }
        });
        view.findViewById(R.id.Tue1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"火");
            }
        });
        view.findViewById(R.id.Tue2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(2,"火");
            }
        });
        view.findViewById(R.id.Tue3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(3,"火");
            }
        });
        view.findViewById(R.id.Tue4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(4,"火");
            }
        });
        view.findViewById(R.id.Tue5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(5,"火");
            }
        });
        view.findViewById(R.id.Wen1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"水");
            }
        });
        view.findViewById(R.id.Wen2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(2,"水");
            }
        });
        view.findViewById(R.id.Wen3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(3,"水");
            }
        });
        view.findViewById(R.id.Wen4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(4,"水");
            }
        });
        view.findViewById(R.id.Wen5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(5,"水");
            }
        });
        view.findViewById(R.id.Thu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"木");
            }
        });
        view.findViewById(R.id.Thu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(2,"木");
            }
        });
        view.findViewById(R.id.Thu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(3,"木");
            }
        });
        view.findViewById(R.id.Thu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(4,"木");
            }
        });
        view.findViewById(R.id.Thu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(5,"木");
            }
        });
        view.findViewById(R.id.Fri1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"金");
            }
        });
        view.findViewById(R.id.Fri2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(2,"金");
            }
        });
        view.findViewById(R.id.Fri3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(3,"金");
            }
        });
        view.findViewById(R.id.Fri4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(4,"金");
            }
        });
        view.findViewById(R.id.Fri5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(5,"金");
            }
        });



        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // ここに時間割画面での処理

        /*
        DB関係の処理
        //db write
        TimetableDbHelper timetableDbHelper = new TimetableDbHelper(this.getContext());

        SQLiteDatabase db = timetableDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TimetableDBContract.timetable.COLUMN_NAME_SUBJECT, "講義名だよ");

        long newRowId = db.insert(TimetableDBContract.timetable.TABLE_NAME, null , values);

        //db read
        db = timetableDbHelper.getReadableDatabase();

        String[] projection = {
                TimetableDBContract.timetable._ID,
                TimetableDBContract.timetable.COLUMN_NAME_SUBJECT
        };

        Cursor c = db.query(
                TimetableDBContract.timetable.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );
        */
    }

    // Activityから操作するためのinterface
    public interface OnTimetableListener {
        // 時間割の枠選択時の関数
        void onClickTimetableCell(int timePeriod,String day);
    }
}
