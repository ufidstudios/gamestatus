package com.ufidstudios.igt.gamestatus;

import android.app.Application;

import com.ufidstudios.igt.gamestatus.dagger.AppComponent;
import com.ufidstudios.igt.gamestatus.dagger.AppModule;

import

/**
 * Created by Alias on 5/7/2017.
 */

public class GameInfoApplication extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    protected AppComponent initDagger(GameInfoApplication application) {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initDagger(this);
    }
}
