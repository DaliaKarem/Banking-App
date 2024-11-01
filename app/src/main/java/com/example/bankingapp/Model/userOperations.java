package com.example.bankingapp.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class userOperations {
    //name mobile icon(send/recieve) money time
    String name;
    Integer icon;//if icon=0 ->reciee if 1->send
    double money;
    String phone;
    String time ;
    public userOperations(String name, Integer icon, String phone,double money) {
        this.name = name;
        this.icon = icon;
        this.phone=phone;
        this.money = money;
        this.time= new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z").format(new Date());

    }

    public String getName() {
        return name;
    }

    public Integer getIcon() {
        return icon;
    }

    public String getPhone() {
        return phone;
    }

    public double getMoney() {
        return money;
    }

    public String getTime() {
        return time;
    }
}
