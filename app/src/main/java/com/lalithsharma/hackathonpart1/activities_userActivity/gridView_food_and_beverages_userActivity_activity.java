package com.lalithsharma.hackathonpart1.activities_userActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.adapters.food_and_beverages_gridView_adapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView_food_and_beverages;
import com.lalithsharma.hackathonpart1.dataModel.data_model_userActivity_gridView_food_and_beverages;
import com.lalithsharma.hackathonpart1.food_and_beverages_activities.food_and_beverages_page;
import com.lalithsharma.hackathonpart1.userActivity_adapters.user_activity_gridView_food_and_beverages_adapter;

import java.util.ArrayList;

public class gridView_food_and_beverages_userActivity_activity extends AppCompatActivity {

    GridView coursesGV;
    ArrayList<data_model_userActivity_gridView_food_and_beverages> dataModel = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_food_and_beverages_user_activity);

        coursesGV = findViewById(R.id.gridView_food_and_beverages_activity_userActivity);

        coursesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),new food_and_beverages_page_userActivity().getClass());
                startActivity(intent);
            }
        });


        data_model_userActivity_gridView_food_and_beverages ob1 =
                new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"veg-burger shop","It has some good variety of vegan burgers",50);
        dataModel.add(ob1);

        data_model_userActivity_gridView_food_and_beverages ob2 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Organic burgers","Here all the burgers are made up of organic items",354);
        dataModel.add(ob2);

        data_model_userActivity_gridView_food_and_beverages ob3 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Coffee shop","Well known coffee shop of madras",781);
        dataModel.add(ob3);

        data_model_userActivity_gridView_food_and_beverages ob4 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",1877);
        dataModel.add(ob4);

        data_model_userActivity_gridView_food_and_beverages ob5 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob5);

        data_model_userActivity_gridView_food_and_beverages ob6 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob6);

        data_model_userActivity_gridView_food_and_beverages ob8 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",107);
        dataModel.add(ob8);

        data_model_userActivity_gridView_food_and_beverages ob9 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",1000);
        dataModel.add(ob9);

        data_model_userActivity_gridView_food_and_beverages ob10 = new data_model_userActivity_gridView_food_and_beverages(R.drawable.beverage,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob10);



        user_activity_gridView_food_and_beverages_adapter adapter = new user_activity_gridView_food_and_beverages_adapter(this,dataModel);
        coursesGV.setAdapter(adapter);



    }
}