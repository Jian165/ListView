package com.markcode.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner studentsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentsSpinner=findViewById(R.id.studentsSpinner);

//        ArrayList<String> students = new ArrayList<>();
//        students.add("Mark");
//        students.add("Brad");
//        students.add("Sarah");
//        students.add("Madeline");
//        students.add("Tom");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                students
//        );
//
//        studentsSpinner.setAdapter(studentsAdapter);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, studentsSpinner.getSelectedItem().toString()+" Selected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        citiesList=findViewById(R.id.citiesList);

        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Zurich");
        cities.add("New york");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("Madrid");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position)+" selected", Toast.LENGTH_SHORT).show();
            }


        });

    }
}