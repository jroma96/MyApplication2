package com.example.obed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] names = {"Maad City", "Business", "Africa", "Ayer", "Solos", "Fuel", "Master of Puppets", "Fade to Black", "Run to the Hills", "smells like teen spirit", "summer breeze", "heart-shaped Box"};
    Double[] time = {3.4, 2.2, 3.1, 4.2, 5.4, 1.2, 2.4, 2.1, 3.6, 2.9, 3.2, 5.2};
    ArrayList<String> listas = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView_canciones = findViewById(R.id.listView_canciones);
        ListView listView_listas = findViewById(R.id.listView_listas);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.main, names);
        listView_canciones.setAdapter(adapter);
    }
}