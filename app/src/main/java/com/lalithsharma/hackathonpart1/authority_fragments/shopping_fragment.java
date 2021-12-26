package com.lalithsharma.hackathonpart1.authority_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lalithsharma.hackathonpart1.R;
import com.lalithsharma.hackathonpart1.adapters.shopping_myadapter;
import com.lalithsharma.hackathonpart1.dataModel.datamodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link shopping_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class shopping_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    ArrayList<datamodel> dataHolder;

    public shopping_fragment() {
        // Required empty public constructor



    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment shopping_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static shopping_fragment newInstance(String param1, String param2) {
        shopping_fragment fragment = new shopping_fragment();
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


        View view =  inflater.inflate(R.layout.fragment_shopping_fragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_xml);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();

        int i=1;
        datamodel ob1 = new  datamodel(R.drawable.shopping,"Shop No."+i,"This is a famous clothes shop");
        dataHolder.add(ob1);

        datamodel ob2 = new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a shoe shop");
        dataHolder.add(ob2);

        datamodel ob3= new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a coat shop");
        dataHolder.add(ob3);

        datamodel ob4 = new  datamodel(R.drawable.shopping,"Shop No."+ i++,"This is a gadget shop");
        dataHolder.add(ob4);

        datamodel ob5 = new  datamodel(R.drawable.shopping,"Shop No."+ i++,"This is a clothes shop");
        dataHolder.add(ob5);

        datamodel ob6 = new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob6);

        datamodel ob7 = new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob7);

        datamodel ob8 = new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob8);

        datamodel ob9 = new  datamodel(R.drawable.shopping,"Shop No."+ ++i,"This is a clothes shop");
        dataHolder.add(ob9);

        datamodel ob10 = new  datamodel(R.drawable.shopping,"Shop No."+i,"This is a clothes shop");
        dataHolder.add(ob10);

        recyclerView.setAdapter(new shopping_myadapter(dataHolder));

        return view;
    }
}