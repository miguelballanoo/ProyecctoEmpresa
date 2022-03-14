package com.mballano.proyectoempresa.repository

import android.util.Log
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.mballano.proyectoempresa.ui.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostDataRepository: GetDataInterface {

    val serviceGenerator = ServiceGenerator.buildService(ApiService::class.java)
    val call = serviceGenerator.getPost()
    lateinit var callback: GetDataInterface

    fun getData(listener: GetDataInterface){
        callback = listener
        call.enqueue(object: Callback<MutableList<PostModel>> {
            override fun onResponse(
                call: Call<MutableList<PostModel>>,
                response: Response<MutableList<PostModel>>
            ) {
                if(response.isSuccessful){
                    response.body()?.let {
                        onValue(it)
                    }

                }
            }

            override fun onFailure(call: Call<MutableList<PostModel>>, t: Throwable) {
                t.printStackTrace()
                Log.e("error", t.message.toString())
            }

        })
    }

    override fun onValue(listPosts: MutableList<PostModel>) {
        callback.onValue(listPosts)
    }

    override fun onError() {
        callback.onError()
    }
}