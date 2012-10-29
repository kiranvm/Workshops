package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button plus = (Button) findViewById(R.id.plusbutton);
        Button about = (Button) findViewById(R.id.aboutButton);
        Button minus = (Button) findViewById(R.id.minusButton);
        Button multiply = (Button) findViewById(R.id.multiplyButton);
        Button divide = (Button) findViewById(R.id.divideButton);
        
        final EditText first = (EditText) findViewById(R.id.firstBox);
	    final EditText second = (EditText) findViewById(R.id.secondBox);
    
       plus.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		    
		    EditText result= (EditText) findViewById(R.id.resultBox);
	        
			
		    
		    String str1 = first.getText().toString();
		    String str2 = second.getText().toString();
		    
		    
		    int num1 = Integer.valueOf(str1);
		    int num2 = Integer.valueOf(str2);
		    
		    int res= num1+num2;
		
			Toast.makeText(getApplicationContext(), String.valueOf(res), Toast.LENGTH_SHORT).show();

			
			result.setText(String.valueOf(res));
			
			
		}
	});
       
       minus.setOnClickListener(new View.OnClickListener() {
   		
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			
   		    
   		    EditText result= (EditText) findViewById(R.id.resultBox);
   	        
   			
   		    
   		    String str1 = first.getText().toString();
   		    String str2 = second.getText().toString();
   		    
   		    
   		    int num1 = Integer.valueOf(str1);
   		    int num2 = Integer.valueOf(str2);
   		    
   		    int res= num1-num2;
   		
   			Toast.makeText(getApplicationContext(), String.valueOf(res), Toast.LENGTH_SHORT).show();

   			
   			result.setText(String.valueOf(res));
   			
   			
   		}
   	});
       
       divide.setOnClickListener(new View.OnClickListener() {
      		
      		public void onClick(View v) {
      			// TODO Auto-generated method stub
      			
      		    
      		    EditText result= (EditText) findViewById(R.id.resultBox);
      	        
      			
      		    
      		    String str1 = first.getText().toString();
      		    String str2 = second.getText().toString();
      		    
      		    
      		    int num1 = Integer.valueOf(str1);
      		    int num2 = Integer.valueOf(str2);
      		    
      		    int res= num1/num2;
      		
      			Toast.makeText(getApplicationContext(), String.valueOf(res), Toast.LENGTH_SHORT).show();

      			
      			result.setText(String.valueOf(res));
      			
      			
      		}
      	});
       
       multiply.setOnClickListener(new View.OnClickListener() {
      		
      		public void onClick(View v) {
      			// TODO Auto-generated method stub
      			
      		    
      		    EditText result= (EditText) findViewById(R.id.resultBox);
      	        
      			
      		    
      		    String str1 = first.getText().toString();
      		    String str2 = second.getText().toString();
      		    
      		    
      		    int num1 = Integer.valueOf(str1);
      		    int num2 = Integer.valueOf(str2);
      		    
      		    int res= num1*num2;
      		
      			Toast.makeText(getApplicationContext(), String.valueOf(res), Toast.LENGTH_SHORT).show();

      			
      			result.setText(String.valueOf(res));
      			
      			
      		}
      	});
       
       about.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {
			Intent intent = new Intent(getApplicationContext(), about.class);
			startActivity(intent);
		}
    	   
       }
    		   );
       
       
        
    }

 
}
