package com.dape.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.dape.tourguideapp.adapter.AttractionDetailsAdapter;
import com.dape.tourguideapp.model.AttractionDetails;

import java.util.ArrayList;

public class FoodDetailsActivity extends AppCompatActivity {
    private int pos;
    private ListView lsvFoodDetails;
    private ArrayList<AttractionDetails> attractionDetails;
    private AttractionDetailsAdapter attractionDetailsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        init();
        chooseFood();
    }
    public void init(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        lsvFoodDetails = findViewById(R.id.lsv_food_details);
        setTitle(getIntent().getStringExtra(getString(R.string.name)));
        pos = ((getIntent().getIntExtra(getString(R.string.position),100)));
    }
    public void arrayListPizzeria(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.pizzeria_one), getString(R.string.address_pizzeria_one)));
        attractionDetails.add(new AttractionDetails(getString(R.string.pizzeria_two), getString(R.string.address_pizzeria_two)));
        attractionDetails.add(new AttractionDetails(getString(R.string.pizzeria_three), getString(R.string.address_pizzeria_three)));
        attractionDetails.add(new AttractionDetails(getString(R.string.pizzeria_four), getString(R.string.address_pizzeria_four)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        lsvFoodDetails.setAdapter(attractionDetailsAdapter);
    }
    public void arrayListRestaurant(){
        attractionDetails = new ArrayList<AttractionDetails>();
        attractionDetails.add(new AttractionDetails(getString(R.string.restaurant_one), getString(R.string.address_restaurant_one)));
        attractionDetails.add(new AttractionDetails(getString(R.string.restaurant_two), getString(R.string.address_restaurant_two)));
        attractionDetails.add(new AttractionDetails(getString(R.string.restaurant_three), getString(R.string.address_restaurant_three)));
        attractionDetails.add(new AttractionDetails(getString(R.string.restaurant_four), getString(R.string.address_restaurant_four)));
        attractionDetailsAdapter = new AttractionDetailsAdapter(this, attractionDetails);
        lsvFoodDetails.setAdapter(attractionDetailsAdapter);
    }
    public void chooseFood(){
        switch (pos){
            case 0:
                arrayListPizzeria();
                break;
            case 1:
                arrayListRestaurant();
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
