package com.example.taxiforall;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TaxiForAll extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_for_all);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.taxi_for_all, menu);
        return true;
    }
    
}
