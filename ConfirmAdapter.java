package com.example.medicines;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ConfirmAdapter extends ArrayAdapter<ConfirmDataModel> {
    public ConfirmAdapter(Context context, int resource, ArrayList<ConfirmDataModel> confirmDataModels) {
        super(context, resource,confirmDataModels);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(v == null)
        {
            v= LayoutInflater.from(getContext()).inflate(R.layout.confirm_layout,parent,false);
        }
        final ConfirmDataModel confirmDataModel=getItem(position);
        TextView t1=v.findViewById(R.id.cnf_t1);
        TextView t2=v.findViewById(R.id.cnf_t2);
        TextView t3=v.findViewById(R.id.cnf_t3);
        TextView t4=v.findViewById(R.id.cnf_t4);
        TextView t5=v.findViewById(R.id.cnf_t5);
        Button b=v.findViewById(R.id.cnf_bt);
        t1.setText(confirmDataModel.getT1());
        t2.setText(confirmDataModel.getT2());
        t3.setText(confirmDataModel.getT3());
        t4.setText(confirmDataModel.getT4());
        t5.setText(confirmDataModel.getT5());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SENDTO);
                i.setType("text/plain");
                i.setData(Uri.parse("mailto:"+confirmDataModel.getT3()));
                i.putExtra(Intent.EXTRA_SUBJECT,"Order for Medicine:");
                i.putExtra(Intent.EXTRA_TEXT,"Medicine:"+confirmDataModel.getT5());
                getContext().startActivity(i);
            }
        });

        return v;}
}
