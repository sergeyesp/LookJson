package com.example.lookjson.data.retrofit.api

import com.example.lookjson.models.MoviesModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("3/movie/popular?api_key=1d09fe18088a4286f63f017c319225f6&language=en-US&page=1")
    suspend fun getPopularMovie(): Response<MoviesModel>
}