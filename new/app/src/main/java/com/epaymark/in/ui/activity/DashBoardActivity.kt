package com.epaymark.`in`.ui.activity

import android.os.Bundle
import com.epaymark.`in`.databinding.ActivityDashBoardBinding
import com.epaymark.`in`.ui.base.BaseActivity

class DashBoardActivity : BaseActivity() {
    lateinit var binding: ActivityDashBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFun()
        observer()
        viewOnClick()
    }

    fun initFun(){

    }

    fun observer(){

    }

    fun viewOnClick(){

    }
}