package com.example.wsdc.retrofitexample;

import com.example.wsdc.retrofitexample.models.Product;

import java.util.ArrayList;

public interface OnProductsReceivedListener {
    void onReceived(ArrayList<Product> products);
}
