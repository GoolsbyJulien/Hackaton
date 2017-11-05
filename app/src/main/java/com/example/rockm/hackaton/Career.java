package com.example.rockm.hackaton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class Career extends Activity {
    private double total_hours;

    private ArrayList<Job> comJobs = new ArrayList<>();

    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.created);
        createJobs();


        AdapterView.OnItemClickListener  myListViewClicked;

        final AdapterViewCustom adapter = new AdapterViewCustom(this, comJobs);
        list = (ListView) findViewById(R.id.listVeiw);

        list.setAdapter(adapter);

      myListViewClicked = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Career.this, "Clicked at positon = " + position, Toast.LENGTH_SHORT).show();

            }
        };
        list.setOnItemClickListener(  myListViewClicked );

    }




public void open(Job j) {
        Intent i = new Intent(this,jobScreen.class);


        i.putExtra("Name", j.getName());
        i.putExtra("Describe",j.getDescription());
        startActivity(i);

    }


    public void createJobs() {

        comJobs.add(new Job("McDonalds","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("Starbucks ","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Barista"));
        comJobs.add(new Job("School","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Substitute teacher"));
        comJobs.add(new Job("Pizza hut","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("McDonalds","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("Starbucks ","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Barista"));
        comJobs.add(new Job("School","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Substitute teacher"));
        comJobs.add(new Job("Pizza hut","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("McDonalds","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));
        comJobs.add(new Job("Starbucks ","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Barista"));
        comJobs.add(new Job("School","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Substitute teacher"));
        comJobs.add(new Job("Pizza hut","29$ per hour", "Kansas city", "test@gmail.com","111-111-111" ,"Manager"));


    }}