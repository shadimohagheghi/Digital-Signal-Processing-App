package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Clipping3 extends Activity {
 
	Button button, buttonSong;
	MediaPlayer originalS;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clipping3);
	
		
		button = (Button) findViewById(R.id.button1);
	    buttonSong = (Button) findViewById(R.id.button2);
	 
		buttonSong.setOnClickListener(playSong);
		addListenerOnButton();
		
		//originalS.prepare();
		
		//originalS.pause();
		addListenerOnButton();
	}
	
	View.OnClickListener playSong = new OnClickListener() {
        public void onClick(View v) {
        	originalS = MediaPlayer.create(Clipping3.this, R.raw.clippedvoice);
        	originalS.start();
        	}
    };
    
    public void addListenerOnButton() {
    	 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Clipping4.class);
                            startActivity(intent);   
			}
 
		});
    }
 
}