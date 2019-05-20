package com.example.lab9_boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText etAdd1,etAdd2,etAdd;
    public EditText etSub1,etSub2,etSub;
    public EditText etMul1,etMul2,etMul;
    public EditText etDiv1,etDiv2,etDiv;
    public Button btnAdd, btnSub, btnMul,btnDiv;
    MyService myService;
    boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAdd1= findViewById(R.id.addnum1);
        etAdd2= findViewById(R.id.addnum2);
        etAdd= findViewById(R.id.addresult);
        btnAdd= findViewById(R.id.btnAdd);

        etSub1= findViewById(R.id.subnum1);
        etSub2= findViewById(R.id.subnum2);
        etSub= findViewById(R.id.subresult);
        btnSub= findViewById(R.id.btnSub);


        etMul1= findViewById(R.id.mulnum1);
        etMul2= findViewById(R.id.mulnum2);
        etMul= findViewById(R.id.mulresult);
        btnMul= findViewById(R.id.btnMul);

        etDiv1= findViewById(R.id.divnum1);
        etDiv2= findViewById(R.id.divnum2);
        etDiv= findViewById(R.id.divresult);
        btnMul= findViewById(R.id.btnDiv);

        Intent in = new Intent(this,MyService.class);
        bindService(in,serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void getRandom(View view){
        etAdd2.setText(Integer.toString(myService.getRandom()));
        etSub2.setText(Integer.toString(myService.getRandom()));
        etMul2.setText(Integer.toString(myService.getRandom()));
        etDiv2.setText(Integer.toString(myService.getRandom()));

    }

    public void getAddition(View view){
        String str1 = etAdd1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = etAdd2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int add = num1 + num2;
        etAdd.setText(Integer.toString(add));
    }

    public void getSubtraction(View view){
        String str1 = etSub1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = etSub2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int sub = num1 - num2;
        etSub.setText(Integer.toString(sub));

    }

    public void getMultiplication(View view){
        String str1 = etMul1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = etMul2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int mul = num1 * num2;
        etMul.setText(Integer.toString(mul));

    }

    public void getDivision(View view){
        String str1 = etDiv1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = etDiv2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int div = num1 / num2;
        etDiv.setText(Integer.toString(div));

    }




    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.LocalBinder binder = (MyService.LocalBinder) service;
            myService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };
}
