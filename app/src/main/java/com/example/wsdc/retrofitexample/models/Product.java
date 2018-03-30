package com.example.wsdc.retrofitexample.models;

import java.util.ArrayList;

public class Product {
    int id;
    float price;
    String name;
    String imagePath;
    ArrayList<VendorRelation> vendors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<VendorRelation> getVendors() {
        return vendors;
    }

    public void setVendors(ArrayList<VendorRelation> vendors) {
        this.vendors = vendors;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
