package com.example.uiassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int[] imageids = {R.drawable.mail,R.drawable.small_cuboid,R.drawable.shopping_bag,R.drawable.large_cube,R.drawable.gift};

    GridView gridView;

    ImageView location;
    ImageView shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        location = findViewById(R.id.location);
        shopping = findViewById(R.id.shopping);

        MainAdapter adapter = new MainAdapter(MainActivity.this,imageids);
        gridView.setAdapter(adapter);


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SendActivity.class));
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ShoppingActivity.class));
            }
        });

    }
}