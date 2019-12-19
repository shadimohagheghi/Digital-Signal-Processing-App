package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Example3 extends Activity {
 
	Button button, buttonNextPage;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example3);
		addListenerOnButton();
	}
	public void addListenerOnButton() {
		 
		final Context context = this;
 

		buttonNextPage = (Button) findViewById(R.id.button1);
		buttonNextPage.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Example3Result.class);
                            startActivity(intent);   
			}
 
		});
	}
 
}