package com.example.wsdc.retrofitexample.apiservices;

import java.util.Map;
import retrofit2.Callback;

public class Repository {

    APIEndpoint apiService = new APIClient().getClient().create(APIEndpoint.class);

    public void getProducts(Map<String, String> map, Callback callback){
        apiService.getProducts(map).enqueue(callback);
    }
}
