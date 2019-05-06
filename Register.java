package com.example.medicines;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
TextView login_t1;
EditText username_et,password_et,confirm_password_et,mobile_et,mail_et;
Button reg;
AccountsDataBase accountsDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        reg=findViewById(R.id.reg_bt);
        accountsDataBase=new AccountsDataBase(this);
        //EditText
        username_et=findViewById(R.id.user_et_id);
        password_et=findViewById(R.id.pass_et_id);
        confirm_password_et=findViewById(R.id.cpass_et_id);
        mobile_et=findViewById(R.id.tel_reg_et);
        mail_et=findViewById(R.id.mail_reg_et);
        //TextView
        login_t1=findViewById(R.id.call_login);
        //For Going to Login Page
        login_t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Register.this,Login.class);
                startActivity(i);
            }
        });
        //Login Page ends here
        checkFieldsForEmptyValues();
        checkPasswords();
        checkLengths();
        TextWatcher tw=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                checkFieldsForEmptyValues();
                checkPasswords();
                checkLengths();
            }
        };
        username_et.addTextChangedListener(tw);
        password_et.addTextChangedListener(tw);
        confirm_password_et.addTextChangedListener(tw);
        mobile_et.addTextChangedListener(tw);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted=accountsDataBase.insertAccounts(username_et.getText().toString(),password_et.getText().toString(),mobile_et.getText().toString(),mail_et.getText().toString());
                if(isInserted)
                    Toast.makeText(Register.this, "Account Created", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Register.this, "Account not Created", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void checkFieldsForEmptyValues()
    {
        String s1=username_et.getText().toString();
        String s2=password_et.getText().toString();
        String s3=confirm_password_et.getText().toString();
        String s4=mobile_et.getText().toString();
        if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") )
        {
            reg.setEnabled(false);
        }
        else {
            reg.setEnabled(true);
        }
    }
    public void checkPasswords()
    {
        String s1=password_et.getText().toString();
        String s2=confirm_password_et.getText().toString();
        if(s1.equals(s2))
        {
            return;
        }
        else {
            reg.setEnabled(false);
        }
    }
    public  void checkLengths()
    {
        int s1=username_et.getText().toString().length();
        int s2=password_et.getText().toString().length();
        int s3=confirm_password_et.getText().toString().length();
        int s4=mobile_et.getText().toString().length();
        if(s1<5 || s2<8 || s3<8 || s4!=10)
        {
            reg.setEnabled(false);
        }
        else {
            return;
        }
    }

    public static class ShowMedicineAdapter {
    }
}
