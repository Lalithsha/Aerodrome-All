package com.lalithsharma.hackathonpart1.authority_fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.adapters.food_and_beverages_listView_adapter;
import com.lalithsharma.hackathonpart1.dataModel.data_model_listView_food_and_beverages;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link food_and_beverages_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class food_and_beverages_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    ArrayList<data_model_listView_food_and_beverages>  dataHolder;
    Activity context;
    food_and_beverages_listView_adapter food_and_beverages_listView_adapter_inside;


    public food_and_beverages_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment food_and_beverages_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static food_and_beverages_fragment newInstance(String param1, String param2) {
        food_and_beverages_fragment fragment = new food_and_beverages_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_food_and_beverages_fragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_food_and_beverages_xml);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();

        context = getActivity();

        int i=1;
        data_model_listView_food_and_beverages ob1 = new data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+i,"This is a famous burger shop");
        dataHolder.add(ob1);

        data_model_listView_food_and_beverages ob2 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a pizza shop");
        dataHolder.add(ob2);

        data_model_listView_food_and_beverages ob3=  new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a north indian food shop");
        dataHolder.add(ob3);

        data_model_listView_food_and_beverages ob4 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a chinese shop");
        dataHolder.add(ob4);

        data_model_listView_food_and_beverages ob5 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob5);

        data_model_listView_food_and_beverages ob6 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob6);

        data_model_listView_food_and_beverages ob7 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob7);

        data_model_listView_food_and_beverages ob8 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob8);

        data_model_listView_food_and_beverages ob9 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob9);

        data_model_listView_food_and_beverages ob10 = new  data_model_listView_food_and_beverages(R.drawable.beverage,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob10);

        food_and_beverages_listView_adapter_inside  = new food_and_beverages_listView_adapter(dataHolder,getActivity());
        recyclerView.setAdapter(food_and_beverages_listView_adapter_inside);
        food_and_beverages_listView_adapter_inside.notifyDataSetChanged();
        return view;



        /*recyclerView.setAdapter(new food_and_beverages_listView_adapter(dataHolder));
        return view;*/

    }
}