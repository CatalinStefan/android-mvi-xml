package com.catalin.mvianimals.api

import com.catalin.mvianimals.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>

}