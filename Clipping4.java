package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
//import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
 
public class Clipping4 extends Activity {
 
	Button button, buttonImage;
	ImageView imageView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clipping4);
		imageView= (ImageView)findViewById(R.id.imageView1);
        buttonImage = (Button) findViewById(R.id.button1);
        buttonImage.setOnClickListener(iButtonChangeImageListener);
		addListenerOnButton();
	}
	View.OnClickListener iButtonChangeImageListener = new OnClickListener() {
        public void onClick(View v) {
        		imageView.setImageResource(R.drawable.clippedfreqzoom);
        }
    };
    public void addListenerOnButton() {
    	 
		final Context context = this;
		button = (Button) findViewById(R.id.button2);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Clipping5.class);
                            startActivity(intent);   
			}
 
		});
    }
 
}