package com.example.medicines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Medicine_Updation extends AppCompatActivity {
EditText et1,et2;
Button b1;
AccountsDataBase accountsDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine__updation);
        accountsDataBase=new AccountsDataBase(this);
        et1=findViewById(R.id.updation_et1);
        et2=findViewById(R.id.updation_et2);
        b1=findViewById(R.id.add_bt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                Intent i=getIntent();
                String s3=i.getStringExtra("msg");
                if(s3.equals("Heart"))
                {
                    boolean isInserted=accountsDataBase.insertHeartData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Kidney"))
                {
                    boolean isInserted=accountsDataBase.insertKidneyData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Lung"))
                {
                    boolean isInserted=accountsDataBase.insertLungData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Mental"))
                {
                    boolean isInserted=accountsDataBase.insertMentalData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Stomach"))
                {
                    boolean isInserted=accountsDataBase.insertStomachData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Joint"))
                {
                    boolean isInserted=accountsDataBase.insertJointData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
                if(s3.equals("Liver"))
                {
                    boolean isInserted=accountsDataBase.insertLiverData(s1,s2);
                    if(isInserted)
                        Toast.makeText(Medicine_Updation.this, "Account Created", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(Medicine_Updation.this, "Account not Created", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
