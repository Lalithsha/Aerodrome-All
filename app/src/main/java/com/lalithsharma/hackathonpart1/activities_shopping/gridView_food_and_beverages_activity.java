package com.lalithsharma.hackathonpart1.activities_shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.adapters.food_and_beverages_gridView_adapter;
import com.lalithsharma.hackathonpart1.adapters.shopping_gridView_Adapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView_food_and_beverages;
import com.lalithsharma.hackathonpart1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class gridView_food_and_beverages_activity extends AppCompatActivity {

    GridView coursesGV;
    ArrayList<data_model_gridView_food_and_beverages> dataModel = new ArrayList<>();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_food_and_beverages);

        coursesGV = findViewById(R.id.gridView_food_and_beverages_activity);


        data_model_gridView_food_and_beverages ob1 = new data_model_gridView_food_and_beverages(R.drawable.beverage,"veg-burger shop","It has some good variety of vegan burgers",50);
        dataModel.add(ob1);

        data_model_gridView_food_and_beverages ob2 = new data_model_gridView_food_and_beverages(R.drawable.beverage,"This is a vegan burger","It has whole wheat and lots of vegetables",254);
        dataModel.add(ob2);

        data_model_gridView_food_and_beverages ob3 = new data_model_gridView_food_and_beverages(R.drawable.beverage,"Coffee shop","It is a blue color shirt with checked lines",781);
        dataModel.add(ob3);

        data_model_gridView_food_and_beverages ob4 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",1877);
        dataModel.add(ob4);

        data_model_gridView_food_and_beverages ob5 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob5);

        data_model_gridView_food_and_beverages ob6 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob6);

        data_model_gridView_food_and_beverages ob8 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",107);
        dataModel.add(ob8);

        data_model_gridView_food_and_beverages ob9 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",1000);
        dataModel.add(ob9);

        data_model_gridView_food_and_beverages ob10 = new data_model_gridView_food_and_beverages(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob10);

        food_and_beverages_gridView_adapter adapter = new food_and_beverages_gridView_adapter(this,dataModel);
        coursesGV.setAdapter(adapter);


    }
}