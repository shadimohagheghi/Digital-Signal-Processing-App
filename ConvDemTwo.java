package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class ConvDemTwo extends Activity {
 
	Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_conv_dem_two);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		buttonOne = (Button) findViewById(R.id.button1);
		buttonOne.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, ConvDemTwoOne.class);
                            startActivity(intent);   
			}
 
		});
		
	}
}
		