package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        String name = getIntent().getStringExtra("Name");
        String description = getIntent().getStringExtra("description");

        TextView txtname = findViewById(R.id.topicname);
        TextView txtdes = findViewById(R.id.topicdes);

        txtname.setText(name);
        txtdes.setText(description);

    }
}