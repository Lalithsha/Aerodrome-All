package com.lalithsharma.hackathonpart1.activities_shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lalithsharma.hackathonpart1.R;

import org.w3c.dom.Text;

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
       TextView price = findViewById(R.id.shopping_page_price);




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