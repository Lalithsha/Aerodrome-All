package com.lalithsharma.hackathonpart1.userActivity_adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.activities_shopping.gridView_shopping_activity;
import com.lalithsharma.hackathonpart1.activities_userActivity.gridView_shopping_activity_userActivity;
import com.lalithsharma.hackathonpart1.adapters.shopping_myadapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_userActivity_listView;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import java.util.ArrayList;

public class user_activity_listView_adapter extends   RecyclerView.Adapter<user_activity_listView_adapter.myviewholderUserActivity> {

    ArrayList<data_model_userActivity_listView> dataholder;
    Activity context;

    public user_activity_listView_adapter(ArrayList<data_model_userActivity_listView> dataholder, Activity context) {
        this.dataholder = dataholder;
        this.context = context;
    }

    public user_activity_listView_adapter(ArrayList<data_model_userActivity_listView> dataholder) {
        this.dataholder = dataholder;
    }


    @NonNull
    @Override
    public myviewholderUserActivity onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design_template_user_activity_list_view,parent,false);

        return new user_activity_listView_adapter.myviewholderUserActivity(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_activity_listView_adapter.myviewholderUserActivity holder, int position) {

        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.name.setText(dataholder.get(position).getHeader());
        holder.description.setText(dataholder.get(position).getDesc());


        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.name.setText(dataholder.get(position).getHeader());
        holder.description.setText(dataholder.get(position).getDesc());

        holder.mainView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, gridView_shopping_activity_userActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    public class myviewholderUserActivity extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, description;
        View mainView;

        public myviewholderUserActivity(@NonNull View itemView) {
            super(itemView);
            mainView = itemView;

            img = itemView.findViewById(R.id.shopping_userActivity_listView_image1);
            name = itemView.findViewById(R.id.shopName_userActivity_listView);
            description = itemView.findViewById(R.id.shopDescription_userActivity_listview);


        }
    }
}
