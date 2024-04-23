package com.example.myandroidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void back (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
