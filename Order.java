package com.example.medicines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {
    EditText e1,e2,e3,e4;
Button b1;
AccountsDataBase accountsDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        accountsDataBase=new AccountsDataBase(this);
        b1=findViewById(R.id.book_bt);
        e1=findViewById(R.id.order_et1);
        e2=findViewById(R.id.order_et2);
        e3=findViewById(R.id.order_et3);
        e4=findViewById(R.id.order_et4);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i=getIntent();
                 String str=i.getStringExtra("name");
                 String s1=e1.getText().toString();
                 String s2=e2.getText().toString();
                 String s3=e3.getText().toString();
                 String s4=e4.getText().toString();
                 boolean isInserted=accountsDataBase.insertOrdersData(s1,s2,s3,str,s4);
                 if(isInserted)
                     Toast.makeText(Order.this, "Order Send", Toast.LENGTH_SHORT).show();
                 else
                     Toast.makeText(Order.this, "Order Not send", Toast.LENGTH_SHORT).show();
             }
         });
    }
}
