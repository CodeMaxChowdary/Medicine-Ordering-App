package com.example.medicines;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2 extends Fragment {


    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_tab2, container, false);
        ListView listView=v.findViewById(R.id.tab2_lv);
        ArrayList<Tab2DataModel> arrayList=new ArrayList<>();
        arrayList.add(new Tab2DataModel("Heart","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food\n" +
                "4.Drink More Water",R.drawable.heart1));
        arrayList.add(new Tab2DataModel("Kidney","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food\n4.Drink More Water",R.drawable.kidney));
        arrayList.add(new Tab2DataModel("Lung","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food",R.drawable.lung));
        arrayList.add(new Tab2DataModel("Mental","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food",R.drawable.mental_care));
        arrayList.add(new Tab2DataModel("Stomach","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food",R.drawable.stomach));
        arrayList.add(new Tab2DataModel("Joint","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food",R.drawable.joints));
        arrayList.add(new Tab2DataModel("Liver","1.Give up Smoking\n" +
                "2.Get active\n" +
                "3.Eat Fibre Food",R.drawable.liver));

        Tab2ListAdapter listAdapter=new Tab2ListAdapter(getContext(),R.layout.tab2layout,arrayList);
        listView.setAdapter(listAdapter);
        return v;
    }

}
