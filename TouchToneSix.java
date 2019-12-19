package com.example.dsp;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TouchToneSix extends ActionBarActivity{
	 
		Button buttonOne, buttonTwo;
		MediaPlayer originalS;;
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_touch_tone_six);
			
			buttonTwo = (Button) findViewById(R.id.button2);
			 
			buttonTwo.setOnClickListener(playSound);
			addListenerOnButton();
		}
		View.OnClickListener playSound = new OnClickListener() {
	        public void onClick(View v) {
	        	originalS = MediaPlayer.create(TouchToneSix.this, R.raw.tone6);
	        	originalS.start();
	        	}
	    };
		public void addListenerOnButton() {
	 
			final Context context = this;
	 
			buttonOne = (Button) findViewById(R.id.button1);
			buttonOne.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
				    Intent intent = new Intent(context, MainActivity.class);
	                            startActivity(intent);   
				}
	 
			});
			
		}
	}
