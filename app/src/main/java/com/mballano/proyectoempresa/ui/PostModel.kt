package com.mballano.proyectoempresa.ui


data class PostModel(
    val userId: Int ?= null,
    val id: String?=null,
    val title: String? = null,
    val body: String? = null
        )