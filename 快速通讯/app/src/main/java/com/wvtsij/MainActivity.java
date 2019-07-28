package com.wvtsij;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{


	private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cardView = (CardView)findViewById(R.id.cardView);

		//    cardView.setRadius(8);
		//设置图片圆角的半径大小

        cardView.setCardElevation(8);//设置阴影部分大小

        cardView.setContentPadding(5, 5, 5, 5);//设置图片距离阴影大小
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
				break;
		}
		return true;
	}
}

