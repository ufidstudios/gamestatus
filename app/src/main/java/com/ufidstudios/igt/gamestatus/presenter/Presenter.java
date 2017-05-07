package com.ufidstudios.igt.gamestatus.presenter;


import com.ufidstudios.igt.gamestatus.model.BackEndApi;

import javax.inject.Inject;

/**
 * Created by Alias Cummins on 3/4/2017.
 */

class Presenter {
    private static final Presenter ourInstance = new Presenter();


    @Inject
    protected BackEndApi mBackEndApi;



    static Presenter getInstance() {
        return ourInstance;
    }

    private Presenter() {
    }
}
