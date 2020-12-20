package com.example.serviceapilibrary.Nw;

import java.util.List;

import com.example.serviceapilibrary.model.Hero;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    ServiceApiDataFeeder mServiceApiDataFeeder = ServiceApiDataFeeder.getInstance();
    String BASE_URL = mServiceApiDataFeeder.getBaseUrl();
    String heroNode = mServiceApiDataFeeder.getGetHeroApiEndNodeName();
    final static String HERO_END_NODE = heroNode;

    //end nodes
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
