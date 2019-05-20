package com.example.lab7_activitycommunication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.btnAsk);


    }


    public void movepage(View v)
    {
        Intent in = new Intent(MainActivity.this,Ask.class);
        startActivity(in);
    }


}
