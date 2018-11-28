package com.example.ipro.chinatownapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        mImageView.setImageResource(mDataSource.getmPhotoHdPool().
                get(mPosition));

        mLocation.setText(getResources().getString(mDataSource.getmLocation()
                .get(mPosition)));


        /* final TextView descriptionText = (TextView) findViewById(R.id.location);
        final TextView showAll = (TextView) findViewById(R.id.detail_read_all);
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAll.setVisibility(View.INVISIBLE);

                descriptionText.setMaxLines(Integer.MAX_VALUE);
            }
        }); */
    }
}
