package com.lalithsharma.hackathonpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button authorityBtn = findViewById(R.id.authority);
        authorityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent authorityItn = new Intent(MainActivity.this,authority_activity.class);
                startActivity(authorityItn);
            }
        });

        Button userBtn = findViewById(R.id.user);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userItn = new Intent(MainActivity.this,user_activity.class);
                startActivity(userItn);
            }
        });

    }
}