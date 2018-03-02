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
import com.dape.tourguideapp.model.Info;

import java.util.ArrayList;

/**
 * Created by Danale on 26/02/2018.
 */

public class InfoAdapter extends ArrayAdapter<Info> {
    public InfoAdapter(@NonNull Context context, ArrayList<Info> infos) {
        super(context, 0, infos);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.row_info_fragment,parent,false);
        }
        Info currentInfo = getItem(position);
        TextView name = itemView.findViewById(R.id.name);
        TextView description = itemView.findViewById(R.id.description);
        name.setText(currentInfo.getName_description());
        description.setText(currentInfo.getDescription());
        return itemView;
    }
}
