package com.dape.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import com.dape.tourguideapp.adapter.AttractionDetailsAdapter;
import com.dape.tourguideapp.model.AttractionDetails;

import java.util.ArrayList;

public class SportDetailsActivity extends AppCompatActivity {
    private int pos;
    private ListView lsvSportDetails;
    private ImageView imv_sport;
    private ArrayList<AttractionDetails> attractionDetails;
    private AttractionDetailsAdapter attractionDetailsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_details);
        init();
        chooseSport();
    }
    public void init(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        lsvSportDetails = findViewById(R.id.lsv_sport_details);
        imv_sport = (ImageView)findViewById(R.id.imv_sport);
        setTitle(getIntent().getStringExtra(getString(R.string.name)));
        pos = ((getIntent().getIntExtra(getString(R.string.position),100)));
    }
    public void arrayListFootball(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.football_stadium), getString(R.string.address_football_stadium)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        imv_sport.setImageResource(R.drawable.football_pescara);
        lsvSportDetails.setAdapter(attractionDetailsAdapter);
    }
    public void arrayListFootballFive(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.football_five_stadium), getString(R.string.address_five_football_stadium)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        imv_sport.setImageResource(R.drawable.football_five_pescara);
        lsvSportDetails.setAdapter(attractionDetailsAdapter);
    }
    public void chooseSport(){
        switch (pos){
            case 0:
                arrayListFootball();
                break;
            case 1:
                arrayListFootballFive();
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
