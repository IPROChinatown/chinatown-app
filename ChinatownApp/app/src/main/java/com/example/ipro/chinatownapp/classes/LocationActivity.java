package com.example.ipro.chinatownapp.classes;

import com.example.ipro.chinatownapp.R;

import java.util.ArrayList;

public class LocationActivity {

    private ArrayList<Integer> PhotoPool;
    private ArrayList<Integer> mLocation;
    private ArrayList<Integer> PhotoHdPool;

    private void setupPhotoPool() {
        PhotoPool.add(R.drawable.location_1); //use the same picture for now, and will replace after we have the contents
        PhotoPool.add(R.drawable.location_1);
        PhotoPool.add(R.drawable.location_1);
        PhotoPool.add(R.drawable.location_1);
    }
    private void setupLocation() {
        mLocation.add(R.string.location_1); //the location descriptions are in the strings.xml
        mLocation.add(R.string.location_2);
        mLocation.add(R.string.location_3);
        mLocation.add(R.string.location_4);
    }

    private void setupPhotoHDPool() {
        PhotoHdPool.add(R.drawable.location_1);
        PhotoHdPool.add(R.drawable.location_1);
        PhotoHdPool.add(R.drawable.location_1);
        PhotoHdPool.add(R.drawable.location_1);
    }

    public ArrayList<Integer> getPhotoHdPool() {
        return PhotoHdPool;
    }

    public ArrayList<Integer> getPhotoPool() {
        return PhotoPool;
    }

    public ArrayList<Integer> getLocation() {
        return mLocation;
    }

    public int getDataSourceLength() {
        return PhotoPool.size();
    }

    public LocationActivity() {
        PhotoPool = new ArrayList();
        mLocation = new ArrayList();
        PhotoHdPool = new ArrayList();
        setupPhotoPool();
        setupLocation();
        setupPhotoHDPool();

    }
}
