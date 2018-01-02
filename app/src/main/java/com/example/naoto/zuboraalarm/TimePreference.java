package com.example.naoto.zuboraalarm;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TimePicker;

public class TimePreference extends DialogPreference {

    private TimePicker timePicker;

    public TimePreference(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    @Override
    protected View onCreateDialogView(){
        timePicker = new TimePicker(this.getContext());
        timePicker.setIs24HourView(true);
        return timePicker;
    }
}
