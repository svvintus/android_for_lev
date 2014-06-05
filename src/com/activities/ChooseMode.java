package com.activities;

import com.example.taxiforall.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseMode extends Activity 
{	
	public void chooseDriveMode(View view)
	{
		Intent driveMode = new Intent(this, DriveMode.class);
		startActivity(driveMode);
	}
	
	public void choosePassengerMode(View view)
	{
		Intent passengerMode = new Intent(this, PassengerMode.class);
		startActivity(passengerMode);
	}
	
	@Override
	public void onStart()
	{
		super.onStart();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_mode);
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
	}

}
