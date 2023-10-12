package com.epaymark.`in`.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.epaymark.`in`.databinding.FragmentHomeBinding
import com.epaymark.`in`.ui.base.BaseFragment


class HomeFragment : BaseFragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding =  FragmentHomeBinding.inflate(layoutInflater)


        initFun()
        observer()
        viewOnClick()
        return binding.root
    }
    fun initFun(){

    }

    fun observer(){

    }

    fun viewOnClick(){

    }



}