package com.example.lab7_activitycommunication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    RadioButton hradio,mradio,sradio, radioButton;
    Button update;
    TextClock time;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        hradio = findViewById(R.id.radio_hh);
        mradio = findViewById(R.id.radio_mm);
        sradio = findViewById(R.id.radio_ss);
        time = findViewById(R.id.clock_time);
        update = findViewById(R.id.btnUpdate);



        time.setFormat12Hour("kk:mm:ss");

        if(hradio.isChecked()){
            mradio.setChecked(false);
            sradio.setChecked(false);
        }
        else if(mradio.isChecked()){
            hradio.setChecked(false);
            sradio.setChecked(false);
        }
        else if(sradio.isChecked()){
            hradio.setChecked(false);
            mradio.setChecked(false);
        }



        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hradio.isChecked()){
                    Intent in = new Intent(MainActivity.this, Update.class);
                    String hstring = hradio.getText().toString();
                    String mstring = mradio.getText().toString();
                    String sstring = sradio.getText().toString();
                    clock ctime = new clock(hstring,mstring,sstring);
                    in.putExtra("object", ctime);
                    startActivity(in);
                }

                else if(mradio.isChecked()){
                    Intent in = new Intent(MainActivity.this, Update1.class);
                    String hstring = hradio.getText().toString();
                    String mstring = mradio.getText().toString();
                    String sstring = sradio.getText().toString();
                    clock ctime = new clock(hstring,mstring,sstring);
                    in.putExtra("object", ctime);
                    startActivity(in);
                }

                else if(sradio.isChecked()){
                    Intent in = new Intent(MainActivity.this, Update2.class);
                    String hstring = hradio.getText().toString();
                    String mstring = mradio.getText().toString();
                    String sstring = sradio.getText().toString();
                    clock ctime = new clock(hstring,mstring,sstring);
                    in.putExtra("object", ctime);
                    startActivity(in);
                }

                else {
                    Toast.makeText(getBaseContext(),"No option selected",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }


}
