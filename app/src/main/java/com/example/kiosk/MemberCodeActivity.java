package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MemberCodeActivity extends AppCompatActivity {

    AppCompatButton done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_code);

        done = findViewById(R.id.done);
        done.setOnClickListener(v -> {
            Intent i = new Intent(MemberCodeActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}