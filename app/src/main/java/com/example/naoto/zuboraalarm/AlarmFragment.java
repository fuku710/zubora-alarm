package com.example.naoto.zuboraalarm;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* AlarmFragment

アラーム画面のFragment

 */

public class AlarmFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_alarm, container, false);

        TextView textView = (TextView) view.findViewById(R.id.dev_text2);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this.getContext());
        String commutingTimePref = sharedPref.getString("pref_commuting_time","");

        textView.setText(commutingTimePref);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // ここにアラーム画面での処理
//
//        Calendar calendar = Calendar.getInstance();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//        TimePickerDialog dialog = new TimePickerDialog(
//                this.getContext(),
//                new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                        Log.d("Test",String.format("%02d:%02d", hourOfDay,minute));
//                    }
//                },hour,minute,true
//        );
//        dialog.show();
    }
}
