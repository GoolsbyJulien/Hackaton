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

public class Carrer extends AppCompatActivity {
    private double total_hours;

    private ArrayList<Job> comJobs = new ArrayList<>();

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.created);
        createJobs();


        list = (ListView) findViewById(R.id.listVeiw);

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

        comJobs.add(new Job("McDonalds","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("Starbucks ","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Barista"));
        comJobs.add(new Job("School","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Substitute teacher"));
        comJobs.add(new Job("Pizza hut","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));



    }}