package com.example.firstwork;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        EditText edt_now, edt_plan, edt_fact, edt_time;
        TextView tv_percent;
        edt_now = findViewById(R.id.edt_now);
        edt_plan = findViewById(R.id.edt_plan);
        edt_fact = findViewById(R.id.edt_fact);
        edt_time = findViewById(R.id.edt_time);
        tv_percent = findViewById(R.id.tv_percent);
        //把字母变成大写的
        edt_now.setTransformationMethod(new CapitalLetter(true));

    }

}