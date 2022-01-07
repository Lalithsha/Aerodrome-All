package com.lalithsharma.hackathonpart1.activities_userActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.activities_shopping.custom_ArrayList_shopping_page;

public class shopping_page_userActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_page_user);



        ImageView img = findViewById(R.id.shopping_page_image_userActivity);
        TextView header  =  findViewById(R.id.shopping_page_item_name_userActivity);
        TextView description = findViewById(R.id.shopping_page_description_userActivity);
        TextView size = findViewById(R.id.shopping_page_size_userActivity);
        TextView  inStock = findViewById(R.id.shopping_page_stock_userActivity);
        TextView price = findViewById(R.id.shopping_page_price_userActivity);




        custom_ArrayList_shopping_page ob1 = new custom_ArrayList_shopping_page(R.drawable.shopping,100,"Shirt",
                "This is a unlike color shirt with differnet design","Medium","Yes");

        img.setImageResource(ob1.getImage());
        header.setText(ob1.getHeader());
        description.setText(ob1.getDescription());
        size.setText(ob1.getSize());
        inStock.setText(ob1.getInStock());
        price.setText(Integer.toString(ob1.getPrice()));
        return  ;



    }
}