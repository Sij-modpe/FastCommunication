package com.wvtsij;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;
import com.wvtsij.test.tools;

public class MainActivity extends AppCompatActivity
{

//该声明的东西
	private CardView 短信;
	private int 报警 = 110;


    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //id绑定
        短信 = (CardView)findViewById(R.id.id1);

		//    cardView.setRadius(8);
		//设置图片圆角的半径大小
        短信.setCardElevation(8);//设置阴影部分大小
        短信.setContentPadding(5, 5, 5, 5);//设置图片距离阴影大小
		
    }

    /*创建menu*/
	public boolean onCreateOptionsMenu(Menu menu)
	{
		//为menu添加内容
		menu.add(0, 0, 0, "caonm");
		menu.add(0, 1, 1, "caokao");
		return true;
	}
	
	/*处理menu的事件*/
	public boolean onOptionsItemSelected(MenuItem item)
	{
		//得到当前选中的MenuItem的ID,
		int item_id = item.getItemId();
		switch (item_id)
		{
			case 0:
			case 1:
				/* 新建一个Intent对象 */
				Intent intent = new Intent();
				tools nmd =new tools();
				nmd.tw(this, "nmd", "中");
				break;
		}
		return true;
	}
}

