package com.example.ZHAFIRUAS.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ZHAFIRUAS.R;

// 10116368 ZHAFIR MAHDI IF-8  10/8/2019

public class SplashActivity extends AppCompatActivity {

    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
