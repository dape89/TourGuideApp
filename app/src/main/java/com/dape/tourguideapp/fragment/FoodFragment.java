package com.dape.tourguideapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dape.tourguideapp.FoodDetailsActivity;
import com.dape.tourguideapp.R;
import com.dape.tourguideapp.adapter.AttractionAdapter;
import com.dape.tourguideapp.model.Attraction;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class FoodFragment extends Fragment {
    private ListView lsv_food;
    private Attraction food;
    public FoodFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item_attraction, container,false);
        final ArrayList<Attraction> foods = new ArrayList<Attraction>();
        foods.add(new Attraction(getString(R.string.pizzeria), R.drawable.pizzeria));
        foods.add(new Attraction(getString(R.string.restaurant), R.drawable.restaurant));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(),foods);
        lsv_food = view.findViewById(R.id.lsv_attraction);
        lsv_food.setAdapter(attractionAdapter);
        lsv_food.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                food = (Attraction) lsv_food.getItemAtPosition(position);
                Intent intentFood = new Intent(getActivity(), FoodDetailsActivity.class);
                intentFood.putExtra(getString(R.string.position), position);
                intentFood.putExtra(getString(R.string.name), food.getAttraction_name());
                startActivity(intentFood);
            }
        });
        return view;
    }
}
