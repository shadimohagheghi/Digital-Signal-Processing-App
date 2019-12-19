package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class DFT extends Activity {
 
	Button buttonOne, buttonTwo, buttonThree;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dft);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button1);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, DFT1.class);
                            startActivity(intent);   
			}
 
		}); 
		
		buttonTwo = (Button) findViewById(R.id.button2);
		buttonTwo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, DFT2.class);
                            startActivity(intent);   
			}
 
		});
		buttonThree = (Button) findViewById(R.id.button3);
		buttonThree.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Clipping0.class);
                            startActivity(intent);   
			}
 
		});
	}
}