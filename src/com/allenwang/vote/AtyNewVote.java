package com.allenwang.vote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class AtyNewVote extends Activity implements OnClickListener {

	private Button mBtnBack = null;
	private Button mBtnNext = null;
	private EditText mEtVoteName = null;
	private ToggleButton mTbIfSecret = null;
	
	private String mVoteName = null;
	private Boolean mIsToggleOn = false;
	private String mVoteMode = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_new_vote);
		
		mBtnBack = (Button) findViewById(R.id.btnBack);
		mBtnNext = (Button) findViewById(R.id.btnNext);
		mEtVoteName = (EditText) findViewById(R.id.etName);
		mTbIfSecret = (ToggleButton) findViewById(R.id.tbIfSecret);
		
		mBtnBack.setOnClickListener(this);
		mBtnNext.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.btnBack:
			//不好,应该保存该界面的数据而不是直接关闭
			finish();
			break;
		case R.id.btnNext:
			mVoteName = mEtVoteName.getText().toString();
			mIsToggleOn = mTbIfSecret.isChecked();
			System.out.println(mIsToggleOn + "");
			if(mIsToggleOn) mVoteMode = "记名投票"; else mVoteMode = "不记名投票";
			Intent i = new Intent(AtyNewVote.this, AtyConfirmVote.class);
			startActivity(i);
			break;
		}
	}
	
}
