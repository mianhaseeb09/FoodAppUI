package com.example.foodappui;

import android.widget.ImageView;

public class Product {
    String name;
    String desc;
    String price;
    String image;
    public String getName() {
        return name;
    }
    public Product(String name, String desc, String price, String image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
