package com.example.medicines;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class Login extends AppCompatActivity {
EditText user_id,pass_id;
Button login;
CheckBox checkBox;
AccountsDataBase accountsDataBase;
boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        accountsDataBase=new AccountsDataBase(this);
        user_id=findViewById(R.id.user_id);
        pass_id=findViewById(R.id.pass_id);
        login=findViewById(R.id.login_id);
        checkBox=findViewById(R.id.check_id);
        checkFields();
        TextWatcher tw=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
              checkFields();
            }
        };
        user_id.addTextChangedListener(tw);
        pass_id.addTextChangedListener(tw);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    pass_id.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else {
                    pass_id.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user_id.getText().toString().equals("12345678") && pass_id.getText().toString().equals("12345678"))
                {
                    Intent i=new Intent(Login.this,StaffActivity.class);
                    startActivity(i);
                    return;
                }
                Cursor res = accountsDataBase.getAccountsData();
                if (res.getCount() == 0) {
                    ShowMessage("Error", "Nothing found");
                    return;
                }
                ArrayList<String> a1=new ArrayList<>();
                ArrayList<String> a2=new ArrayList<>();
                while (res.moveToNext()) {
                    String name, pass;
                    name = res.getString(1);
                    pass = res.getString(2);
                   a1.add(name);
                   a2.add(pass);
                }
                Iterator<String> i=a1.iterator();
                Iterator<String> i1=a2.iterator();
                while (i.hasNext() && i1.hasNext())
                {
                    String username=i.next();
                    String password=i1.next();
                    String name1,pass1;
                    name1=user_id.getText().toString();
                    pass1=pass_id.getText().toString();
                    if (username.equals(name1) && password.equals(pass1)) {
                        flag=true;
                    }
                    else
                        flag=false;
                }
                if (flag)
                {
                    Toast.makeText(Login.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(Login.this, MainActivity.class);
                    i3.putExtra("user",user_id.getText().toString());
                    startActivity(i3);
                }
                else
                    Toast.makeText(Login.this, "Invalid Details", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void checkFields()
    {
        String s1=user_id.getText().toString();
        String s2=pass_id.getText().toString();
        if(s1.equals("") || s2.equals(""))
        {
            login.setEnabled(false);
        }
        else if(s1.length()<5 || s2.length()<8)
        {
            login.setEnabled(false);
        }
        else {
            login.setEnabled(true);
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
