package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ListActivity2 extends AppCompatActivity {
    ImageView id_four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        id_four = findViewById(R.id.id4);
        setClickListeners2();
    }

    private void setClickListeners2() {
        id_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFinal1();
            }
        });
        findViewById(R.id.btnProceed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListActivity2.this, BookingActivity.class));
            }
        });
    }

    private void showFinal1() {
        Intent intent = new Intent(this, ActivityBook2.class);
        startActivity(intent);
    }
}
