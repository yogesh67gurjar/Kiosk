package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class StartingActivity extends AppCompatActivity {

    AppCompatButton order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        order = findViewById(R.id.order);
        order.setOnClickListener(v -> {
            Intent i = new Intent(StartingActivity.this, MemberNonMemberActivity.class);
            startActivity(i);
            finish();
        });
    }
}