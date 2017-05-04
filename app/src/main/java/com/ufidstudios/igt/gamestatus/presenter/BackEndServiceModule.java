package com.ufidstudios.igt.gamestatus.presenter;

/**
 * Created by User on 5/5/2017.
 */

public class BackEndServiceModule {
    @Provides
    @Named("gameDateUrl")
    String provideServerUrl() {
        return "http://www.vogella.com";
    }

    @Provides
    @Named("")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }
}
