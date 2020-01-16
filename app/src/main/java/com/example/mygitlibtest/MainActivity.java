package com.example.mygitlibtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylib.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String string = Utils.getStr();
		
		//试一下会是怎么样的
    }
}
