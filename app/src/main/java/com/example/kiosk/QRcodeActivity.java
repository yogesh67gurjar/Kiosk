package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QRcodeActivity extends AppCompatActivity {

    ImageButton back;
    AppCompatButton apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i = new Intent(QRcodeActivity.this, OrderSummaryActivity.class);
            startActivity(i);
            finish();
        });

        apply = findViewById(R.id.apply);
        apply.setOnClickListener(v -> {
            Intent i = new Intent(QRcodeActivity.this, OrderSummaryActivity.class);
            startActivity(i);
            finish();
        });
    }
}