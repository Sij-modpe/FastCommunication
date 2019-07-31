package com.wvtsij.test;
import android.widget.Toast;
import android.support.v4.app.ActivityManagerCompat;
import android.app.Activity;
import android.view.Gravity;

public class tools
{
	public void tw(Activity act, String txt, String were)
	{

		Toast toast = Toast.makeText(act, txt, Toast.LENGTH_SHORT);
	    if (were == null)
		{
			toast.setGravity(Gravity.CENTER, 0, 0);
		}
		if (were == "中")
		{
			toast.setGravity(Gravity.CENTER, 0, 0);  
		}
		if (were == "上")
		{
			toast.setGravity(Gravity.TOP, 0, 0);
		}


		toast.show(); 
	}
}
