package com.mballano.proyectoempresa.data.model

import com.mballano.proyectoempresa.ui.model.PostModel

interface GetDataInterface {

    fun onValue(listPosts: MutableList<PostModel>)

    fun onError()
}