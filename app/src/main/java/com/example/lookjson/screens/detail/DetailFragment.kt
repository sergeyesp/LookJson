package com.example.lookjson.screens.detail

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.lookjson.R
import com.example.lookjson.databinding.FragmentDetailBinding
import com.example.lookjson.databinding.FragmentMainBinding
import com.example.lookjson.screens.favorite.FavoriteFragmentViewModel
import com.example.lookjson.screens.main.MainAdapter

class DetailFragment : Fragment() {

    private var mBinding: FragmentDetailBinding?= null
    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return mBinding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this)[DetailFragmentViewModel::class.java]
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mBinding = null
    }
}