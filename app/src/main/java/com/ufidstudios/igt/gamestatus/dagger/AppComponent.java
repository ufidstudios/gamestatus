package com.ufidstudios.igt.gamestatus.dagger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.ufidstudios.igt.gamestatus.app.Constants;
import com.ufidstudios.igt.gamestatus.app.GameDataApplication;
import com.ufidstudios.igt.gamestatus.network.RetrofitClient;
import com.ufidstudios.igt.gamestatus.view.JackpotDetailActivity;
import com.ufidstudios.igt.gamestatus.view.JackpotDetailFragment;
import com.ufidstudios.igt.gamestatus.view.JackpotListActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import okhttp3.Cache;
import retrofit2.Retrofit;

import com.ufidstudios.igt.gamestatus.dagger.AppModule;
import com.ufidstudios.igt.gamestatus.dagger.NetModule;
import com.ufidstudios.igt.gamestatus.app.Constants;
/**
 * Created by Alias on 5/7/2017.
 */
@Singleton
@Component(modules = {  AppModule.class,
                        NetModule.class})
public interface AppComponent{

    void inject(GameDataApplication gameDataApplication);

    void inject(Activity activity);




}
