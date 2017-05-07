package com.ufidstudios.igt.gamestatus.app;

import android.app.Application;

import com.ufidstudios.igt.gamestatus.dagger.AppComponent;
import com.ufidstudios.igt.gamestatus.dagger.AppModule;
import com.ufidstudios.igt.gamestatus.dagger.DaggerAppComponent;


/**
 * Created by Alias on 5/7/2017.
 */

public class GameDataApplication extends Application {
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    protected AppComponent initDagger(GameDataApplication application) {
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
