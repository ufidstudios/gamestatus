package com.ufidstudios.igt.gamestatus.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 5/7/2017.
 */
@Module
public class AppModule {
    private Application mApplication;
    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mApplication;
    }
}
