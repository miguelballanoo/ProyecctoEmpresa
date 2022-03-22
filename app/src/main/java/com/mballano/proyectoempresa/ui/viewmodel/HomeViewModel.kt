package com.mballano.proyectoempresa.ui.viewmodel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mballano.proyectoempresa.data.repository.PostDataRepository
import com.mballano.proyectoempresa.data.model.GetDataInterface

class HomeViewModel : ViewModel(), GetDataInterface {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    var listService: List<PostModel> = mutableListOf()
    var  pdr : PostDataRepository = PostDataRepository()

    val listPost: MutableLiveData<List<PostModel>> = MutableLiveData()
    val callback: GetDataInterface = this

    fun getPostList(){
        pdr.getData(callback)
    }

    override fun onValue(listPostModel: MutableList<PostModel>) {
        listPost.postValue(listPostModel)
    }

    override fun onError() {
        Log.e(TAG, "Ha ocurrido un error")
    }
}