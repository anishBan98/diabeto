package com.example.lenovo.diabeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button registerButton;
    private Button loginButtonLink;
    private EditText name;
    private EditText age;
    private EditText mail;
    private EditText mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Register");

        registerButton = (Button) findViewById(R.id.btnRegister);
        loginButtonLink = (Button) findViewById(R.id.btnLinkToLoginScreen);
        name = (EditText) findViewById(R.id.name);
        age = (EditText)findViewById(R.id.age);
        mail = (EditText)findViewById(R.id.email);
        mobile = (EditText)findViewById(R.id.mobile);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_str = name.getText().toString();
                String age_str = age.getText().toString();
                String mail_str = mail.getText().toString();
                String mobile_str = mobile.getText().toString();
                //volley code.
                //progress bar...
                Toast.makeText(RegisterActivity.this,"Registered Successfully! Mobile number is your Password", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        loginButtonLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
