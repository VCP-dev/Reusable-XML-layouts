package com.example.uiassignment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uiassignment.Adapters.RecyclerAdapter;
import com.example.uiassignment.R;

public class ShoppingActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        recyclerView = findViewById(R.id.recylcerview);

        adapter = new RecyclerAdapter(ShoppingActivity.this,9);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ShoppingActivity.this));
        recyclerView.setAdapter(adapter);

    }
}