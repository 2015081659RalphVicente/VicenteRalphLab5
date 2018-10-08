package com.vicente.ralph.vicenteralphlab5;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, MyService.class);
        startService(i);

        Log.d("4itf", "onCreate() has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf","onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf","onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","onDestroy() has executed...");

    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnact1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnmap) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.551816, 121.025071"));
            chooser = Intent.createChooser(i, "Choose App");
            startActivity(i);
        }
    }
}
