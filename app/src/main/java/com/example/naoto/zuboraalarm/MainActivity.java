package com.example.naoto.zuboraalarm;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/* MainActivity

このアクティビティーがメイン画面になります
状況に応じてTimetableFragmentとAlarmFragmentを切り替えます

 */

public class MainActivity extends AppCompatActivity {

    private Button devButton1;
    private Button devButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TimetableFragmentを開く
        TimetableFragment fragment = new TimetableFragment();
                final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragment);
                transaction.commit();
/*
        devButton1 = (Button)findViewById(R.id.dev_button1);
        devButton2 = (Button)findViewById(R.id.dev_button2);

        devButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimetableFragment fragment = new TimetableFragment();
                final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragment);
                transaction.commit();
            }
        });

        devButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlarmFragment fragment = new AlarmFragment();
                final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragment);
                transaction.commit();
            }
        });
*/

    }

    // メニューボタン作成用の関数
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    //　メニューボタン選択時の関数
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                return true;
            //開発用メニュー(画面切り替え)
            case R.id.dev_timetable:
                TimetableFragment timetablefragment = new TimetableFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container,timetablefragment)
                        .commit();
                return true;
            case R.id.dev_alarm:
                AlarmFragment alarmFragment = new AlarmFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container,alarmFragment)
                        .commit();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
