package com.example.ipro.chinatownapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipro.chinatownapp.classes.LocationActivity;

public class LocationDetail extends AppCompatActivity{

    private ImageView mImageView;
    private TextView mQuote;
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
        mQuote = (TextView) findViewById(R.id.locations);

        mImageView.setImageResource(mDataSource.getmPhotoHdPool().
                get(mPosition));

        mQuote.setText(getResources().getString(mDataSource.getmLocation()
                .get(mPosition)));
    }
}

