
package com.example.ad_340dipendraweek1assignment;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


 public class WelcomeScreen extends AppCompatActivity {
    private TextView welcomeText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setConstantView(R.layout.activity_welcomescreen);
       welcomeText = findViewById(R.id.welcomeText);
        
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        
       if (bundle != null) {
            if(bundle.containsKey(Constants.Username_Key)){
                welcomeText.setText(getString(R.string.Thank_You) + bundle.getString(Constants.Username_Key) +"!");
            }
        }
        
    }

    private void setConstantView(int activity_welcomescreen) {
    }

     public void onBackClick(View view) {
     }
 }





