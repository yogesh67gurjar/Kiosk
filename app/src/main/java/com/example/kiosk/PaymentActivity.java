package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class PaymentActivity extends AppCompatActivity {

    AppCompatButton pay;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        pay = findViewById(R.id.appCompatButton);
        pay.setOnClickListener(v -> {
            Intent i = new Intent(PaymentActivity.this, OrderSuccessfullyActivity.class);
            startActivity(i);
            finish();
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i = new Intent(PaymentActivity.this, OrderSummaryActivity.class);
            startActivity(i);
            finish();
        });
    }
}