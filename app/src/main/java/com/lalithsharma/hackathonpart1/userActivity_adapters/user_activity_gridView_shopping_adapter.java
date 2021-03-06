package com.lalithsharma.hackathonpart1.userActivity_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.dataModel.data_model_gridView;
import com.lalithsharma.hackathonpart1.dataModel.data_model_userActivity_gridView_shopping;

import java.util.ArrayList;

public class user_activity_gridView_shopping_adapter extends ArrayAdapter<data_model_userActivity_gridView_shopping> {


    public user_activity_gridView_shopping_adapter(@NonNull Context context, ArrayList<data_model_userActivity_gridView_shopping> courseModelArrayList ) {
        super(context, 0, courseModelArrayList);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.single_column_design_shopping_grid_view_user_activity, parent, false);
        }
        data_model_userActivity_gridView_shopping courseModel = getItem(position);
        TextView name = listitemView.findViewById(R.id.shop_item_Name_gridView_userActivity);
        TextView description = listitemView.findViewById(R.id.shop_item_description_gridView_userActivity);
        TextView price = listitemView.findViewById(R.id.price_gridView_userActivity);
        ImageView image = listitemView.findViewById(R.id.gridImage_userActivity);
        name.setText(courseModel.getHeader());
        description.setText(courseModel.getDescription());
        price.setText("₹"+Integer.toString(courseModel.getPrice()).toString());
        image.setImageResource(courseModel.getImage());
        return listitemView;

    }


}
