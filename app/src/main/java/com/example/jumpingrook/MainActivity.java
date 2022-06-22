package com.example.jumpingrook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
    // This is the main Menu

    public static final String EXTRA_MESSAGE = "com.example.jumpingrook.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLevelOne(View view){
        Intent intent = new Intent(this, level_one.class);
        startActivity(intent);
    }

    public void toLevelTwo(View view){
        Intent intent = new Intent(this, level_two.class);
        startActivity(intent);
    }
}