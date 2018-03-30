package com.example.wsdc.retrofitexample.apiservices;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient  {
    String url = "http://104.238.93.161:9090/funcandi/";

    Retrofit getClient(){

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(clientBuilder.build())
                .build();

        return retrofit;

    }
}
