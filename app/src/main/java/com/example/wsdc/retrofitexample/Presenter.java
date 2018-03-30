package com.example.wsdc.retrofitexample;

import android.util.Log;

import com.example.wsdc.retrofitexample.apiservices.Repository;
import com.example.wsdc.retrofitexample.apiservices.response.ProductsResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter {
    OnProductsReceivedListener listener;
    Repository repository;
    public Presenter(OnProductsReceivedListener listener){
        this.listener = listener;
        repository = new Repository();
    }

    void loadProducts(){
        repository.getProducts(new HashMap<String, String>(), new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                Log.d("HomePresenter", "onResponse");
                if(response.code() == 200) {
                    ProductsResponse productsResponse = (ProductsResponse) response.body();
                    listener.onReceived(productsResponse.getGames());
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.d("HomePresenter", t.getLocalizedMessage());
            }
        });
    }

}
