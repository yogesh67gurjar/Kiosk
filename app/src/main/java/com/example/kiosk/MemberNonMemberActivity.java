package com.example.kiosk;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MemberNonMemberActivity extends AppCompatActivity {

    AppCompatButton Member, NonMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_non_member);

        Member = findViewById(R.id.Member);
        Member.setOnClickListener(v -> {
            Intent i = new Intent(MemberNonMemberActivity.this, MemberCodeActivity.class);
            startActivity(i);
            finish();
        });

        NonMember = findViewById(R.id.NonMember);
        NonMember.setOnClickListener(v -> {
            Intent i = new Intent(MemberNonMemberActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}