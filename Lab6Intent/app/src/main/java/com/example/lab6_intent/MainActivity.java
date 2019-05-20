package com.example.lab6_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user= findViewById(R.id.username);
        pass= findViewById(R.id.password);
        login= findViewById(R.id.login_button);


        }



    public void movepage(View v)
    {
        String strname = user.getText().toString();
        String strpass = pass.getText().toString();


        Intent in = new Intent(MainActivity.this,Summary.class);
        Bundle bundle = new Bundle();
        bundle.putString("username", strname);
        bundle.putString("password", strpass);
        in.putExtras(bundle);
        startActivity(in);

       /* if(strname.equals("Khizar") && strpass.equals("43703"))
        {
            Intent in = new Intent(MainActivity.this,Summary.class);
            Bundle bundle = new Bundle();
            bundle.putString("username", strname);
            bundle.putString("password", strpass);
            in.putExtras(bundle);
            startActivity(in);
        }

        else if(strname.equals("") || strpass.equals(""))
        {
            Toast.makeText(getBaseContext(),"Enter Username and Password",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(getBaseContext(),"Wrong Username and Password",Toast.LENGTH_SHORT).show();
        }
*/
    }
}
