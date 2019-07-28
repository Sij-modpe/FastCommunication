package com.wvtsij;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;


public class open extends Activity
{
	private final int SPLASH_DISPLAY_LENGHT = 3000;//3秒
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_loading);




		//3s之后跳转
		new Handler().postDelayed(new Runnable(){

				public void run()
				{
					Intent qs =new Intent(open.this,MainActivity.class);
					open.this.startActivity(qs);
					open.this.finish();

					// TODO: Implement this method
				}

			},SPLASH_DISPLAY_LENGHT);}}

