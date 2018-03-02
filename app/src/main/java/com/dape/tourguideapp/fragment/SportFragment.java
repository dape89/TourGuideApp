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

import com.dape.tourguideapp.R;
import com.dape.tourguideapp.SportDetailsActivity;
import com.dape.tourguideapp.adapter.AttractionAdapter;
import com.dape.tourguideapp.model.Attraction;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class SportFragment extends Fragment {
    private ListView lsv_sport;
    private Attraction sport;
    public SportFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item_attraction, container,false);
        final ArrayList<Attraction> sports = new ArrayList<Attraction>();
        sports.add(new Attraction(getString(R.string.football), R.drawable.football));
        sports.add(new Attraction(getString(R.string.football_five), R.drawable.football_five));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(),sports);
        lsv_sport = view.findViewById(R.id.lsv_attraction);
        lsv_sport.setAdapter(attractionAdapter);
        lsv_sport.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                sport = (Attraction) lsv_sport.getItemAtPosition(position);
                Intent intentSport = new Intent(getActivity(), SportDetailsActivity.class);
                intentSport.putExtra(getString(R.string.position), position);
                intentSport.putExtra(getString(R.string.name), sport.getAttraction_name());
                startActivity(intentSport);
            }
        });
        return view;
    }
}
