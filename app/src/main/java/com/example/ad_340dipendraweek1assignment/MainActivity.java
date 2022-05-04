package com.example.ad_340dipendraweek1assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

 public class MainActivity extends AppCompatActivity
         implements DatePickerDialog.OnDateSetListener{
    private EditText nameField;
    private EditText emailAddressField;
    private EditText userNameField;
    private TextView dobTextView;
    private EditText descriptionField;
    private EditText occupationField;

    private int dobYear = 0;
    private int dobMonth = 0;
    private int dobDay = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.nameField);
        emailAddressField = findViewById(R.id.emailAddress);
        userNameField = findViewById(R.id.userName);
        dobTextView = findViewById(R.id.nameAndDate);
        descriptionField = findViewById(R.id.descriptionField);
        occupationField = findViewById(R.id.occupationField);
    }
     public void onSubmit(View view){
        String name = nameField.getText().toString();
        String emailAddress = emailAddressField.getText().toString();
        String username = userNameField.getText().toString();


        if(name.equals("") || emailAddress.equals("") || userNameField.equals("") || dobYear == 0 || dobMonth == 0 || dobDay == 0){
            Toast.makeText(getApplicationContext(), getString(R.string.forget_date_of_Birth), Toast.LENGTH_LONG).show();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()) {
            Toast.makeText(getApplicationContext(), getString(R.string.email_address_error), Toast.LENGTH_LONG).show();
            return;
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(dobYear, dobMonth, dobDay);
        int years = Period.between(dateOfBirth, currentDate).getYears();

        if (years < 18) {
            Toast.makeText(getApplicationContext(),getString(R.string.Eighteen_years_error), Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(getApplicationContext(), WelcomeScreen.class);
        intent.putExtra(Constants.Username_Key, username);
        startActivity(intent);
    }
    public void onDobClick(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


     public void onDateSet(DatePicker view, int year, int month, int day) {
         month = month + 1;
         dobYear = year;
         dobMonth = month;
         dobDay = day;
         dobTextView.setText(month + getString(R.string.slash) + day + getString(R.string.slash) + year);
     }

     public static class DatePickerFragment extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog (Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener) getActivity(), year, month, day);
        }
    }

}

