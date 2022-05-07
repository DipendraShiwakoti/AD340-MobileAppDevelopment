
package com.example.ad_340dipendraweek1assignment;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class WelcomeScreen extends AppCompatActivity {

    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);
        welcomeText = findViewById(R.id.welcomeText);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            if (bundle.containsKey(Constants.USERNAME_KEY)) {
                welcomeText.setText(getString(R.string.Thank_you_message) + bundle.getString(Constants.USERNAME_KEY) +getString(R.string.exclamaion));
            }
        }
    }

    public void onBackClick(View view) {

        finish();
    }
}





