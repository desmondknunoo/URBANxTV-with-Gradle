package com.dkn.desmondenergeo.urbanxtv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class About extends Activity {
	Button button;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.about);
	

	 button = (Button) findViewById(R.id.Buttoncall1); 
	 button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
            	


		Intent callIntent = new Intent(Intent.ACTION_DIAL);
		callIntent.setData(Uri.parse("tel:+233-542-848-824"));
		

		try {
		startActivity(Intent.createChooser(callIntent, "Call URBΔNxTV using..."));
	
		}
        
     catch (android.content.ActivityNotFoundException ex) {
        Toast.makeText(getActivity(),
                "No call clients available.",
                Toast.LENGTH_SHORT).show();
    }


}

			private Context getActivity() {
				// TODO Auto-generated method stub
				return null;
			}});
	 
	 button = (Button) findViewById(R.id.buttoncall2); 
	 button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
            	


		Intent callIntent = new Intent(Intent.ACTION_DIAL);
		callIntent.setData(Uri.parse("tel:+233-500-295-851"));
		

		try {
		startActivity(Intent.createChooser(callIntent, "Call URBΔNxTV using..."));
	
		}
        
     catch (android.content.ActivityNotFoundException ex) {
        Toast.makeText(getActivity(),
                "No call clients available.",
                Toast.LENGTH_SHORT).show();
    }


}

			private Context getActivity() {
				// TODO Auto-generated method stub
				return null;
			}});
}
	@Override
	protected void onStart() {
	super.onStart();
	}
	
	/** Called when the activity has become visible. */
	@Override
	protected void onResume() {
	super.onResume();
	}
	
	/** Called when another activity is taking focus. */
	@Override
	protected void onPause() {
	super.onPause();
	
	}
	/** Called when the activity is no longer visible. */
	@Override
	protected void onStop() {
	super.onStop();
	
	}
	/** Called just before the activity is destroyed. */
	@Override
	public void onDestroy() {
	super.onDestroy();
	
	}}