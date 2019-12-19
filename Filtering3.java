package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
//import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Filtering3 extends Activity {
 
	Button button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_filtering3);
		addListenerOnButton();
	}
	
    public void addListenerOnButton() {
    	 
		final Context context = this;
		button = (Button) findViewById(R.id.button2);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Filtering4.class);
                            startActivity(intent);   
			}
 
		});
    }
 
}
	/* 
	 
	 <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="14dp"
        android:layout_y="274dp"
        android:text="So, 24,000 Hz corresponds to 𝑛 = 48,000 (since our DFT plot has 96,000 samples). With this in mind, we realize that a real time frequency of f corresponds to a value of 𝑛 = 2f in our DFT plot" />

	 */


