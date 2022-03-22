package com.mballano.proyectoempresa.data.repository

import android.util.Log
import com.mballano.proyectoempresa.data.entities.PostEntity
import com.mballano.proyectoempresa.data.model.GetDataInterface
import com.mballano.proyectoempresa.data.repository.services.PostService
import com.mballano.proyectoempresa.ui.model.PostModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostDataRepository: GetDataInterface {

    val serviceGenerator = RetrofitManager.buildService(PostService::class.java)
    val call = serviceGenerator.getPost()
    lateinit var callback: GetDataInterface

    fun getData(listener: GetDataInterface){
        callback = listener
        call.enqueue(object: Callback<MutableList<PostEntity>> {
            override fun onResponse(
                call: Call<MutableList<PostEntity>>,
                response: Response<MutableList<PostEntity>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<MutableList<PostEntity>>, t: Throwable) {
                TODO("Not yet implemented")
            }
            /*override fun onResponse(
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
            }*/

        })
    }

    override fun onValue(listPosts: MutableList<PostModel>) {
        callback.onValue(listPosts)
    }

    override fun onError() {
        callback.onError()
    }
}