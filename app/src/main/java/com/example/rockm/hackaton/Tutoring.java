package com.example.rockm.hackaton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Tutoring extends AppCompatActivity {

    private double total_hours;

    private ArrayList<Job> comJobs = new ArrayList<>();

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.created);
        createJobs();


        list = (ListView) findViewById(R.id.listview);

        AdapterViewCustom adapter = new AdapterViewCustom(this, comJobs);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent,
                                    View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        comJobs.get(position).getName(), Toast.LENGTH_LONG).show();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }public void createJobs() {





    }}