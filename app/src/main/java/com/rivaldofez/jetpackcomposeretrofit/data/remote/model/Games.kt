package com.rivaldofez.jetpackcomposeretrofit.data.remote.model

import com.google.gson.annotations.SerializedName

data class Games(

	@field:SerializedName("Games")
	val games: List<GameModel>
)

data class GameModel(

	@field:SerializedName("short_description")
	val shortDescription: String,

	@field:SerializedName("thumbnail")
	val thumbnail: String,

	@field:SerializedName("game_url")
	val gameUrl: String,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("freetogame_profile_url")
	val freetogameProfileUrl: String,

	@field:SerializedName("genre")
	val genre: String,

	@field:SerializedName("publisher")
	val publisher: String,

	@field:SerializedName("developer")
	val developer: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("platform")
	val platform: String
)
