package com.example.jabyq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edit_phone, enter_iin;
    private String phone_num;
    private CheckBox checkBox;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String PHONE_NUMBER = "phoneNumber";
    public static final String IIN = "iiN";

    private String phoneNumberS, iinS;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edit_phone = findViewById(R.id.edit_phone);
        enter_iin = findViewById(R.id.enter_iin);
        checkBox = findViewById(R.id.cb_policy);

        loadData();
    }
