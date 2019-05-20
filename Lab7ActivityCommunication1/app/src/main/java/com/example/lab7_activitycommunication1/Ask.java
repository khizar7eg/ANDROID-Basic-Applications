package com.example.lab7_activitycommunication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ask extends AppCompatActivity {

    Button btnYes,btnNo,btnCancel;
    EditText input;
    TextView output;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);


        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        output = (TextView)findViewById(R.id.textResult);
        input = (EditText) findViewById(R.id.textInput);


    }


    public void optionYes(View v)
    {
        data = input.getText().toString();
        output.setText(data);
        Toast.makeText(getBaseContext(),"Name saved.",Toast.LENGTH_SHORT).show();
    }
    public void optionNo(View v)
    {
        output.setText("");
        Toast.makeText(getBaseContext(),"Name not saved.",Toast.LENGTH_SHORT).show();
    }

    public void optionCancel(View v)
    {
        Intent in = new Intent(Ask.this,MainActivity.class);
        startActivity(in);
    }




}
