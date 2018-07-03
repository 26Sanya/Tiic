package com.sanya.yogyam.examples.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.RecyclerViewAdapter;
import Model.Exercise;
import Utils.DataInitializer;

public class ListExercisesActivity extends AppCompatActivity {

    private List<Exercise> exerciseList = new ArrayList<>();

    private RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerView;

    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);
        int smallResId = getIntent().getIntExtra("BUNDLE_IMAGE_ID", -1);
        if (smallResId == -1) {
            finish();
            return;
        }
        DataInitializer.initData(exerciseList,smallResId);
        recyclerView = (RecyclerView) findViewById(R.id.list_exercises);
        recyclerViewAdapter = new RecyclerViewAdapter(exerciseList, getBaseContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
