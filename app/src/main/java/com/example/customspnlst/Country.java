package com.example.customspnlst;

import android.widget.BaseAdapter;

public class Country{
    private int flag;
    private String country;
    private String capital;
    private int population;

    public Country(int flag, String country, String capital, int population) {
        this.flag = flag;
        this.country = country;
        this.capital = capital;
        this.population = population;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFlag() {
        return flag;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }


}
