package com.example.my.androiduberclone;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.MonthDay;
import java.util.Calendar;

public class TryBookingActivity extends AppCompatActivity {
 private TextView tvDisplayDate;
 private DatePicker dpResult;
 private Button btnChangeDate;

 private int year;
 private int month;
 private int day;

 static final int DATE_DIALOG_ID = 999;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.try_booking);

     setCurrentDateOnView();
     addListnerOnButton();
    }
    //display current date
    public void setCurrentDateOnView(){

     tvDisplayDate = (TextView) findViewById(R.id.tvDate);
     dpResult = (DatePicker) findViewById(R.id.dpResult);

      final Calendar c = Calendar.getInstance();
      year = c.get(Calendar.YEAR);
      month = c.get(Calendar.MONTH);
      day = c.get(Calendar.DAY_OF_MONTH);

      //set current date into textview
        tvDisplayDate.setText(new StringBuilder()

        //Month is 0 based,just add 1
        .append(month+1).append("-").append(day).append("-").append(year).append(" "));

        //set current date into date picker
        dpResult.init(year,month,day,null);

    }

    public void addListnerOnButton(){

     btnChangeDate = (Button)
             findViewById(R.id.btnChangeDate);

     btnChangeDate.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             showDialog(DATE_DIALOG_ID);
         }
     });
    }
    //@Override
  // protected Dialog onCreate
    //incomplete
}
