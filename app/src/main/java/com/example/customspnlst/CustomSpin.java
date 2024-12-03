package com.example.customspnlst;

import android.widget.BaseAdapter;

public class CustomSpin extends BaseAdapter{
    private int[] images;
    private String country;
    private String capital;

    public CustomSpin(int[] images, String[] country, String[] capital) {
        this.images = images;
        this.country = country;
        this.capital = capital;
    }
}
