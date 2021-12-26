package com.lalithsharma.hackathonpart1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.lalithsharma.hackathonpart1.R;

import java.util.ArrayList;
import java.util.List;

public class gridApdapter_shopping extends RecyclerView.Adapter<gridApdapter_shopping.ViewHolder> {

    ArrayList<String> titles;
    ArrayList<Integer> images;
    LayoutInflater inflater;
    ArrayList<String> price ;

    public gridApdapter_shopping(Context ctx, ArrayList<String> tittles,ArrayList<Integer> images,ArrayList<String> price){

        this.titles = tittles;
        this.images = images;
        this.price = price;
        this.inflater = LayoutInflater.from(ctx);


    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  inflater.inflate(R.layout.singlecolumndesigntemplate,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }




}
