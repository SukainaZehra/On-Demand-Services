package com.example.my.androiduberclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;

public class LoginActivity extends Activity {

    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signin);
        initializeFields();
        setClickListener();
    }

    void initializeFields() {
        etUsername = findViewById(R.id.et_user_name);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_submit);
    }

    void setClickListener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginActivity.this, etPassword.getText(),Toast.LENGTH_SHORT).show();

                if(areFieldsValid())
                    showScreen();
            }
        });

    }

    void onLogin() {
        UserService service = RetrofitClient.getClient().create(UserService.class);
        Call<APIResponse> call = service.loginUser(etUsername.getText().toString(), etPassword.getText().toString());
        call.enqueue(new Callback<APIResponse>() {
            @Override
            public void onResponse(Call<APIResponse> call, retrofit2.Response<APIResponse> response) {
                String message = response.body() == null ? "Some error occured" : response.body().message;
                Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
                showScreen();
            }

            @Override
            public void onFailure(Call<APIResponse> call, Throwable t) {
                if(t != null)
                    Toast.makeText(LoginActivity.this, "Error Occured", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void showScreen() {
        Intent intent = new Intent(this, LocationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
//2.edited
    //boolean isEmpty(EditText text){
   //     CharSequence str = text.getText().toString();
      //  return TextUtils.isEmpty(str);
    //}

//void areFieldsValid()
//{
  //  if (isEmpty(etUsername)){
    //    Toast t = Toast.makeText(this,"Please fill the required field", Toast.LENGTH_SHORT);
      //  t.show();
    //}
//}

    boolean areFieldsValid() {
        if(TextUtils.isEmpty(etUsername.getText().toString()))
        { Toast t = Toast.makeText(this,"Please fill the Username field", Toast.LENGTH_SHORT);
        t.show();
            return false;}
        if(TextUtils.isEmpty(etPassword.getText().toString()))
        { Toast t = Toast.makeText(this,"Please fill the Password field", Toast.LENGTH_SHORT);
            t.show();
            return false;}
        return true;
    }
}
