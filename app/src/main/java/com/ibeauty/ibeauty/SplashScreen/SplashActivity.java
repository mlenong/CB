package com.ibeauty.ibeauty.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ibeauty.ibeauty.MainActivity;
import com.ibeauty.ibeauty.R;

/**
 * Created by Anang on 08/11/2016.
 */

public class SplashActivity extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        },SPLASH_TIME_OUT);
    }
}
