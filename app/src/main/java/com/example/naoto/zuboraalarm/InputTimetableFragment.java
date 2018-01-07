package com.example.naoto.zuboraalarm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* InputTimeTableFragment

各時限に講義の情報を入力するためのFragment

 */

public class InputTimetableFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_input_timetable, container, false);

        Bundle bundle = getArguments();
        int timePeriod = bundle.getInt("time_period");
        String day = bundle.getString("day");
        TextView timetableText = (TextView) view.findViewById(R.id.timetable_text);
        timetableText.setText(day + "曜" + String.valueOf(timePeriod) + "限");

        return view;
    }

    @Override
    public void onCreate(Bundle savedStateInstance) {
        super.onCreate(savedStateInstance);
    }



}
