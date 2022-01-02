package com.lalithsharma.hackathonpart1.activities_shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.adapters.shopping_gridView_Adapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView;
import com.lalithsharma.hackathonpart1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class gridView_shopping_activity extends AppCompatActivity {

    GridView coursesGV;
    ArrayList<data_model_gridView> dataModel = new ArrayList<>();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_shopping);


        coursesGV = findViewById(R.id.gridView_shopping_activity);




/*
        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
          if(  bundle.getString("some") != null){
              Toast.makeText(getApplicationContext(),"data:"+ bundle.get("some"),Toast.LENGTH_SHORT).show();
          }
        }*/

       /* Intent intent = getIntent();
        String s = intent.getStringExtra("some");*/


        // gfg code
        /*View view =  inflater.inflate(R.layout.fragment_grid_recycler_view_, container, false);
        coursesGV = view.findViewById(R.id.gridView_shopping);*/
        //  coursesGV.setLayoutManager(new LinearLayoutManager(getContext()));

    //    dataModel = new ArrayList<data_model_gridView>();



       /* // gfg code
        dataModel = new ArrayList<data_model_gridView>();*/





        data_model_gridView ob1 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob1);

        data_model_gridView ob2 = new data_model_gridView(R.drawable.shopping,"Pants","It is a black color pant with checked lines",254);
        dataModel.add(ob2);

        data_model_gridView ob3 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",781);
        dataModel.add(ob3);

        data_model_gridView ob4 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",1877);
        dataModel.add(ob4);

        data_model_gridView ob5 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob5);

        data_model_gridView ob6 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob6);

        data_model_gridView ob8 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob8);

        data_model_gridView ob9 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob9);

        data_model_gridView ob10 = new data_model_gridView(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataModel.add(ob10);


        // gfg code
        shopping_gridView_Adapter adapter = new shopping_gridView_Adapter(this,dataModel);
        coursesGV.setAdapter(adapter);
     //   return view;











       /* CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);*/

    }
}