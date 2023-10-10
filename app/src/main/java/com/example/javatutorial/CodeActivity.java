package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        String name = getIntent().getStringExtra("Name");
        String description = getIntent().getStringExtra("description");
        String code = getIntent().getStringExtra("code");

        TextView txtname = findViewById(R.id.topicname);
        TextView txtdes = findViewById(R.id.topicdes);
        TextView txtdcode = findViewById(R.id.topicdes);

        txtname.setText(name);
        txtdes.setText(description);
        txtdcode.setText(code);
    }
}