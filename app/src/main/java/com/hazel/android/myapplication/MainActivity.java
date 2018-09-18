package com.hazel.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkStatus();
    }

    private void checkStatus(){
        String name="Branch 01 checkout";
        int i=1;
        Log.d("Aniket","Updated"+i);
    }
}
