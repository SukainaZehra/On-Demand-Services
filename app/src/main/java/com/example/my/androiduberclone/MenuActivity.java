package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView pro;
    ImageView pro2;
    ImageView pro3;
    ImageView pro4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        pro = findViewById(R.id.tchr);
        pro2 = findViewById(R.id.mech);
        pro3 = findViewById(R.id.ele);
        pro4 = findViewById(R.id.tutor);
        setClickListeners();
    }

    void setClickListeners() {
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBooking();
            }
        });

        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBooking2();
            }
        });

        pro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBooking3();
            }
        });

        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBooking();
            }
        });


    }

    private void showBooking3() {
        Intent intent = new Intent(this, ListActivity3.class);
        startActivity(intent);
    }

    private void showBooking2() {
        Intent intent = new Intent(this, ListActivity2.class);
        startActivity(intent);
    }


    private void showBooking() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
