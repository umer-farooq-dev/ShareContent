package com.example.sharecontent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondApp extends AppCompatActivity {

    TextView nameTextView,regnoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_app);

        nameTextView = findViewById(R.id.nameText);
        regnoTextView = findViewById(R.id.regText);

        String username = getIntent().getStringExtra("nameUser");
        String userregno = getIntent().getStringExtra("regnoUser");

        nameTextView.setText(username);
        regnoTextView.setText(userregno);
    }
}