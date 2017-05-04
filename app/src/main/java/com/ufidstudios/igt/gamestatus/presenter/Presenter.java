package com.ufidstudios.igt.gamestatus.presenter;

/**
 * Created by Alias Cummins on 3/4/2017.
 */

class Presenter {
    private static final Presenter ourInstance = new Presenter();

    static Presenter getInstance() {
        return ourInstance;
    }

    private Presenter() {
    }
}
