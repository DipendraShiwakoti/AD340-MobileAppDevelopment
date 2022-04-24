package com.example.ad_340dipendraweek1assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText nameField;
    private EditText emailAddressField;
    private EditText usernameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.nameField);
        emailAddressField = findViewById(R.id.emailAddress);
        usernameField = findViewById(R.id.userName);
    }
    public void onSubmit(View view){
        String name = nameField.getText().toString();
        String emailAddress = emailAddressField.getText().toString();
        String username = usernameField.getText().toString();

        if(name.equals("") || emailAddress.equals("") || username.equals("")){
            Toast.makeText(getApplicationContext(), getString(R.string.Data_entry_error), Toast.LENGTH_LONG).show();
            return;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches() == false){
            Toast.makeText(getApplicationContext(), getString(R.string.email_address_error), Toast.LENGTH_LONG).show();
        }
        /* Intent intent = new Intent(MainActivity.class,WelcomeScreeen.class);
        intent.putExtra(Constants.USERNAME_KEY,username);
        startActivity(intent);

         */
    }
}