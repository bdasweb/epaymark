package com.epaymark.`in`.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.epaymark.`in`.R
import com.epaymark.`in`.data.adapter.MyAdapter
import com.epaymark.`in`.data.model.ListIcon
import com.epaymark.`in`.databinding.FragmentHomeBinding
import com.epaymark.`in`.ui.base.BaseFragment


class HomeFragment : BaseFragment() {
    lateinit var binding: FragmentHomeBinding
    var iconList= ArrayList<ListIcon>()
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
        binding.tvMsg.isSelected=true
        iconList.add(ListIcon("Mobile\n", R.drawable.db_balance))
        iconList.add(ListIcon("DTH\n", R.drawable.db_balance))
        iconList.add(ListIcon("Bill Pay", R.drawable.db_balance))
        iconList.add(ListIcon("Insurance\n", R.drawable.db_balance))
        iconList.add(ListIcon("Money\nTransfer", R.drawable.db_balance))
        iconList.add(ListIcon("Micro ATM\n", R.drawable.db_balance))
        iconList.add(ListIcon("ePotly INB\n", R.drawable.db_balance))
        iconList.add(ListIcon("Payabhi\n", R.drawable.db_balance))
        iconList.add(ListIcon("Cash Coll\n", R.drawable.db_balance))
        iconList.add(ListIcon("Flight\n", R.drawable.db_balance))
        iconList.add(ListIcon("Card\nPayment", R.drawable.db_balance))
        iconList.add(ListIcon("PayTM\nWallet", R.drawable.db_balance))
        binding.regExp.apply {

            val gridLayoutManager = GridLayoutManager(binding.regExp.context, 4) // 4 columns

            layoutManager = gridLayoutManager

            adapter= MyAdapter(iconList)
            isFocusable=true
        }

        binding.regExp2.apply {

            val gridLayoutManager = GridLayoutManager(binding.regExp.context, 4) // 4 columns

            layoutManager = gridLayoutManager

            adapter= MyAdapter(iconList)
            isFocusable=true
        }
        binding.regExp3.apply {

            val gridLayoutManager = GridLayoutManager(binding.regExp.context, 4) // 4 columns

            layoutManager = gridLayoutManager

            adapter= MyAdapter(iconList)
            isFocusable=true
        }

    }

    fun observer(){

    }

    fun viewOnClick(){

    }



}