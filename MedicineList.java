package com.example.medicines;

public class MedicineList {
    private String medicine_name;
    private String medicine_desc;
    private int medicine_img;

    public MedicineList(String medicine_name, int medicine_img) {
        this.medicine_name = medicine_name;
        this.medicine_img = medicine_img;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_desc() {
        return medicine_desc;
    }

    public void setMedicine_desc(String medicine_desc) {
        this.medicine_desc = medicine_desc;
    }

    public int getMedicine_img() {
        return medicine_img;
    }

    public void setMedicine_img(int medicine_img) {
        this.medicine_img = medicine_img;
    }

    public MedicineList(String medicine_name, String medicine_desc, int medicine_img) {
        this.medicine_name = medicine_name;
        this.medicine_desc = medicine_desc;
        this.medicine_img = medicine_img;
    }
}
