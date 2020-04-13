package com.example.my.androiduberclone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn, btnRegister;
    RelativeLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init View
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        rootLayout = (RelativeLayout) findViewById(R.id.rootLayout);


        //event
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRegister();
            }
        });

        //event
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLogin();
            }
        });

    }
     //private void showRegisterDialog() {
        //AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        //dialog.setTitle("REGISTER ");
       // dialog.setMessage("Please Fill Following Fields To Register");
         //LayoutInflater inflater = getLayoutInflater();
         // Inflate and set the layout for the dialog
         // Pass null as the parent view because its going in the dialog layout
         //dialog.setView(inflater.inflate(R.layout.layout_register, null));

         /*View register_layout = inflater.inflate(R.layout.layout_register,null);*/

        /* final /*MaterialEditText*/ //edtEmail = register_layout.findViewById(R.id.edtEmail);*/

         //dialog.setView(layout_register);

         //set button
         //dialog.setPositiveButton("REGISTER", new DialogInterface.OnClickListener() {
            // @Override
            // public void onClick(DialogInterface dialog, int which) {

                // dialog.dismiss();

                 //check validation
//                 if(TextUtils.isEmpty(edtEmail.getText().toString()))
//                 { Snackbar.make(rootLayout,"Please enter email address",Snackbar.LENGTH_SHORT).show();
//                 return;
//                 }


            // }
        // }
        // );

         //dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
             //@Override
             //public void onClick(DialogInterface dialog, int i) {
                // dialog.dismiss();
             //}
         //});
        // dialog.show();
   //  }

    private void showLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void showRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
