package com.renton.renton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button Continuebtn,Gmailbtn,Fbbtn;
    TextView ContinueOwner;

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Continuebtn = findViewById(R.id.continuebtn);
        Gmailbtn = findViewById(R.id.continueGmail);
        Fbbtn = findViewById(R.id.continueFacebook);
        ContinueOwner = findViewById(R.id.continueOwner);
        userInput = findViewById(R.id.pnInput);

        Continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userInput.getText().equals("")) {
                    Toast.makeText(Login.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        Gmailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userInput.getText().equals("")) {
                    Toast.makeText(Login.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        Fbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userInput.getText().equals("")) {
                    Toast.makeText(Login.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        ContinueOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, OwnerLogin.class);
                startActivity(intent);
            }
        });
    }
}