package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class OrderSummaryActivity extends AppCompatActivity {

    AppCompatButton pay;
    ImageButton back;
    TextView apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        pay = findViewById(R.id.pay);
        pay.setOnClickListener(v -> {
            Intent i = new Intent(OrderSummaryActivity.this, PaymentActivity.class);
            startActivity(i);
            finish();
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i = new Intent(OrderSummaryActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });

        apply = findViewById(R.id.apply);
        apply.setOnClickListener(v -> {
            Intent i = new Intent(OrderSummaryActivity.this, QRcodeActivity.class);
            startActivity(i);
        });
    }
}