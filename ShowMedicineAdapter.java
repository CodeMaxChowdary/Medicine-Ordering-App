package com.example.medicines;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowMedicineAdapter extends ArrayAdapter<MedicineCome> {

    public ShowMedicineAdapter(Context context, int resource, ArrayList<MedicineCome> showMedicines) {
        super(context, resource,showMedicines);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View v=convertView;
        if(v == null)
        {
            v= LayoutInflater.from(getContext()).inflate(R.layout.show_medicines,parent,false);
        }
        final MedicineCome medicineCome=getItem(position);
        TextView t1=v.findViewById(R.id.show_med_t1);
        TextView t3= v.findViewById(R.id.show_med_t2);
        Button button=v.findViewById(R.id.showmed_bt);
        t1.setText(medicineCome.getMedicine());
        t3.setText(medicineCome.getMed_desc());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),Booking.class);
                i.putExtra("medicine",medicineCome.getMedicine());
                getContext().startActivity(i);
            }
        });
        return v;
    }
}
