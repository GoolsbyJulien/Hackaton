package com.example.rockm.hackaton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class jobScreen extends Activity {
    Job j;
    public void setJob(Job j) {
        this.j = j;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_screen);


        TextView jobName = findViewById(R.id.job_title);
        TextView Des = findViewById(R.id.Des_box);

          Intent intent = getIntent();
        Bundle bundle = new Bundle();
            j = (Job)bundle.getSerializable("Job");

        jobName.setText(intent.getStringExtra("Name"));
        Des.setText(intent.getStringExtra("Describe"));

        Button b = findViewById(R.id.save_button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox c = findViewById(R.id.check);
                if(Favoirtes.Fav.indexOf(j) != -1 && c.isActivated())
                    Favoirtes.Fav.add(j);
                finish();
            }
        });

    }

}
