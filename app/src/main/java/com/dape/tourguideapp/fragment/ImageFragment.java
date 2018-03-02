package com.dape.tourguideapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dape.tourguideapp.R;
import com.dape.tourguideapp.adapter.ImageAdapter;
import com.dape.tourguideapp.model.Image;

import java.util.ArrayList;

/**
 * Created by Danale on 27/02/2018.
 */

public class ImageFragment extends Fragment {
    public ImageFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_item_image, container,false);
        final ArrayList<Image> images = new ArrayList<Image>();
        images.add(new Image(R.drawable.pescara));
        images.add(new Image(R.drawable.pescara2));
        images.add(new Image(R.drawable.pescara3));
        images.add(new Image(R.drawable.pescara4));
        ImageAdapter imageAdapter = new ImageAdapter(getActivity(),images);
        final ListView lsv_imv = view.findViewById(R.id.lsv_imv_city);
        lsv_imv.setAdapter(imageAdapter);
        return view;
    }
}
