package com.lalithsharma.hackathonpart1.adapters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link gridRecyclerView_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class gridRecyclerView_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView gridView;
    ArrayList<dataModel> dataHolder;

    public gridRecyclerView_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment gridRecyclerView_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static gridRecyclerView_Fragment newInstance(String param1, String param2) {
        gridRecyclerView_Fragment fragment = new gridRecyclerView_Fragment();
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
        // Inflate the layout for this fragment


        View view =  inflater.inflate(R.layout.fragment_grid_recycler_view_, container, false);
        gridView = view.findViewById(R.id.gridView_shopping);
        gridView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();


        dataModel ob1 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob1);

        dataModel ob2 = new dataModel(R.drawable.shopping,"Pants","It is a black color pant with checked lines",100);
        dataHolder.add(ob2);

        dataModel ob3 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob3);

        dataModel ob4 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob4);

        dataModel ob5 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob5);

        dataModel ob6 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob6);

        dataModel ob8 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob8);

        dataModel ob9 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob9);

        dataModel ob10 = new dataModel(R.drawable.shopping,"Shirt","It is a blue color shirt with checked lines",100);
        dataHolder.add(ob10);

        gridView.setAdapter(new gridview_adapter(dataHolder));

        return inflater.inflate(R.layout.fragment_grid_recycler_view_, container, false);
    }
}