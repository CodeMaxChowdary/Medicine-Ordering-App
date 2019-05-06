package com.example.medicines;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowMedicines extends AppCompatActivity {
AccountsDataBase accountsDataBase;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_medicines);
        accountsDataBase=new AccountsDataBase(this);
        Intent i=getIntent();
        String text=i.getStringExtra("msg");
        ListView listView=findViewById(R.id.show_lv);
        b1=findViewById(R.id.showmed_bt);
        ArrayList<MedicineCome> a=new ArrayList<>();
        if(text.equals("Heart"))
        {
            Cursor res = accountsDataBase.getHeartData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Kidney"))
        {
            Cursor res = accountsDataBase.getKidneyData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Lung"))
        {
            Cursor res = accountsDataBase.getLungData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Mental"))
        {
            Cursor res = accountsDataBase.getMentalData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Stomach"))
        {
            Cursor res = accountsDataBase.getStomachData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Joint"))
        {
            Cursor res = accountsDataBase.getJointData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
        if(text.equals("Liver"))
        {
            Cursor res = accountsDataBase.getLiverData();
            if (res.getCount() == 0) {
                ShowMessage("Error", "Nothing found");
                return;
            }
            while (res.moveToNext())
            {
                String name, pass;
                name = res.getString(1);
                pass = res.getString(2);
                a.add(new MedicineCome(name,pass));
                ShowMedicineAdapter listAdapter=new ShowMedicineAdapter(ShowMedicines.this,R.layout.show_medicines,a);
                listView.setAdapter(listAdapter);
            }
        }
    }
    public  void ShowMessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }
}
