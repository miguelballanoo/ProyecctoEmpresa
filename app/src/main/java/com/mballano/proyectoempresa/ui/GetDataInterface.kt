package com.mballano.proyectoempresa.ui

interface GetDataInterface {

    fun onValue(listPosts: MutableList<PostModel>)

    fun onError()
}