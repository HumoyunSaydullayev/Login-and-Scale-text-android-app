package com.example.loginandscaletext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email=findViewById(R.id.EmailAddress);
        EditText password=findViewById(R.id.Password);
        TextView erroremail=findViewById(R.id.erroremail);
        TextView errorpassword=findViewById(R.id.errorpassword);
        Button login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("Humoyun") && password.getText().toString().equals("1504")) {
                    Intent intent = new Intent(MainActivity.this, Scale_Activity.class);
                    startActivity(intent);
                    finish();
                }else if (email.getText().toString().equals("") && password.getText().toString().equals("")) {
                    erroremail.setText("*Email field empty !!!");
                    errorpassword.setText("*Password field empty !!!");
                }else if(email.getText().toString().equals("") && !password.getText().toString().equals("")){
                    erroremail.setText("*Email field empty !!!");
                    errorpassword.setText("");
                }else if(!email.getText().toString().equals("") && password.getText().toString().equals("")){
                    erroremail.setText("");
                    errorpassword.setText("*Password field empty !!!");
                }else{
                    erroremail.setText("*Error email !!!");
                    errorpassword.setText("* Error password !!!");
                }

            }
        });
    }
}