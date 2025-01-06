package com.example.customspnlst;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spin;
    TextView tV;
    Country[] country = new Country[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = (Spinner) findViewById(R.id.spin);
        tV = (TextView) findViewById(R.id.tV);

        country[0] = new Country(R.drawable.isrFlag, "Israel", "Jerusalem", 12000000);
        country[1] = new Country(R.drawable.italyFlag, "Italy", "Rome", 331000000);
        country[2] = new Country(R.drawable.fraceFlag, "France", "Paris", 67000000);
        country[3] = new Country(R.drawable.canadaFlag, "Canada", "Ottawa", 83000000);
        country[4] = new Country(R.drawable.japanFlag, "Japan", "Tokyo", 3000000);
        country[5] = new Country(R.drawable.russiaFlag, "Russia", "Moscow", 4000000);
        country[6] = new Country(R.drawable.egyptFlag, "Egypt", "Cairo", 3000000);
    }
}