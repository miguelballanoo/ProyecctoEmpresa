package com.mballano.proyectoempresa.domain.usecases

import com.mballano.proyectoempresa.data.entities.PostEntity
import com.mballano.proyectoempresa.ui.model.PostModel


object PostMapper{
    fun transform(postEntity: PostEntity): PostModel{
        lateinit var postModel: PostModel
        postModel.body == postEntity.body
        postModel.title == postEntity.title
        return PostModel()
    }
}