package com.example.covidnotifier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ViewCurrentListActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    String s1[];
    String s2[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_daily);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.guests);
        s2 = getResources().getStringArray((R.array.form_of_contact));

        recycleAdapter dailyAdapter = new recycleAdapter(this, s1, s2);
        recyclerView.setAdapter(dailyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
