package com.example.ashis.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ashis on 10/7/2016.
 */
public class infoAdapter extends ArrayAdapter<infoClass> {
    private int mcolorResource;

    public infoAdapter(Activity context, ArrayList<infoClass> resource, int colorRsrcId) {
        super(context, 0, resource);
        mcolorResource = colorRsrcId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout_screen, parent, false);
        }
        final infoClass currentInfoClass = getItem(position);
        ImageView logoImage = (ImageView) listView.findViewById(R.id.img_logo);
        logoImage.setImageResource(currentInfoClass.getmImageResource());
        TextView headerText = (TextView) listView.findViewById(R.id.heading);
        headerText.setText(currentInfoClass.getMheading());
        TextView addresText = (TextView) listView.findViewById(R.id.address);
        addresText.setText(currentInfoClass.getmAddress());
        TextView dateText = (TextView) listView.findViewById(R.id.date);
        if (dateText.toString().isEmpty()) {
            dateText.setVisibility(View.INVISIBLE);
        } else {
            dateText.setText(currentInfoClass.getmDate());
        }
        View textContainer = listView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), mcolorResource);
        textContainer.setBackgroundColor(color);
        return listView;
    }
}
