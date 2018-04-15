package com.example.sai.myapplication;

/**
 * Created by Sai on 11-Nov-17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sai.myapplication.Dijk.DrawView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new DrawView(this));
        //  setContentView(R.layout.activity_main2);
    }
}

