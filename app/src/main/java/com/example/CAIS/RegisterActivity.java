package com.example.CAIS;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextConfirmPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mTextUsername=(EditText)findViewById(R.id.username);
        mTextPassword=(EditText)findViewById(R.id.pwd);
        mTextConfirmPassword=(EditText)findViewById(R.id.cnfrm_pwd);
        mButtonRegister=(Button) findViewById(R.id.button);
        mTextViewLogin=(TextView) findViewById(R.id.register);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
