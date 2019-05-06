package com.example.medicines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Booking extends AppCompatActivity {
TextView t1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        t1=findViewById(R.id.med_tv1);
        Intent i=getIntent();
        String str=i.getStringExtra("medicine");
        t1.setText(str);
        b1=findViewById(R.id.order_bt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i=new Intent(Booking.this,Order.class);
              i.putExtra("name",t1.getText().toString());
              startActivity(i);
            }
        });
    }
}
