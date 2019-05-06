package com.example.medicines;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AccountsDataBase extends SQLiteOpenHelper {
    //Table 1 Accounts
    private static final String DATABASE_NAME="Accounts.db";
    private static final String TABLE_NAME="Accounts_table";
    private static final String COL_2="USERNAME";
    private static final String COL_3="PASSWORD";
    private static final String COL_4="MOBILE";
    private static final String COL_5="MAIL";

    //Table 2
    public static final String TABLE_NAME_HEART="Heart_table";
    public static final String COL_HEART_1="ID";
    public static final String COL_HEART_2="MEDICINE";
    public static final String COL_HEART_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_KIDNEY="Kidney_table";
    public static final String COL_KIDNEY_1="ID";
    public static final String COL_KIDNEY_2="MEDICINE";
    public static final String COL_KIDNEY_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_LUNG="Lung_table";
    public static final String COL_LUNG_1="ID";
    public static final String COL_LUNG_2="MEDICINE";
    public static final String COL_LUNG_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_MENTAL="Mental_table";
    public static final String COL_MENTAL_1="ID";
    public static final String COL_MENTAL_2="MEDICINE";
    public static final String COL_MENTAL_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_STOMACH="Stomach_table";
    public static final String COL_STOMACH_1="ID";
    public static final String COL_STOMACH_2="MEDICINE";
    public static final String COL_STOMACH_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_JOINT="Joint_table";
    public static final String COL_JOINT_1="ID";
    public static final String COL_JOINT_2="MEDICINE";
    public static final String COL_JOINT_3="DESCRIPTION";

    //Table 2
    public static final String TABLE_NAME_LIVER="Liver_table";
    public static final String COL_LIVER_1="ID";
    public static final String COL_LIVER_2="MEDICINE";
    public static final String COL_LIVER_3="DESCRIPTION";

    //Orders Table
    public static final String TABLE_ORDER="Order_table";
    public static final String COL_ORDER_1="ID";
    public static final String COL_ORDER_2="NAME";
    public static final String COL_ORDER_3="CITY";
    public static final String COL_ORDER_4="MAIL";
    public static final String COL_ORDER_5="MEDICINE";
    public static final String COL_ORDER_6="ADDRESS";

    public AccountsDataBase(Context context) {
        super(context,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //For Accounts
        db.execSQL("create table "+TABLE_NAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT,USERNAME TEXT,PASSWORD TEXT,MOBILE TEXT,MAIL TEXT)");
        //For Heart Table
        db.execSQL("create table "+TABLE_NAME_HEART+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Kidney Table
        db.execSQL("create table "+TABLE_NAME_KIDNEY+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Lung Table
        db.execSQL("create table "+TABLE_NAME_LUNG+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Mental Table
        db.execSQL("create table "+TABLE_NAME_MENTAL+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Stomach Table
        db.execSQL("create table "+TABLE_NAME_STOMACH+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Joint Table
        db.execSQL("create table "+TABLE_NAME_JOINT+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Liver Table
        db.execSQL("create table "+TABLE_NAME_LIVER+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,MEDICINE TEXT,DESCRIPTION TEXT)");
        //For Orders
        db.execSQL("create table "+TABLE_ORDER+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,CITY TEXT,MAIL TEXT,MEDICINE TEXT,ADDRESS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_HEART);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_KIDNEY);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_LUNG);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_MENTAL);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_STOMACH);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_JOINT);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_LIVER);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_ORDER);
        onCreate(db);
    }
    public boolean insertAccounts(String username,String password,String mobile,String mail )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,username);
        contentValues.put(COL_3,password);
        contentValues.put(COL_4,mobile);
        contentValues.put(COL_5,mail);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getAccountsData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    //For Heart table

    public boolean insertHeartData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_HEART_2,medicine);
        contentValues.put(COL_HEART_3,description);
        long result=db.insert(TABLE_NAME_HEART,null,contentValues);
        return result != -1;
    }
    public Cursor getHeartData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_HEART,null);
        return res;
    }

    //For Kidney table

    public boolean insertKidneyData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_KIDNEY_2,medicine);
        contentValues.put(COL_KIDNEY_3,description);
        long result=db.insert(TABLE_NAME_KIDNEY,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getKidneyData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_KIDNEY,null);
        return res;
    }

    //For Lung table

    public boolean insertLungData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_LUNG_2,medicine);
        contentValues.put(COL_LUNG_3,description);
        long result=db.insert(TABLE_NAME_LUNG,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getLungData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_LUNG,null);
        return res;
    }

    //For Mental table

    public boolean insertMentalData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_MENTAL_2,medicine);
        contentValues.put(COL_MENTAL_3,description);
        long result=db.insert(TABLE_NAME_MENTAL,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getMentalData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_MENTAL,null);
        return res;
    }

    //For Stomach table

    public boolean insertStomachData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_STOMACH_2,medicine);
        contentValues.put(COL_STOMACH_3,description);
        long result=db.insert(TABLE_NAME_STOMACH,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getStomachData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_STOMACH,null);
        return res;
    }

    //For Joint table

    public boolean insertJointData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_JOINT_2,medicine);
        contentValues.put(COL_JOINT_3,description);
        long result=db.insert(TABLE_NAME_JOINT,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getJointData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_JOINT,null);
        return res;
    }

    //For Liver table

    public boolean insertLiverData(String medicine,String description )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_LIVER_2,medicine);
        contentValues.put(COL_LIVER_3,description);
        long result=db.insert(TABLE_NAME_LIVER,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getLiverData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME_LIVER,null);
        return res;
    }

    //FOR ORDERS
    public boolean insertOrdersData(String name,String city,String mail,String medicine,String address )
    {

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_ORDER_2,name);
        contentValues.put(COL_ORDER_3,city);
        contentValues.put(COL_ORDER_4,mail);
        contentValues.put(COL_ORDER_5,medicine);
        contentValues.put(COL_ORDER_6,address);
        long result=db.insert(TABLE_ORDER,null,contentValues);
        return result != -1;
    }
    public Cursor getOrdersData()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_ORDER,null);
        return res;
    }
}
