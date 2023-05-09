package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class OrderSuccessfullyActivity extends AppCompatActivity {

    AppCompatButton print;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_successfully);

        print = findViewById(R.id.appCompatButton);
        print.setOnClickListener(v -> {
            Intent i = new Intent(OrderSuccessfullyActivity.this, StartingActivity.class);
            startActivity(i);
            finish();
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent i = new Intent(OrderSuccessfullyActivity.this, PaymentActivity.class);
            startActivity(i);
            finish();
        });

    }
}