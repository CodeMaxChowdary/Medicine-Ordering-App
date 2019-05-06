package com.example.medicines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StaffActivity extends AppCompatActivity {
Button heart_bt,kidney_bt,lung_bt,mental_bt,stomach_bt,joint_bt,liver_bt;
Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        heart_bt=findViewById(R.id.staff_bt1);
        kidney_bt=findViewById(R.id.staff_bt2);
        lung_bt=findViewById(R.id.staff_bt3);
        mental_bt=findViewById(R.id.staff_bt4);
        stomach_bt=findViewById(R.id.staff_bt5);
        joint_bt=findViewById(R.id.staff_bt6);
        liver_bt=findViewById(R.id.staff_bt7);
        order=findViewById(R.id.staff_bt8);

        heart_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Heart");
                startActivity(i);
            }
        });

        kidney_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Kidney");
                startActivity(i);
            }
        });

        lung_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Lung");
                startActivity(i);
            }
        });

        mental_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Mental");
                startActivity(i);
            }
        });
        stomach_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Stomach");
                startActivity(i);
            }
        });
        joint_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Joint");
                startActivity(i);
            }
        });
        liver_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,Medicine_Updation.class);
                i.putExtra("msg","Liver");
                startActivity(i);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(StaffActivity.this,ConfirmActivity.class);
                startActivity(i);
            }
        });
    }
}
