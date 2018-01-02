package com.example.naoto.zuboraalarm;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        view.findViewById(R.id.dev_input_timetable_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickTimetableCell(1,"Tue");
            }
        });

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // ここに時間割画面での処理
    }

    // Activityから操作するためのinterface
    public interface OnTimetableListener {
        // 時間割の枠選択時の関数
        void onClickTimetableCell(int timePeriod,String day);
    }
}
