package com.example.variablegetname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    String varname = "test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate_name: "+varname.getClass().getName());
        Field fld[] = MainActivity.class.getDeclaredFields();
        for (Field f : fld){
            String name = f.toString().substring(f.toString().lastIndexOf('.')+1);
            Log.d(TAG, "onCreate_name: "+name);
        }
    }
}