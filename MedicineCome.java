package com.example.medicines;

public class MedicineCome {
    private String medicine;
    private String med_desc;

    public MedicineCome(String medicine, String med_desc) {
        this.medicine = medicine;
        this.med_desc = med_desc;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getMed_desc() {
        return med_desc;
    }

    public void setMed_desc(String med_desc) {
        this.med_desc = med_desc;
    }
}
