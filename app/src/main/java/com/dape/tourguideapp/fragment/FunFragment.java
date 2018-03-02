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

import com.dape.tourguideapp.FunDetailsActivity;
import com.dape.tourguideapp.R;
import com.dape.tourguideapp.adapter.AttractionAdapter;
import com.dape.tourguideapp.model.Attraction;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class FunFragment extends Fragment {
    private ListView lsv_fun;
    private Attraction fun;
    public FunFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item_attraction, container,false);
        final ArrayList<Attraction> funs = new ArrayList<Attraction>();
        funs.add(new Attraction(getString(R.string.cinema), R.drawable.cinema));
        funs.add(new Attraction(getString(R.string.theater), R.drawable.theater));
        funs.add(new Attraction(getString(R.string.nightlife), R.drawable.nightlife));
        AttractionAdapter funAdapter = new AttractionAdapter(getActivity(),funs);
        lsv_fun = view.findViewById(R.id.lsv_attraction);
        lsv_fun.setAdapter(funAdapter);
        lsv_fun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                fun = (Attraction) lsv_fun.getItemAtPosition(position);
                Intent intentFun = new Intent(getActivity(), FunDetailsActivity.class);
                intentFun.putExtra(getString(R.string.position), position);
                intentFun.putExtra(getString(R.string.name), fun.getAttraction_name());
                startActivity(intentFun);
            }
        });
        return view;
    }
}
