package com.lalithsharma.hackathonpart1.activities_userActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.activities_shopping.shopping_page;
import com.lalithsharma.hackathonpart1.adapters.shopping_gridView_Adapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView;
import com.lalithsharma.hackathonpart1.dataModel.data_model_userActivity_gridView_shopping;
import com.lalithsharma.hackathonpart1.databinding.ActivityMainBinding;
import com.lalithsharma.hackathonpart1.userActivity_adapters.user_activity_gridView_shopping_adapter;

import java.util.ArrayList;

public class gridView_shopping_activity_userActivity extends AppCompatActivity {

    GridView coursesGV;
    ArrayList<data_model_userActivity_gridView_shopping> dataModel = new ArrayList<>();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_shopping_user);

        coursesGV = findViewById(R.id.gridView_shopping_activity_userActivity);

        coursesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),new shopping_page_userActivity().getClass());
                startActivity(intent);
            }
        });




        data_model_userActivity_gridView_shopping ob1 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob1);

        data_model_userActivity_gridView_shopping ob2 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Pants","It is a black color pant with checked lines",254);
        dataModel.add(ob2);

        data_model_userActivity_gridView_shopping ob3 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",781);
        dataModel.add(ob3);

        data_model_userActivity_gridView_shopping ob4 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",1877);
        dataModel.add(ob4);

        data_model_userActivity_gridView_shopping ob5 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob5);

        data_model_userActivity_gridView_shopping ob6 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob6);

        data_model_userActivity_gridView_shopping ob8 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",107);
        dataModel.add(ob8);

        data_model_userActivity_gridView_shopping ob9 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",1000);
        dataModel.add(ob9);

        data_model_userActivity_gridView_shopping ob10 = new data_model_userActivity_gridView_shopping(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob10);


        // gfg code
        user_activity_gridView_shopping_adapter adapter = new user_activity_gridView_shopping_adapter(this,dataModel);
        coursesGV.setAdapter(adapter);



    }
}