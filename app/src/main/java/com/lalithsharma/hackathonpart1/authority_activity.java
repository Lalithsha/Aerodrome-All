package com.lalithsharma.hackathonpart1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class authority_activity extends AppCompatActivity {

    BottomNavigationView bottom_navigation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authority);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.shopping:
                        Toast.makeText(authority_activity.this, "Shopping", Toast.LENGTH_SHORT).show();

                    case R.id.add:
                        Toast.makeText(authority_activity.this, "add item", Toast.LENGTH_SHORT).show();

                    case R.id.food_beverages:
                        Toast.makeText(authority_activity.this, "Food and beverages", Toast.LENGTH_SHORT).show();
                }




                return true;
            }
        });


    }
}