package com.mballano.proyectoempresa.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mballano.proyectoempresa.databinding.FragmentHomeBinding
import com.mballano.proyectoempresa.ui.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response




class HomeFragment : Fragment(), OnPostClickListener{

    private lateinit var adapter:PostAdapter
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding
    private lateinit var listPostModel:MutableList<PostModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)


        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeViewModel: HomeViewModel by viewModels()

        val observer = Observer<PostModel>{}

        homeViewModel.getPostList()
        homeViewModel.listPost.observe(this){
            listPostModel = it as MutableList<PostModel>
            adapter = PostAdapter(listPostModel)
            updateList()
        }
    }

    private fun updateList(){
        binding.rvPags.layoutManager = LinearLayoutManager(requireContext())

        binding.rvPags.adapter = adapter
    }
    override fun onClick() {
        //Actualizar objetos con set value
    }
}