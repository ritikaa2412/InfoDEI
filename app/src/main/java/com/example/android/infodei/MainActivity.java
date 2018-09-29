package com.example.android.infodei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private Timer t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, activity_2.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
}
