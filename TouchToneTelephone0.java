package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class TouchToneTelephone0 extends Activity {
 
	Button one, two, three, four, five, six, seven, eight, nine, zero, star, pound ;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_touch_tone_telephone0);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		one = (Button) findViewById(R.id.button1);
		one.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneOne.class);
                            startActivity(intent);   
			}
 
		});
		
		two = (Button) findViewById(R.id.button2);
		two.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneTwo.class);
                            startActivity(intent);   
			}
 
		});
		
		three = (Button) findViewById(R.id.button3);
		three.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneThree.class);
                            startActivity(intent);   
			}
 
		});
		
		four = (Button) findViewById(R.id.button4);
		four.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneFour.class);
                            startActivity(intent);   
			}
 
		});
 
		five = (Button) findViewById(R.id.button5);
		five.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneFive.class);
                            startActivity(intent);   
			}
 
		});
		
		six = (Button) findViewById(R.id.button6);
		six.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneSix.class);
                            startActivity(intent);   
			}
 
		});
		seven = (Button) findViewById(R.id.button7);
		seven.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneSeven.class);
                            startActivity(intent);   
			}
 
		});
		eight = (Button) findViewById(R.id.button8);
		eight.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneEight.class);
                            startActivity(intent);   
			}
		});
		
		nine = (Button) findViewById(R.id.button9);
		nine.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneNine.class);
                            startActivity(intent);   
			}
		});
		
		star = (Button) findViewById(R.id.button10);
		star.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneStar.class);
                            startActivity(intent);   
			} 
		});
		
		zero = (Button) findViewById(R.id.button11);
		zero.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneZero.class);
                            startActivity(intent);   
			}
		});
		
		pound = (Button) findViewById(R.id.button12);
		pound.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchTonePound.class);
                            startActivity(intent);   
			}
		});
	}
 
}