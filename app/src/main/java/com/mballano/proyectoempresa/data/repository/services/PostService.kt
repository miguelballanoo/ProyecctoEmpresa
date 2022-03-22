package com.mballano.proyectoempresa.data.repository.services

import com.mballano.proyectoempresa.data.entities.PostEntity
import retrofit2.Call
import retrofit2.http.GET

interface PostService {

    @GET("posts")
    fun getPost(): Call<MutableList<PostEntity>>
}