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
import android.widget.ImageView;

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

        // TODO : set neighbour image in background

        String photoUrl = neighbour.getAvatarUrl();

        // toolbar.setBackgroundResource(R.drawable.ic_star_yellow_24dp);

        Glide.with(getApplicationContext())
                .load(photoUrl)
                .into(neighbourImage);

        /*URL url_value = null;
        try {
            url_value = new URL(photoUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // ImageView profile = (ImageView)v.findViewById(R.id.vdo_icon);
        Bitmap mIcon1 = null;
        try {
            assert url_value != null;
            mIcon1 = BitmapFactory.decodeStream(url_value.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // toolbar.setBackground(Drawable.createFromPath(neighbour.getAvatarUrl()));

        /*URL urlOfPhoto = null;
        try {
            urlOfPhoto = new URL(photoUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Bitmap bmp = null;
        try {
            assert urlOfPhoto != null;
            bmp = BitmapFactory.decodeStream(urlOfPhoto.openConnection().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        toolbar.setBackground(bmp);*/

        // ImageView iv_photo = findViewById(R.id.toolbar_layout);

        // toolbar.setBackground();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
