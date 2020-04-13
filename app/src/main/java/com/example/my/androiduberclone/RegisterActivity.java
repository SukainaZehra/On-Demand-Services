package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText etFname;
    EditText etLname;
    EditText etEmail;
    EditText etPass;
    EditText etPhone;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);
        intializeFields1();
        setClickListeners();
    }

    private void intializeFields1() {
        etFname = findViewById(R.id.fname);
        etLname = findViewById(R.id.lname);
        etEmail = findViewById(R.id.email);
        etPass = findViewById(R.id.pass);
        etPhone = findViewById(R.id.phno);
        btnSubmit = findViewById(R.id.submit);
    }

    private void setClickListeners() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(checkDataEntered())
                   showLogin();
            }
        });

    }

    private void showLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    boolean isEmail(EditText text){
        CharSequence str = text.getText().toString();
        return (!TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches());
    }

    boolean isEmpty(EditText text){
        CharSequence str1 = text.getText().toString();
        return TextUtils.isEmpty(str1);
    }


    boolean checkDataEntered() {
        if(isEmpty(etFname)){
            Toast t = Toast.makeText(this, "Please Type FirstName", Toast.LENGTH_SHORT);
            t.show();
            return false;
        }

        if(isEmpty(etLname)){
            etLname.setError("Lastname is Required!");
            return false;
        }

        if(isEmail(etEmail)==false){
            etEmail.setError("Enter Valid Email!");
            return false;
        }

        if(isEmpty(etPass)){
            etPass.setError("Password is Required!");
            return false;
        }

        return true;
    }
}