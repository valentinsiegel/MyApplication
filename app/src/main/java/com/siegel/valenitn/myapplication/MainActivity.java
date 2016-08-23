package com.siegel.valenitn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //bla
        //bop
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.test)).setText("de");
    }
}
