package com.example.ad_340dipendraweek1assignment;

import android.os.Bundle;

public class WelcomeScreen {
    private TextView welcomeText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setConstantView(R.layout.activity_welcomeTeext);
        welcomeText = findViewById(R.id.welcomeText);
        
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        
        if (bundle != null) {
            if(bundle.containsKey(Constants.USERNAEM_KEY)){
                welcomeText.setText(.getString(R.string.singning_up) + bundle.getString(Constants.USERNAME_KEY)
                + ("!"));
            }
        }
        
    }
}
