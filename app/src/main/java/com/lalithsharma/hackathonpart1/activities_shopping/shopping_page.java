package com.lalithsharma.hackathonpart1.activities_shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lalithsharma.hackathonpart1.R;

import java.util.ArrayList;

public class shopping_page extends AppCompatActivity {



    ArrayList<custom_ArrayList_shopping_page> dataModels = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_page);

       ImageView img = findViewById(R.id.shopping_page_image);
       TextView header  =  findViewById(R.id.shopping_page_item_name);
       TextView description = findViewById(R.id.shopping_page_description);
       TextView size = findViewById(R.id.shopping_page_size);
       TextView  inStock = findViewById(R.id.shopping_page_stock);




        custom_ArrayList_shopping_page ob1 = new custom_ArrayList_shopping_page(R.drawable.shopping,100,"Shirt",
                "This is a unlike color shirt with differnet design","Medium","Yes");

   //     img.setImageResource(R.id.shopping_page_image);
        return  ;

    }
}