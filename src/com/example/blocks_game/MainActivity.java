package com.example.blocks_game;

import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final int TOUCH_DOWN = 0;
	private static final int TOUCH_UP = 0;
	private ProgressDialog progress;
	   Button b1,b2;
	   
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_main);
	      progress = new ProgressDialog(this);
	      
	      b1=(Button)findViewById(R.id.action_settings);
	      b2=(Button)findViewById(R.id.action_settings);
	      b1.setOnClickListener(new View.OnClickListener() {
	         @Override
	         public void onClick(View v) {
	            TextView txtView = (TextView) findViewById(R.id.action_settings);
	            txtView.setTextSize(25);
	         }
	      });
	      
	      b2.setOnClickListener(new View.OnClickListener() {
	         @Override
	         public void onClick(View v) {
	            TextView txtView = (TextView) findViewById(R.id.action_settings);
	            txtView.setTextSize(55);
	         }
	      });
	   }
	   
	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      getMenuInflater().inflate(R.menu.main, menu);
	      return true;
	   }
	   
	   @Override
	   public boolean onOptionsItemSelected(MenuItem item) {
	  
	      
	      int id = item.getItemId();
	      
	    
	      if (id == R.id.action_settings) {
	         return true;
	      }
	      return super.onOptionsItemSelected(item);
	   }
	   public boolean onTouchEvent(motionEvent event){
		   switch(event.getAction()){
		      case TOUCH_DOWN:
		      Toast.makeText(this,"Touch button",Toast.LENGTH_LONG).show();
		      break;
		   
		      case TOUCH_UP:
		      Toast.makeText(this,"up touch button",Toast.LENGTH_LONG).show();
		      break;
		   
		      case TOUCH_MOVE:
		      Toast.makeText(this,"move touch button"Toast.LENGTH_LONG).show();
		      break;
		   }
		   return super.onTouchEvent(event) ;
		}
	}


