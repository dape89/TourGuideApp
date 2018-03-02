package com.dape.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dape.tourguideapp.R;
import com.dape.tourguideapp.model.Attraction;
import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(@NonNull Context context, @NonNull ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.row_attraction_fragment,parent,false);
        }
        Attraction currentAttraction = getItem(position);
        TextView attraction_name = itemView.findViewById(R.id.attraction_name);
        ImageView attraction_image = itemView.findViewById(R.id.attraction_image);
        attraction_name.setText(currentAttraction.getAttraction_name());
        attraction_image.setImageResource(currentAttraction.getAttraction_image());
        return itemView;
    }
}
