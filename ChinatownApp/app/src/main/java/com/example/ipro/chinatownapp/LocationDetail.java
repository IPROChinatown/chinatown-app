package com.example.ipro.chinatownapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipro.chinatownapp.classes.LocationActivity;

public class LocationDetail extends AppCompatActivity{

    private ImageView mImageView;
    private TextView mLocation;
    private int mPosition;
    private LocationActivity mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_detail);

        Intent i = getIntent();
        mPosition = i.getIntExtra("position", 0);

        mDataSource = new LocationActivity();
        mImageView = (ImageView) findViewById(R.id.image);
        mLocation = (TextView) findViewById(R.id.location);

        mImageView.setImageResource(mDataSource.getPhotoHdPool().
                get(mPosition));

        mLocation.setText(getResources().getString(mDataSource.getLocation()
                .get(mPosition)));
    }
}

