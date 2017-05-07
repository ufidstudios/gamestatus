package com.ufidstudios.igt.gamestatus.presenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alias Cummins on 5/5/2017.
 */

@Module
public class BackEndServiceModule {
    @Provides
    @Named("gameDataUrl")
    String provideGameDataUrl() {
        return "https://dl.dropboxusercontent.com/s/2ewt6r22zo4qwgx/gameData.json";
    }

    @Provides
    @Named("playerInfoUrl")
    String providePlayerInfoUrl() {
        return "https://dl.dropboxusercontent.com/s/5zz3hibrxpspoe5/playerInfo.json";
    }
}
