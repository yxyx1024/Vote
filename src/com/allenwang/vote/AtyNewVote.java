package com.allenwang.vote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AtyNewVote extends Activity implements OnClickListener {

	private Button mBtnCompleteSetup = null;
	private Button mBtnDiscardVote = null;
	private EditText mEtVoteName = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_new_vote);
		
		mBtnCompleteSetup = (Button) findViewById(R.id.btnComplete);
		mBtnDiscardVote = (Button) findViewById(R.id.btnDiscard);
		
		mBtnCompleteSetup.setOnClickListener(this);
		mBtnDiscardVote.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.btnComplete:
			
			break;
		case R.id.btnDiscard:
			
			break;
		}
	}
	
}
