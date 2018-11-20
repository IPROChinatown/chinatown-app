package com.example.ipro.chinatownapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // MainActivity ma1=new MainActivity();

        //Buttons used in number pad. Include digits 0-9, delete, and enter.
        final EditText eText=findViewById(R.id.eText);
        Button b0=findViewById(R.id.n0);
        Button b1=findViewById(R.id.n1);
        Button b2=findViewById(R.id.n2);
        Button b3=findViewById(R.id.n3);
        Button b4=findViewById(R.id.n4);
        Button b5=findViewById(R.id.n5);
        Button b6=findViewById(R.id.n6);
        Button b7=findViewById(R.id.n7);
        Button b8=findViewById(R.id.n8);
        Button b9=findViewById(R.id.n9);
        Button delete=findViewById(R.id.nD);
        Button enter=findViewById(R.id.nE);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"0"));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"1"));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"2"));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"3"));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"4"));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"5"));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"6"));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"7"));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"8"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"9"));
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"0"));
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText.setText(eText.getText().insert(eText.getText().length(),"0"));
            }
        });

        //Deletes a single digit from the input code
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Checks if the input area is blank before calling delete
                if(eText.length()>0)
                    eText.setText(eText.getText().delete(eText.getText().length()-1,eText.getText().length()));
                else
                    eText.setText(eText.getText());
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Check if the input code is the appropriate length (4 digits)
                if (eText.length() != 4) {
                    eText.setText("");
                    Toast.makeText(getApplicationContext(), "Please enter a valid code", Toast.LENGTH_SHORT).show();
                }
                //Check if the 4 digit code is a valid code and link to the corresponding section in the website
                //If code is not valid, reset the input area and notify user
                else {
                    switch (eText.getText().toString()) {
                        case "5943":
                            check_url("https://www.geeksforgeeks.org/switch-statement-in-java/");
                            break;

                        default:
                            eText.setText("");
                            Toast.makeText(getApplicationContext(), "Please enter a valid code", Toast.LENGTH_SHORT).show();
                            break;
                    }//End of switch case
                }//End of else
            }
        });

    }//End of onCreate

    //Checks URL and uses device browser to open link
    public void check_url(String url) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}//End of class