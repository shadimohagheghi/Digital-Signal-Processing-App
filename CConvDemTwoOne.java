package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
 
public class CConvDemTwoOne extends Activity {
	
	int[] images = {R.drawable.demch21, R.drawable.demch22,R.drawable.demch23, R.drawable.demch24, R.drawable.c2y};
	Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix;
    int currentImage = 0;
    ImageView imageView;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cconv_dem_two_one);
		imageView= (ImageView)findViewById(R.id.imageView1);
        buttonOne = (Button) findViewById(R.id.button2);
        buttonTwo = (Button) findViewById(R.id.button1);
        buttonThree = (Button) findViewById(R.id.button3);
		buttonOne.setOnClickListener(iButtonChangeImageListener1);
		buttonTwo.setOnClickListener(iButtonChangeImageListener2);
		addListenerOnButton();
		//addListenerOnButton2();
	}
 
  	View.OnClickListener iButtonChangeImageListener1 = new OnClickListener() {
  		//final Context context = this;
        public void onClick(View v) {
            //Increase Counter to move to next Image
        	if(currentImage<5){
        		//currentImage = currentImage % images.length;
        		imageView.setImageResource(images[currentImage]);
        		currentImage++;
        	}
        	//startActivity(new Intent(ConDemOneOne.this,ConDemOneFive.class));﻿
        	//else {        	 ﻿
        	 //Intent intent = new Intent(context, ConDemOneFive.class);
            // startActivity(intent); 
        	//}
        }
    };
    
	View.OnClickListener iButtonChangeImageListener2 = new OnClickListener() {
  		//final Context context = this;
        public void onClick(View v) {
            //Increase Counter to move to next Image
        	if(currentImage>1){
        		currentImage--;
        		imageView.setImageResource(images[currentImage-1]);
        	}
        	//else
        		//imageView.setImageResource(R.drawable.demch21);
        	    //currentImage--;
        }
    };
    
    public void addListenerOnButton() {
    	 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button3);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, MainActivity.class);
                            startActivity(intent);   
			}
 
		});
    }
    /*
	public void addListenerOnButton1() {
 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button2);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				ImageView image = (ImageView) findViewById(R.id.imageView1);
				image.setImageResource(R.drawable.c6);
				//image.setImageResource(R.drawable.l6);
			    //Intent intent = new Intent(context, ConDemOneTwo.class);
                           // startActivity(intent);   
			}
			
		});
	}
		public void addListenerOnButton2() {
			 
			//final Context context = this;
	 
			buttonOne = (Button) findViewById(R.id.button2);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				ImageView image = (ImageView) findViewById(R.id.imageView1);
				//image.setImageResource(R.drawable.c6);
				image.setImageResource(R.drawable.l6);
			    //Intent intent = new Intent(context, ConDemOneTwo.class);
                           // startActivity(intent);   
			}
 
		});
		
	}*/
}
		