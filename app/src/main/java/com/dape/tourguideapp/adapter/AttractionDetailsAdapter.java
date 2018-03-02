package com.dape.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.dape.tourguideapp.R;
import com.dape.tourguideapp.model.AttractionDetails;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class AttractionDetailsAdapter extends ArrayAdapter<AttractionDetails> {
    public AttractionDetailsAdapter(@NonNull Context context, @NonNull ArrayList<AttractionDetails> attractionDetails) {
        super(context, 0, attractionDetails);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.row_attraction_details,parent,false);
        }
        AttractionDetails attractionDetails = getItem(position);
        TextView text_name = itemView.findViewById(R.id.name);
        TextView text_address = itemView.findViewById(R.id.address);
        text_name.setText(attractionDetails.getName());
        text_address.setText(attractionDetails.getAddress());
        return itemView;
    }
}
