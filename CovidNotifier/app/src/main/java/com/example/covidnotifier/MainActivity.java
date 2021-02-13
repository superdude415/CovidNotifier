package com.example.covidnotifier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addRecord(View view){
        Intent intent = new Intent(this, AddRecordActivity.class);
        startActivity(intent);
    }

    public void viewDaily(View view){
        Intent intent = new Intent(this, ViewCurrentListActivity.class);
        startActivity(intent);
    }

    public void viewPast(View view){
        Intent intent = new Intent(this, ViewPastListsActivity.class);
        startActivity(intent);
    }
}