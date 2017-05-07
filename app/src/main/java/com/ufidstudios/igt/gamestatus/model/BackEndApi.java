package com.ufidstudios.igt.gamestatus.model;
import com.ufidstudios.igt.gamestatus.app.Constants;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class BackEndApi {

    @Inject
    protected static  String mGameInfoUrl;

    @Inject
    public BackEndApi(){
    }
    public interface UsdaApi {

        @GET(Constants.BASE_URL + Constants.PLAYER_INFO)
        Call<GameData> getFoodzList();

        @GET("ndb/nutrients?api_key=" + Constants.GAME_DATA)
        Call<PlayerInfo> getFoodItem(@Query("ndbno") String foodId);
    }
}