package com.example.ipro.chinatownapp;

import java.util.ArrayList;

public class LocationActivity {

    private ArrayList<Integer> mPhotoPool;
    private ArrayList<Integer> mLocation;
    private ArrayList<Integer> mPhotoHdPool;

    private void setupPhotoPool() {
        mPhotoPool.add(R.drawable.puitak); //use the same picture for now, and will replace after we have the contents
        mPhotoPool.add(R.drawable.gate);
        mPhotoPool.add(R.drawable.camc);
        mPhotoPool.add(R.drawable.buddhist);
        /*mPhotoPool.add(R.drawable.home_icon);
        mPhotoPool.add(R.drawable.home_icon);
        mPhotoPool.add(R.drawable.home_icon);
        mPhotoPool.add(R.drawable.home_icon);
        mPhotoPool.add(R.drawable.home_icon);
        mPhotoPool.add(R.drawable.home_icon);*/
    }
    private void setupLocation() {
        mLocation.add(R.string.location_1); //the location descriptions are in the strings.xml
        mLocation.add(R.string.location_2);
        mLocation.add(R.string.location_3);
        mLocation.add(R.string.location_4);
        /*mLocation.add(R.string.location_5);
        mLocation.add(R.string.location_6);
        mLocation.add(R.string.location_7);
        mLocation.add(R.string.location_8);
        mLocation.add(R.string.location_9);
        mLocation.add(R.string.location_10);*/
    }

    private void setupPhotoHDPool() {
        mPhotoHdPool.add(R.drawable.puitak);
        mPhotoHdPool.add(R.drawable.gate);
        mPhotoHdPool.add(R.drawable.camc);
        mPhotoHdPool.add(R.drawable.buddhist);
        /*mPhotoHdPool.add(R.drawable.home_icon);
        mPhotoHdPool.add(R.drawable.home_icon);
        mPhotoHdPool.add(R.drawable.home_icon);
        mPhotoHdPool.add(R.drawable.home_icon);
        mPhotoHdPool.add(R.drawable.home_icon);
        mPhotoHdPool.add(R.drawable.home_icon);*/
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