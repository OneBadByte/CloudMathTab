package com.example.blackdartq.cloudmathtabapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogoActivity extends AppCompatActivity {
    final String BACKGROUNDCOLOR= "#555555";
    final String FONTCOLOR ="#09a1ff";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
         Thread thread = new Thread() {
             public void run() {
                 try {
                     Thread.sleep(1000);
                     Intent i = new Intent(getBaseContext(),MainActivity.class);
                     startActivity(i);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }

             }
         };
        thread.start();

    }
}
