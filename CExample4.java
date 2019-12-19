package com.example.dsp;
 
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;
 
public class CExample4 extends Activity {
 
	Button button, buttonNextPage;
	VideoView vid;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cexample4);
		addListenerOnButton();
		/*vid=(VideoView)findViewById(R.id.videoView1);
		String urlpath = "android.resource://" + getPackageName() + "/" + R.raw.shamloosokoot;
		vid.setVideoURI(Uri.parse(urlpath));
		vid.start();*/
	}
	public void addListenerOnButton() {
		 
		final Context context = this;
 		
		buttonNextPage = (Button) findViewById(R.id.button1);
		buttonNextPage.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, Example4ResultCircular.class);
                            startActivity(intent);   
			}
 
		});
		
	}
 
}