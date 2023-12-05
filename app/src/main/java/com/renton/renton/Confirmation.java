package com.renton.renton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Button continueBtn = findViewById(R.id.continuebtn);
        EditText inputPIN = findViewById(R.id.pinInput);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputPIN.getText().equals("")) {
                    Toast.makeText(Confirmation.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Confirmation.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });

    }

}