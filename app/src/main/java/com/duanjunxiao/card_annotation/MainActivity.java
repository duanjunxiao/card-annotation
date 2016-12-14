package com.duanjunxiao.card_annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.duanjunxiao.lib.annotation.CardMap;

@CardMap(A.class)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
