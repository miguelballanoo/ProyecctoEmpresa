package com.mballano.proyectoempresa.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.mballano.proyectoempresa.R
import com.mballano.proyectoempresa.databinding.CardPostBinding
import com.mballano.proyectoempresa.ui.data.PostEntity
import kotlin.coroutines.coroutineContext


class PostAdapter(val postModel: MutableList<PostModel>,
                  //val itemClickListener:OnPostClickListener
): RecyclerView.Adapter<PostViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postModel [position])
    }

    override fun getItemCount(): Int {
        return  postModel.size
    }

}


class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val tvTitle = itemView.findViewById<TextView>(R.id.tvtitle)
    private val tvBody = itemView.findViewById<TextView>(R.id.tvBody)
    private val btnSave = itemView.findViewById<ImageButton>(R.id.btnSave)

    //val room: PostDatabase = Room.databaseBuilder(itemView.context, PostDatabase::class.java, "posts").build()


    fun bindView(postModel: PostModel){
        tvTitle.text = postModel.title
        tvBody.text = postModel.body
    }

}