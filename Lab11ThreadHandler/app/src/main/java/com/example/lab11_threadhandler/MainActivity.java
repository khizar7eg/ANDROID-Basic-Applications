package com.example.lab11_threadhandler;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private Handler mHandler;
    private ProgressBar mProgressBar;
    private Button mStartButton;

    private void performStuff(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 30; i++){
                    final int currentProgessCount = i;
                    try {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(currentProgessCount);
                        }
                    });
                }
            }
        }).start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new Handler();
        mProgressBar = findViewById(R.id.progressBar);
        mStartButton = findViewById(R.id.btnStart);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performStuff();
            }
        });

    }
}
