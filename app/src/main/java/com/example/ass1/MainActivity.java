package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Link to the splash screen layout

        // Post a delayed action to move to the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the Sender Activity
                Intent intent = new Intent(MainActivity.this, SenderActivity.class);
                startActivity(intent);

                // Finish the Splash Activity so the user can't go back to it
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
