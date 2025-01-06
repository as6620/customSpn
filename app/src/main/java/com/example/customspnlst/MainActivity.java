package com.example.customspnlst;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spin;
    TextView tV;
    Country[] country = new Country[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.spin);
        tV = findViewById(R.id.tV);

        country[0] = new Country(R.drawable.isr_flag, "Israel", "Jerusalem", 12000000);
        country[1] = new Country(R.drawable.italy_flag, "Italy", "Rome", 60200000);
        country[2] = new Country(R.drawable.frace_flag, "France", "Paris", 67000000);
        country[3] = new Country(R.drawable.canada_flag, "Canada", "Ottawa", 38000000);
        country[4] = new Country(R.drawable.japan_flag, "Japan", "Tokyo", 126000000);
        country[5] = new Country(R.drawable.russia_flag, "Russia", "Moscow", 144000000);
        country[6] = new Country(R.drawable.egypt_flag, "Egypt", "Cairo", 104000000);

        spin.setOnItemSelectedListener(this);

        CustomAdapter adp = new CustomAdapter(this, country);
        spin.setAdapter(adp);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Country selectedCountry = country[position];
        tV.setText("Country Name: " + selectedCountry.getCountry() +
                "\nCapital City: " + selectedCountry.getCapital() +
                "\nPopulation: " + selectedCountry.getPopulation());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tV.setText("");
    }
}
