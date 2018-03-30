package com.example.wsdc.retrofitexample.apiservices;

import com.example.wsdc.retrofitexample.apiservices.response.ProductsResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface APIEndpoint {

    @GET("product/products")
    Call<ProductsResponse> getProducts(@QueryMap Map<String, String> map);

}
