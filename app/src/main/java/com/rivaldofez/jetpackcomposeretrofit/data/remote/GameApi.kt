package com.rivaldofez.jetpackcomposeretrofit.data.remote

import com.rivaldofez.jetpackcomposeretrofit.data.remote.model.GameModel
import com.rivaldofez.jetpackcomposeretrofit.util.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>
}