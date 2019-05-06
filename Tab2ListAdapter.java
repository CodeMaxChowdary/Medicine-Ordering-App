package com.example.medicines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tab2ListAdapter extends ArrayAdapter<Tab2DataModel> {
    public Tab2ListAdapter( Context context, int resource,ArrayList<Tab2DataModel> model) {
        super(context, resource,model);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v == null)
        {
            v= LayoutInflater.from(getContext()).inflate(R.layout.tab2layout,parent,false);
        }
        Tab2DataModel tab2DataModel=getItem(position);
        TextView t1=v.findViewById(R.id.tab2_t1);
        TextView t2=v.findViewById(R.id.tab2_t2);
        ImageView t3= v.findViewById(R.id.tab2_iv);
        t1.setText(tab2DataModel.getT1());
        t2.setText(tab2DataModel.getT2());
        t3.setImageResource(tab2DataModel.getImg_id());
        return v;}
}
