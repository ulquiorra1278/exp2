package com.example.exp2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
	        Button myBtn = (Button)this.findViewById(R.id.button1);
	        myBtn.setOnClickListener(new OnClickListener(){
	        	@Override
	        	public void onClick(View v){
	        		EditText user = (EditText)findViewById(R.id.editText2);
	        		EditText pass = (EditText)findViewById(R.id.editText1);
	        		CharSequence userText = user.getText();
	        		CharSequence passText = pass.getText();
	        		Toast toast = Toast.makeText(getApplicationContext(), "’À∫≈:"+userText.toString()+" √‹¬Î:"+passText.toString(), Toast.LENGTH_SHORT);
	        		toast.show();
	   //     		setTitle("’À∫≈:"+userText.toString()+" √‹¬Î:"+passText.toString());
	        	}
	        });
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        // Handle action bar item clicks here. The action bar will
	        // automatically handle clicks on the Home/Up button, so long
	        // as you specify a parent activity in AndroidManifest.xml.
	        int id = item.getItemId();
	        if (id == R.id.action_settings) {
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
	}
