package com.lalithsharma.hackathonpart1.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.activities_shopping.gridView_shopping_activity;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView;


import java.util.ArrayList;

/*
  public class shopping_gridView_Adapter extends RecyclerView.Adapter<shopping_gridView_Adapter.gridViewHolder> {


      ArrayList<data_model_gridView> dataholder;

      public shopping_gridView_Adapter(ArrayList<data_model_gridView> dataholder) {
          this.dataholder = dataholder;
      }


      @NonNull
      @Override
      public gridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

          View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlecolumndesigntemplate, parent, false);
          return new gridViewHolder(view);

      }

      @Override
      public void onBindViewHolder(@NonNull shopping_gridView_Adapter.gridViewHolder holder, int position) {
          holder.image.setImageResource(dataholder.get(position).getImage());
          holder.name.setText(dataholder.get(position).getHeader());
          holder.description.setText(dataholder.get(position).getDescription());
          holder.price.setText(dataholder.get(position).getPrice());

      }


     */
/* @Override
      public void onBindViewHolder(@NonNull gridViewHolder holder, int position) {

      }*//*


      @Override
      public int getItemCount() {
          return dataholder.size();
      }

      public class gridViewHolder extends RecyclerView.ViewHolder {
          TextView name,description,price;
          ImageView image;

          public gridViewHolder(@NonNull View itemView) {
              super(itemView);

              image = itemView.findViewById(R.id.gridImage);
              name = itemView.findViewById(R.id.shop_item_Name_gridView);
              description = itemView.findViewById(R.id.shop_item_description_gridView);
              price = itemView.findViewById(R.id.price_gridView);

          }
  }
*/






// gfg code
    public class shopping_gridView_Adapter extends ArrayAdapter<data_model_gridView> {




        public shopping_gridView_Adapter(@NonNull Context context, ArrayList<data_model_gridView> courseModelArrayList) {
            super(context, 0, courseModelArrayList);
        }

        

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listitemView = convertView;
            if (listitemView == null) {
                // Layout Inflater inflates each item to be displayed in GridView.
                listitemView = LayoutInflater.from(getContext()).inflate(R.layout.single_column_design_template, parent, false);
            }
            data_model_gridView courseModel = getItem(position);
            TextView name = listitemView.findViewById(R.id.shop_item_Name_gridView);
            TextView description = listitemView.findViewById(R.id.shop_item_description_gridView);
            TextView price = listitemView.findViewById(R.id.price_gridView);
            ImageView image = listitemView.findViewById(R.id.gridImage);
            name.setText(courseModel.getHeader());
            description.setText(courseModel.getDescription());
            price.setText(Integer.toString(courseModel.getPrice()).toString());
            image.setImageResource(courseModel.getImage());
            return listitemView;

        }


    }






    /*class gridViewHolder  extends RecyclerView.ViewHolder {
        }
    }*/



