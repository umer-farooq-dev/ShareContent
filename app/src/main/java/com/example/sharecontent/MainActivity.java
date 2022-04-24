package com.example.sharecontent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name, regno;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.sumbitBtn);
        name = findViewById(R.id.nameEditText);
        regno = findViewById(R.id.regEditText);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String r = regno.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondApp.class);
                intent.putExtra("nameUser", n);
                intent.putExtra("regnoUser", r);

                startActivity(intent);

            }
        });
    }
}