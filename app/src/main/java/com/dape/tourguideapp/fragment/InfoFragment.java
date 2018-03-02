package com.dape.tourguideapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dape.tourguideapp.adapter.InfoAdapter;
import com.dape.tourguideapp.R;
import com.dape.tourguideapp.model.Info;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class InfoFragment extends Fragment {
    public InfoFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item_attraction, container,false);
        final ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.country), getString(R.string.description_country)));
        infos.add(new Info(getString(R.string.region), getString(R.string.description_region)));
        infos.add(new Info(getString(R.string.altitude), getString(R.string.description_altitude)));
        infos.add(new Info(getString(R.string.population), getString(R.string.description_population)));
        infos.add(new Info(getString(R.string.patron_of_the_city), getString(R.string.description_patron_of_the_city)));
        infos.add(new Info(getString(R.string.patronal_feast), getString(R.string.description_patronal_feast)));
        infos.add(new Info(getString(R.string.university), getString(R.string.description_university)));
        InfoAdapter infoAdapter = new InfoAdapter(getActivity(),infos);
        final ListView lsv_info = view.findViewById(R.id.lsv_attraction);
        lsv_info.setAdapter(infoAdapter);
        return view;
    }
}
