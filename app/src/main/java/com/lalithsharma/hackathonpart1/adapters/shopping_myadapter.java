package com.lalithsharma.hackathonpart1.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.authority_fragments.gridRecyclerView_Fragment;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class shopping_myadapter extends RecyclerView.Adapter<shopping_myadapter.myviewholder>  {

    ArrayList<datamodel> dataholder;

    public shopping_myadapter(ArrayList<datamodel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design_template,parent,false);
        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.name.setText(dataholder.get(position).getHeader());
        holder.description.setText(dataholder.get(position).getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    gridRecyclerView_Fragment gridRecyclerView_fragment = new gridRecyclerView_Fragment();
                    // here may be some problem
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.horizontalRecyclerView_shopping, gridRecyclerView_fragment).addToBackStack(null).commit();

            }
        });



    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

    ImageView img ;
    TextView name,description;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.shopping_image1);
            name = itemView.findViewById(R.id.shopName);
            description = itemView.findViewById(R.id.shopDescription);

        }
    }
}
