package com.example.medicines;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ConfirmActivity extends AppCompatActivity {
AccountsDataBase accountsDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        accountsDataBase=new AccountsDataBase(this);
        ListView listView=findViewById(R.id.cnf_lv);
        ArrayList<ConfirmDataModel> arrayList=new ArrayList<>();
        Cursor res = accountsDataBase.getOrdersData();
        if (res.getCount() == 0) {
            ShowMessage("Error", "Nothing found");
            return;
        }
        while (res.moveToNext())
        {
            String s1=res.getString(1);
            String s2=res.getString(2);
            String s3=res.getString(3);
            String s4=res.getString(4);
            String s5=res.getString(5);
            arrayList.add(new ConfirmDataModel(s1,s2,s3,s5,s4));
            ConfirmAdapter confirmAdapter=new ConfirmAdapter(getApplicationContext(),R.layout.confirm_layout,arrayList);
            listView.setAdapter(confirmAdapter);
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
