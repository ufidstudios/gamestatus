package com.ufidstudios.igt.gamestatus.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufidstudios.igt.gamestatus.app.Constants;

import javax.inject.Named;

import dagger.Module;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alias Cummins on 5/5/2017.
 */

@Module
public class BackEndServiceModule {

    @Named("GsonBuilder")
    Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory( new GameDataAdaptorFactory())
            .create();

    @Named("Retrofit")
    Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();
}
