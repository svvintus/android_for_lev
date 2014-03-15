package com.activities;

import com.example.taxiforall.R;
import com.example.taxiforall.R.layout;
import com.example.taxiforall.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapPane extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}
