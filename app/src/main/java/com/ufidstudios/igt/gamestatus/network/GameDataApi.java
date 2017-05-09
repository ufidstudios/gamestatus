package com.ufidstudios.igt.gamestatus.network;

import com.ufidstudios.igt.gamestatus.model.valueobjects.GameData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by User on 5/8/2017.
 */

public interface GameDataApi {
    @GET("http")
    Call<List<GameData>> gameData();


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}