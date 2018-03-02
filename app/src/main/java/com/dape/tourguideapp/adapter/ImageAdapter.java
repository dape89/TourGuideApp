package com.dape.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.dape.tourguideapp.R;
import com.dape.tourguideapp.model.Image;

import java.util.ArrayList;

/**
 * Created by Danale on 27/02/2018.
 */

public class ImageAdapter extends ArrayAdapter<Image> {
    public ImageAdapter(@NonNull Context context, @NonNull ArrayList<Image> images) {
        super(context, 0, images);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.row_image_fragment,parent,false);
        }
        Image currentImage = getItem(position);
        ImageView imv_city = itemView.findViewById(R.id.imv_city);
        imv_city.setImageResource(currentImage.getImage_city());
        return itemView;
    }
}
