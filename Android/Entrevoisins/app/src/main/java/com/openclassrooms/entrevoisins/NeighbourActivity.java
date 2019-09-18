package com.openclassrooms.entrevoisins;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.model.Neighbour;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NeighbourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve "neighbour" form intent
        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");

        setContentView(R.layout.activity_neighbour);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView neighbourImage = findViewById(R.id.neighbourImage);
        TextView texViewNeighbourName = findViewById(R.id.neighbourName);
        TextView textViewNeighbourNameOnImage = findViewById(R.id.neighbourNameOnImage);
        ImageView backButton = findViewById(R.id.backbutton);

        String photoUrl = neighbour.getAvatarUrl();

        Glide.with(getApplicationContext())
                .load(photoUrl)
                .into(neighbourImage);

        texViewNeighbourName.setText(neighbour.getName());
        textViewNeighbourNameOnImage.setText(neighbour.getName());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // NeighbourActivity.super.onBackPressed();
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NeighbourActivity.super.onBackPressed();
            }
        });
    }
}