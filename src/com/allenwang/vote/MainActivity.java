package com.allenwang.vote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

	private Button mBtnLaunch = null;
	private Button mBtnQuit = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mBtnLaunch = (Button) findViewById(R.id.btnLaunch);
		mBtnQuit = (Button) findViewById(R.id.btnQuit);

		mBtnLaunch.setOnClickListener(this);
		mBtnQuit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.btnLaunch:
			Intent i = new Intent(MainActivity.this, AtyNewVote.class);
			startActivity(i);
			break;
		case R.id.btnQuit:
			finish();
			break;
		}
	}

}
