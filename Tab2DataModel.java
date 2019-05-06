package com.example.medicines;

import android.widget.TextView;

public class Tab2DataModel {
    private String t1,t2;
    private  int img_id;

    public Tab2DataModel(String t1, String t2, int img_id) {
        this.t1 = t1;
        this.t2 = t2;
        this.img_id = img_id;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
