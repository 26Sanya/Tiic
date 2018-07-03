package com.sanya.yogyam.v2.simple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.rmiri.buttonloading.ButtonLoading;

public class about extends AppCompatActivity {
ButtonLoading buttonLoading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        buttonLoading=findViewById(R.id.btn);
        buttonLoading.setOnButtonLoadingListener(new ButtonLoading.OnButtonLoadingListener() {
            @Override
            public void onClick() {

                about.this.onStart();
            }

            @Override
            public void onStart() {
                onFinish();
            }

            @Override
            public void onFinish() {

                Intent i = new Intent(about.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
