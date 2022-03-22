package com.mballano.proyectoempresa.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class PostEntity(
    val userId: Int ?= null,
    val id: String?=null,
    val title: String? = null,
    val body: String? = null
)