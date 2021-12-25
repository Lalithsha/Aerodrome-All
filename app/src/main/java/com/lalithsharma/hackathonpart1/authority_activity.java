package com.lalithsharma.hackathonpart1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.lalithsharma.hackathonpart1.authority_fragments.add_item_fragment;
import com.lalithsharma.hackathonpart1.authority_fragments.food_and_beverages_fragment;
import com.lalithsharma.hackathonpart1.authority_fragments.shopping_fragment;

//implements NavigationBarView.OnItemSelectedListener
public class authority_activity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authority);
        getSupportActionBar().hide();


   //     getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new add_item_fragment()).commit();



        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()) {

                    case R.id.shopping:
                        fragment = new shopping_fragment();
                        break;

                    case R.id.add_items:
                        fragment = new add_item_fragment();
                        break;

                    case R.id.food_beverages:
                        fragment = new food_and_beverages_fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, fragment).commit();

                return true;
            }
        });

    }


}