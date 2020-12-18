package com.example.serviceapilibrary.Nw;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;
    private ApiInterface myApi;

    private RetrofitClient() {
       ServiceApiDataFeeder mServiceApiFeeder = ServiceApiDataFeeder.getInstance();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(mServiceApiFeeder.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(ApiInterface.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public ApiInterface getMyApi() {
        return myApi;
    }
}
