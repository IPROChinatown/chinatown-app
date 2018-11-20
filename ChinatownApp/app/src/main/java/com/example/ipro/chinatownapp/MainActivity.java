package com.example.ipro.chinatownapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


//Activity used to handle activity in the home page
public class MainActivity extends AppCompatActivity {

    private android.widget.Button scan_btn;

    //Setting up the button for the QR code scanner
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        scan_btn = (android.widget.Button) findViewById(R.id.scan_btn);
        final android.app.Activity activity = this;

        //Handles the action of the scan button
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set QR code format for the scanner
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);

                //Use the rear camera of the mobile device
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);

                //Allow the QR code scanner to change portrait/landscape mode automatically
                integrator.setOrientationLocked(false);
                integrator.initiateScan();
            }
        });

        Button loc_btn = findViewById(R.id.locations);
        loc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationDisplayActivity.class);
                startActivity(intent);
            }
        });

    }

    //Code that handles the QR code scanner functions. Check if user has input QR code
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode,data);

        //Determine if user scanned a functional QR code or cancelled the scanning
        if(result != null){
            //The scanning was cancelled
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            //Scanner found a QR code. Link to website
            else{
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                String url3 = result.getContents();
                check_url(url3);
            }
        }

        //Continuously check if there is a bar code in the camera field of view
        super.onActivityResult(requestCode, resultCode, data);
    }

    //Checks URL and uses device browser to open link
    public void check_url(String url) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Activity used for code input
    public void Activity2(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}
