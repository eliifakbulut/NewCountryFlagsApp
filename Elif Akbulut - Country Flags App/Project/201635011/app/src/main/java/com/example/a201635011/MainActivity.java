package com.example.a201635011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Bundle extras = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tutorialButtonClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(intent);
    }


    public void startButtonClick(View v) {
        EditText userNameEditText = findViewById(R.id.userNameEditText);
        RadioButton test1 = findViewById(R.id.radioButton);
        RadioButton test2 = findViewById(R.id.radioButton2);

        if (userNameEditText.getText().length() > 0) {
            if (test1.isChecked() || test2.isChecked()) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                extras.putString("userName", userNameEditText.getText().toString());
                if (test1.isChecked()) {
                    extras.putInt("testNumber", 1);
                } else {
                    extras.putInt("testNumber", 2);
                }
                intent.putExtras(extras);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Make a test selection", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Username must be filled in", Toast.LENGTH_SHORT).show();
        }
    }
}
