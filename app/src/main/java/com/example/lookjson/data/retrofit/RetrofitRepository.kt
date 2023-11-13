package com.example.lookjson.data.retrofit

import com.example.lookjson.data.retrofit.api.RetrofitInstance
import com.example.lookjson.models.MoviesModel
import retrofit2.Response

class RetrofitRepository {
    suspend fun getMovies(): Response<MoviesModel> {
        return RetrofitInstance.api.getPopularMovie()
    }
}