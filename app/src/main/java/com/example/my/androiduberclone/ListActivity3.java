package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ListActivity3 extends AppCompatActivity {
    ImageView id_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        id_two = findViewById(R.id.id2);
        setClickListeners2();
    }

    private void setClickListeners2() {
        id_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFinal2();
            }
        });

        findViewById(R.id.btnProceed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListActivity3.this, BookingActivity.class));
            }
        });
    }

    private void showFinal2() {
        Intent intent = new Intent(this, ActivityBook3.class);
        startActivity(intent);
    }
}
