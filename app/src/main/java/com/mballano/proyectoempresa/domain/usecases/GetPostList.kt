package com.mballano.proyectoempresa.domain.usecases

import com.mballano.proyectoempresa.data.model.GetDataInterface

interface GetPostList {
    fun getData(listener: GetDataInterface)
}