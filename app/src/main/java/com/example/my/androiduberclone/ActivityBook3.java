package com.example.my.androiduberclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityBook3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);


        findViewById(R.id.buttona).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showScreena();
            }
        });
    }

    void showScreena() {
        Toast.makeText(ActivityBook3.this, "Your booking has been confirmed", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MenuActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
