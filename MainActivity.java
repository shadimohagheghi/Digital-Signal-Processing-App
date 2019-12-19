package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class MainActivity extends Activity {
 
	Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button1);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Convolutions.class);
                            startActivity(intent);   
			}
 
		}); 
		
		buttonTwo = (Button) findViewById(R.id.button2);
		buttonTwo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, CConvolutions.class);
                            startActivity(intent);   
			}
 
		});
		
		buttonThree = (Button) findViewById(R.id.button3);
		buttonThree.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Filtering0.class);
                            startActivity(intent);   
			}
 
		});
		
		buttonFour = (Button) findViewById(R.id.button4);
		buttonFour.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, DFT.class);
                            startActivity(intent);   
			}
 
		});
 
		buttonFive = (Button) findViewById(R.id.button5);
		buttonFive.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, TouchToneTelephone0.class);
                            startActivity(intent);   
			}
 
		});
		/*
		buttonSix = (Button) findViewById(R.id.button6);
		buttonSix.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Example6.class);
                            startActivity(intent);   
			}
 
		});*/
		
	}
 
}