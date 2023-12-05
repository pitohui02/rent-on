package com.renton.renton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.IOException;

public class OwnerLogin extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;
    private ImageButton imageButton;

    Button signupBtn, continueBtn;
    EditText pnInput, unInput, pwInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_login);

        signupBtn = findViewById(R.id.signup);
        continueBtn  = findViewById(R.id.continuebtn);
        pnInput = findViewById(R.id.pnInput);
        unInput = findViewById(R.id.unInput);
        pwInput = findViewById(R.id.pwInput);
        imageButton = findViewById(R.id.docImBtn);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pnInput.getText().equals("")) {
                    Toast.makeText(OwnerLogin.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(OwnerLogin.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (unInput.getText().equals("") || pwInput.getText().equals("")) {
                    Toast.makeText(OwnerLogin.this, "Empty Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(OwnerLogin.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void onImageButtonClick(View view) {
        // Open the gallery to select an image
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri selectedImageUri = data.getData();

            // Set the selected image to the ImageButton
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImageUri);
                imageButton.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}