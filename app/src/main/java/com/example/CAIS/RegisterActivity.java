package com.example.CAIS;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    private static final String KeyTitle="title";
    private static final String Value="value";

    private FirebaseFirestore db =FirebaseFirestore.getInstance();
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mnamw;
    EditText mmob;
    EditText mTextConfirmPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mmob=(EditText)findViewById(R.id.mobile);
        mnamw=(EditText)findViewById(R.id.name);
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
    void save(View v)
    {
        String uname=mTextUsername.getText().toString();
        String name=mnamw.getText().toString();
        String pass=mTextPassword.getText().toString();
        String mob =mmob.getText().toString();

        Map<String,Object> rec=new HashMap<>();

    }
}
