package com.example.myapplication32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //打不过我吧
        //niguola
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 30;
    //zhi分支改动
    public void bigger(View view) {
        Button button = (Button)findViewById(R.id.joe);
        button.setTextSize(++size);
    }
}
