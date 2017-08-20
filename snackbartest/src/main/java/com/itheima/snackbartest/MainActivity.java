package com.itheima.snackbartest;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView tv= (TextView) findViewById(R.id.tv);
		tv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//弹出SnackBar
				//setAction:表示点击后产生的行为
				Snackbar.make(tv,"connection fail",Snackbar.LENGTH_LONG).setAction("retry", new View.OnClickListener() {
					@Override
					public void onClick(View view) {
//						Log.i("test","进行网络连接重试");
						Toast.makeText(MainActivity.this, "重试", Toast.LENGTH_SHORT).show();
					}
				}).show();
			}
		});
	}
}
