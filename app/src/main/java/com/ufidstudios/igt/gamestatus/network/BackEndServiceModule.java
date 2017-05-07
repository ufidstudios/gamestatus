package com.ufidstudios.igt.gamestatus.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ufidstudios.igt.gamestatus.app.Constants;
import com.ufidstudios.igt.gamestatus.model.PlayerInfo;
import com.ufidstudios.igt.gamestatus.presenter.BackEndServiceModule_ProvidePlayerInfoUrlFactory;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alias Cummins on 5/5/2017.
 */

@Module
public class BackEndServiceModule {

    @Named("PlayerInfoAdapter")
    Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory(BackEndServiceModule_ProvidePlayerInfoUrlFactory.class, new BackEndServiceModule_ProvidePlayerInfoUrlFactory())
            .build();

    Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();
}
