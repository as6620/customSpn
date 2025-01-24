package com.example.customspnlst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private Country[] country;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, Country[] country) {
        this.context = context;
        this.country = country;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return country.length;
    }

    @Override
    public Object getItem(int position) {
        return country[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_spinner, parent, false);
        }

        ImageView flag = convertView.findViewById(R.id.iV);
        TextView countryName = convertView.findViewById(R.id.namecon);
        TextView capital = convertView.findViewById(R.id.Capital);

        Country currentCountry = country[position];

        flag.setImageResource(currentCountry.getFlag());
        countryName.setText(currentCountry.getCountry());
        capital.setText(currentCountry.getCapital());

        return convertView;
    }
}
