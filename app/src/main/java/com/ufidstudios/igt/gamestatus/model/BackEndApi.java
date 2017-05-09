package com.ufidstudios.igt.gamestatus.model;

import com.ufidstudios.igt.gamestatus.app.Constants;
import com.ufidstudios.igt.gamestatus.model.valueobjects.GameData;
import com.ufidstudios.igt.gamestatus.model.valueobjects.PlayerInfo;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class BackEndApi {

    @Inject
    protected String mGameInfoUrl;

    @Inject
    public BackEndApi(){
    }
    public interface UsdaApi {

        @GET(Constants.BASE_URL + Constants.PLAYER_INFO)
        Call<GameData> getFoodzList();

        @GET(Constants.BASE_URL + Constants.GAME_DATA)
        Call<PlayerInfo> getFoodItem(@Query("ndbno") String foodId);


        @GET(Constants.BASE_URL + Constants.GAME_DATA)
        Response<PlayerInfo> getFoodItem2(@Query("ndbno") String foodId);
    }
}