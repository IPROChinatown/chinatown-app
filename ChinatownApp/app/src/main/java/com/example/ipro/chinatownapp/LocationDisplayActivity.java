package com.example.ipro.chinatownapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ipro.chinatownapp.classes.LocationActivity;


public class LocationDisplayActivity extends AppCompatActivity {

    public class LocationAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater mInflator;
        private LocationActivity mDataSource;

        public LocationAdapter(Context c) {
            mContext = c;
            mInflator = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mDataSource = new LocationActivity();
        }


        @Override
        public int getCount() {
            return mDataSource.getDataSourceLength();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView thumbnail;
            TextView location;

            if (convertView == null) {
                convertView = mInflator.inflate(R.layout.list_item_location, parent,
                        false);
            }

            thumbnail = (ImageView) convertView.findViewById(R.id.thumb);
            thumbnail.setImageResource(mDataSource.getPhotoPool().get(position));
            location = (TextView) convertView.findViewById(R.id.text);
            location.setText(mDataSource.getLocation().get(position));
            return convertView;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ListView mListView = (ListView) findViewById(R.id.location_list);
        mListView.setAdapter(new LocationAdapter(this));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position,
                                    long arg3) {
                Intent i = new Intent(LocationDisplayActivity.this, LocationDetail.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });
    }
}
