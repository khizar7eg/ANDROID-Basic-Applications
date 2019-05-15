package com.example.lab2_functions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;

    int input, result, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt =(TextView) findViewById(R.id.text_view);
        btn =(Button) findViewById(R.id.check_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                try {
                    input = Integer.parseInt(txt.getText().toString());
                    result = input * 3;
                    Toast.makeText(MainActivity.this, "Result: " + result, Toast.LENGTH_SHORT).show();
                    result2 = input/0;
                    Toast.makeText(MainActivity.this, "Result: " + result, Toast.LENGTH_SHORT);

                }
                catch (Exception e){
                    if(result2 != 0){
                        Log.i("Exception Information","Divided by zero");
                    }
                    else {
                        Log.e("Exception Error", "Cannot divide by zero");
                    }



                }


            }


        });
    }
}
