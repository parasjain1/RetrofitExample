package com.example.wsdc.retrofitexample.apiservices.response;

import com.example.wsdc.retrofitexample.models.Product;

import java.util.ArrayList;

public class ProductsResponse {
    String message;
    int code;
    ArrayList<Product> games;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Product> getGames() {
        return games;
    }

    public void setGames(ArrayList<Product> games) {
        this.games = games;
    }
}
