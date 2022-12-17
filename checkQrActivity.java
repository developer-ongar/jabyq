package com.example.jabyq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CheckQrActivity extends AppCompatActivity implements Animation.AnimationListener {

    private String mJSONURLString = "https://stat.gov.kz/api/juridical/counter/api/?bin=";
    private String phoneNumberS, iinS;
    //150940005230 &lang=ru

    private TextView entry_place, biin1, entrynum1, scan_time, expiry_time, phone_number, iin, status_display;
    private Context mContext;
    private CountDownTimer countDownTimer;
    private long timeLeft = 300000; // 5 минут
    private boolean timerRunning;
    private Animation anim;
    private CardView card;
    private ImageView image_info;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String P
      HONE_NUMBER = "phoneNumber";
    public static final String IIN = "iiN";
