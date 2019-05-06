package com.example.medicines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<MedicineList> {
    public ListAdapter(Context context,int resource,ArrayList<MedicineList> medicineLists) {
        super(context, resource,medicineLists);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View v=convertView;
        if(v == null)
        {
            v=LayoutInflater.from(getContext()).inflate(R.layout.medicine_layout,parent,false);
        }
        MedicineList medicineList=getItem(position);
        TextView t1=v.findViewById(R.id.medicine_tv1);
        ImageView t3= v.findViewById(R.id.medicine_iv);
        t1.setText(medicineList.getMedicine_name());
        t3.setImageResource(medicineList.getMedicine_img());
    return v;}
}
