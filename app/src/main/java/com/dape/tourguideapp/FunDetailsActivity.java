package com.dape.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.dape.tourguideapp.adapter.AttractionDetailsAdapter;
import com.dape.tourguideapp.model.AttractionDetails;

import java.util.ArrayList;

public class FunDetailsActivity extends AppCompatActivity {
    private int pos;
    private ListView lsvFunDetails;
    private ArrayList<AttractionDetails> attractionDetails;
    private AttractionDetailsAdapter attractionDetailsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_details);
        init();
        chooseFun();
    }
    public void init(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        lsvFunDetails = findViewById(R.id.lsv_fun_details);
        setTitle(getIntent().getStringExtra(getString(R.string.name)));
        pos = ((getIntent().getIntExtra(getString(R.string.position),100)));
    }
    public void arrayListCinema(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.cinema_one), getString(R.string.address_cinema_one)));
        attractionDetails.add(new AttractionDetails(getString(R.string.cinema_two), getString(R.string.address_cinema_two)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        lsvFunDetails.setAdapter(attractionDetailsAdapter);
    }
    public void arrayListTheater(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.theater_one), getString(R.string.address_theater_one)));
        attractionDetails.add(new AttractionDetails(getString(R.string.theater_two), getString(R.string.address_theater_two)));
        attractionDetails.add(new AttractionDetails(getString(R.string.theater_three), getString(R.string.address_theater_three)));
        attractionDetails.add(new AttractionDetails(getString(R.string.theater_four), getString(R.string.address_theater_four)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        lsvFunDetails.setAdapter(attractionDetailsAdapter);
    }
    public void arrayListNightlife(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.nightlife_one), getString(R.string.address_nightlife_one)));
        attractionDetails.add(new AttractionDetails(getString(R.string.nightlife_two), getString(R.string.address_nightlife_two)));
        attractionDetails.add(new AttractionDetails(getString(R.string.nightlife_three), getString(R.string.address_nightlife_three)));
        attractionDetails.add(new AttractionDetails(getString(R.string.nightlife_four), getString(R.string.address_nightlife_four)));
        attractionDetails.add(new AttractionDetails(getString(R.string.nightlife_five), getString(R.string.address_nightlife_five)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        lsvFunDetails.setAdapter(attractionDetailsAdapter);
    }
    public void chooseFun(){
        switch (pos){
            case 0:
                arrayListCinema();
                break;
            case 1:
                arrayListTheater();
                break;
            case 2:
                arrayListNightlife();
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
    return super.onOptionsItemSelected(item);
    }
}
