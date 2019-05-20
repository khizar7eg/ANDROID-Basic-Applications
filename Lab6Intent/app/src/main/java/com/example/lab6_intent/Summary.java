package com.example.lab6_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Summary extends AppCompatActivity {
TextView text1, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        text1 = (TextView)findViewById(R.id.text_result1);
        text2 = (TextView)findViewById(R.id.text_result2);
        Bundle bundle = getIntent().getExtras();
        String data1 = bundle.getString("username");
        String data2 = bundle.getString("password");

        //text1.setText(data1);
       //text2.setText(data2);

        if (data1.equals("Khizar") && data2.equals("43703")){
            text1.setText("Login Sucessful!");
        }
        else {
            text1.setText("Invaid Username and Password!");
        }
    }
}
