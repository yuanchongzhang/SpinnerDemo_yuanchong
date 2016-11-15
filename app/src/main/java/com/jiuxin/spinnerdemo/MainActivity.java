package com.jiuxin.spinnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jiuxin.spinnerdemo.views.NiceSpinner;
import com.weiwangcn.betterspinner.library.BetterSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BetterSpinner spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);
        List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        niceSpinner.attachDataSource(dataset);


    }
}
