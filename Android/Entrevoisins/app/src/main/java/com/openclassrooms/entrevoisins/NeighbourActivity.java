package com.openclassrooms.entrevoisins;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.model.Neighbour;

public class NeighbourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neighbour);

        // Retrieve "neighbour" form intent
        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Retrieve XML
        ImageView neighbourImage = findViewById(R.id.neighbourImage);
        TextView texViewNeighbourName = findViewById(R.id.neighbourName);
        TextView textViewNeighbourNameOnImage = findViewById(R.id.neighbourNameOnImage);
        ImageView backButton = findViewById(R.id.backbutton);

        // Set neighbour image
        String photoUrl = neighbour.getAvatarUrl();
        Glide.with(getApplicationContext())
                .load(photoUrl)
                .into(neighbourImage);

        // Set neighbour image
        texViewNeighbourName.setText(neighbour.getName());
        // Set name of neighbour on image
        textViewNeighbourNameOnImage.setText(neighbour.getName());

        // Retrive XML floating button and set onClick Listener
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Retrive XML button and set onClick Listener
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NeighbourActivity.super.onBackPressed();
            }
        });
    }
}