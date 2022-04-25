
package com.example.ad_340dipendraweek1assignment;


import android.content.Intent;
import android.os.Bundle;
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
            if(bundle.containsKey(Constants.USERNAEM_KEY)){
                welcomeText.setText("Thanks for signing up" + bundle.getString(Constants.USERNAME_KEY) +"!");
            }
        }
        
    }

    private void setConstantView(int activity_welcomescreen) {
    }
}

