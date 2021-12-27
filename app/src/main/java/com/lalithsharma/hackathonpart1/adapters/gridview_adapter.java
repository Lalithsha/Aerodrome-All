package com.lalithsharma.hackathonpart1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import java.util.ArrayList;

public class gridview_adapter  extends RecyclerView.Adapter<gridview_adapter.viewHolder> {


    ArrayList<dataModel> dataHolder;

    public gridview_adapter(ArrayList<dataModel> dataHolder) {
        this.dataHolder = dataHolder;
    }


    @NonNull
    @Override
    public gridview_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlecolumndesigntemplate,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull gridview_adapter.viewHolder holder, int position) {

        holder.img.setImageResource(dataHolder.get(position).getImage());
        holder.name.setText(dataHolder.get(position).getHeader());
        holder.description.setText(dataHolder.get(position).getDescription());
        holder.price.setText(dataHolder.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name,description,price;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.gridImage);
            name = itemView.findViewById(R.id.shop_item_Name_gridView);
            description = itemView.findViewById(R.id.shop_item_description_gridView);
            price = itemView.findViewById(R.id.price_gridView);

        }
    }
}
