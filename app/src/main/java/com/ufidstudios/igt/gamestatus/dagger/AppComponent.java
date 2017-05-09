package com.ufidstudios.igt.gamestatus.dagger;

import com.ufidstudios.igt.gamestatus.view.JackpotDetailActivity;
import com.ufidstudios.igt.gamestatus.view.JackpotDetailFragment;
import com.ufidstudios.igt.gamestatus.view.JackpotListActivity;

import javax.inject.Singleton;

import dagger.Component;
import com.ufidstudios.igt.gamestatus.dagger.AppModule;
import com.ufidstudios.igt.gamestatus.dagger.NetModule;
/**
 * Created by Alias on 5/7/2017.
 */
@Singleton
@Component(modules = {AppModule.class})

public interface AppComponent {

    JackpotDetailActivity inject(JackpotDetailActivity target);
    void inject(JackpotListActivity target);
    void inject(JackpotDetailFragment target);
}




