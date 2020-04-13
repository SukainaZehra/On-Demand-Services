package com.example.my.androiduberclone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


    findViewById(R.id.buttonc).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showScreenc();
        }
    });
}

    void showScreenc() {
        Toast.makeText(ActivityBook.this, "Your booking has been confirmed", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MenuActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
