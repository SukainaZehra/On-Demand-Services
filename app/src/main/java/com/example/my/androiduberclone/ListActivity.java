package com.example.my.androiduberclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {
ImageView idone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        idone = findViewById(R.id.id1);
        setClickListeners2();
    }

    private void setClickListeners2() {
        idone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    showFinal();
            }
        });

    }

    private void showFinal() {
        Intent intent = new Intent(this, ActivityBook.class);
        startActivity(intent);
    }
}
