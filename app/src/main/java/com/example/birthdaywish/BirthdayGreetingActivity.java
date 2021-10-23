package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        TextView txtView = (TextView) findViewById(R.id.BirthdayGreeting);
        txtView.setText("Happy Birthday "+"\n"+message);
    }
}