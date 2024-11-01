package com.example.bankingapp.Model;

import android.content.Intent;

public class OperationsClasses {
    String name;
    Integer img;
    public OperationsClasses(String name, Integer img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public Integer getImg() {
        return img;
    }
}
