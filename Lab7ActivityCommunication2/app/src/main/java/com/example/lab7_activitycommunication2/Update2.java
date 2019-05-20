package com.example.lab7_activitycommunication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Update2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update2);


        Button btn = (Button) findViewById(R.id.btnSave);
        EditText edit = (EditText)findViewById(R.id.edittext);
        TextView txt = (TextView)findViewById(R.id.updateText);
        Intent in = getIntent();
        Bundle bun = in.getExtras();
        clock ctime = (clock) bun.getSerializable("object");
        txt.setText(ctime.getStime());

        DateFormat df = new SimpleDateFormat("ss");
        String date = df.format(Calendar.getInstance().getTime());
        edit.setText(date);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(),"Updates Saved",Toast.LENGTH_SHORT).show();
            }

        });


    }
}
