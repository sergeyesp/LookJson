package com.example.lookjson.screens.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.lookjson.MAIN
import com.example.lookjson.R
import com.example.lookjson.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var mBinding: FragmentMainBinding?= null
    private val binding get() = mBinding!!
    lateinit var recyclerView: RecyclerView
    private val adapter by lazy { MainAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this)[MainFragmentViewModel::class.java]
        recyclerView = binding.rvMain
        recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }
}