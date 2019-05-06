package com.example.medicines;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Tab1 extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_tab1, container, false);
       ListView listView=v.findViewById(R.id.lv);
       ArrayList<MedicineList> a=new ArrayList<>();
       a.add(new MedicineList("Heart Care",R.drawable.heart1));
        a.add(new MedicineList("Kidney Care",R.drawable.kidney));
        a.add(new MedicineList("Lung Care",R.drawable.lung));
        a.add(new MedicineList("Mental Care",R.drawable.mental_care));
        a.add(new MedicineList("Stomach Care",R.drawable.stomach));
        a.add(new MedicineList("Joint Care",R.drawable.joints));
        a.add(new MedicineList("Liver care",R.drawable.liver));


       ListAdapter listAdapter=new ListAdapter(getContext(),R.layout.medicine_layout,a);
       listView.setAdapter(listAdapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if(position==0)
              {
                  Intent i=new Intent(getContext(),ShowMedicines.class);
                  i.putExtra("msg","Heart");
                  startActivity(i);
              }
               if(position==1)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Kidney");
                   startActivity(i);
               }
               if(position==2)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Lung");
                   startActivity(i);
               }
               if(position==3)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Mental");
                   startActivity(i);
               }
               if(position==4)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Stomach");
                   startActivity(i);
               }
               if(position==5)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Joint");
                   startActivity(i);
               }
               if(position==6)
               {
                   Intent i=new Intent(getContext(),ShowMedicines.class);
                   i.putExtra("msg","Liver");
                   startActivity(i);
               }
           }
       });
        return v;



    }


}
