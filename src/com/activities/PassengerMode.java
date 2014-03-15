package com.activities;

import com.example.taxiforall.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PassengerMode extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passenger_mode);
	}
	
	public void openMap(View view)
	{
		Intent map = new Intent(this, MapPane.class);
		startActivity(map);
	}
}
