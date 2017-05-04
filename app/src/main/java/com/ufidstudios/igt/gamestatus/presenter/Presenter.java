package com.ufidstudios.igt.gamestatus.presenter;

/**
 * Created by User on 5/4/2017.
 */

class Presenter {
    private static final Presenter ourInstance = new Presenter();

    static Presenter getInstance() {
        return ourInstance;
    }

    private Presenter() {
    }
}
