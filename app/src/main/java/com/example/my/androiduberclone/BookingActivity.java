package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class BookingActivity extends AppCompatActivity {
    private TextView tvDisplayTime;
    private TimePicker timePicker1;
   // private Button btnChangeTime;

    private int hour;
    private int minute;

    Button sub;
    ImageView et_logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        sub = (Button) findViewById(R.id.subButton);
//        et_logout = findViewById(R.id.logout);
        setCurrentTimeOnView();
        setClickListeners1();
    }

    private void setClickListeners1() {
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    proceed();
            }
        });

//        et_logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Logout();
//            }
//        });
    }

    private void Logout() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void proceed() {
        Intent intent = new Intent(this, ActivityBook3.class);
        startActivity(intent);
    }

    //display current time
    public void setCurrentTimeOnView(){

        tvDisplayTime = (TextView) findViewById(R.id.tvTime);
        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);

        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);

        //set current time into the textView
        tvDisplayTime.setText(new StringBuilder().append((hour)).append(" : ").append((minute)));

        //set current time into the timePicker
        timePicker1.setCurrentHour(hour);
        timePicker1.setCurrentMinute(minute);
    }

    private static String pad(int c){
        if (c>=10)
            return  String.valueOf(c);
        else
            return "0"+String.valueOf(c);
    }
}
