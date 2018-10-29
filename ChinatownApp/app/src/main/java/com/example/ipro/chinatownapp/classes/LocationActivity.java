package com.example.ipro.chinatownapp.classes;

import com.example.ipro.chinatownapp.R;

import java.util.ArrayList;

public class LocationActivity {

    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mLocation;
    private ArrayList<Integer> mPhotoHdPool;

    private void setupPhotoPool() {
        mPhotoPool.add(R.drawable.location_1); //use the same picture for now, and will replace after we have the contents
        mPhotoPool.add(R.drawable.location_1);
        mPhotoPool.add(R.drawable.location_1);
        mPhotoPool.add(R.drawable.location_1);
    }
    private void setupLocation() {
        mLocation.add(R.string.location_1); //the location descriptions are in the strings.xml
        mLocation.add(R.string.location_2);
        mLocation.add(R.string.location_3);
        mLocation.add(R.string.location_4);
    }

    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.location_1);
        mPhotoHdPool.add(R.drawable.location_1);
        mPhotoHdPool.add(R.drawable.location_1);
    }

    public ArrayList<Integer> getmPhotoHdPool() {
        return mPhotoHdPool;
    }

    public ArrayList<Integer> getmPhotoPool() {
        return mPhotoPool;
    }

    public ArrayList<Integer> getmLocation() {
        return mLocation;
    }

    public int getDataSourceLength() {
        return mPhotoPool.size();
    }

    public LocationActivity() {
        mPhotoPool = new ArrayList();
        mLocation = new ArrayList();
        mPhotoHdPool = new ArrayList();
        setupPhotoPool();
        setupLocation();
        setupPhotoHDPool();

    }
}
