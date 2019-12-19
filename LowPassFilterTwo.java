package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class LowPassFilterTwo extends Activity {
 
	Button buttonOne;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_low_pass_filter_two);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button1);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, LowPassFilterThree.class);
                            startActivity(intent);   
			}
 
		});
		
	}
}
		