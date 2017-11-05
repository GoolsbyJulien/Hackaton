package com.example.rockm.hackaton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class jobScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView jobName = findViewById(R.id.job_title);
        TextView Des = findViewById(R.id.Des_box);

          Intent intent = getIntent();

        jobName.setText(intent.getStringExtra("Name"));
        Des.setText(intent.getStringExtra("Describe"));



    }

}
