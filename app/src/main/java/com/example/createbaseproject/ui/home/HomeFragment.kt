package com.example.createbaseproject.ui.home

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.createbaseproject.R
import com.example.createbaseproject.base.fragment.BaseFragment
import com.example.createbaseproject.common.Logger
import com.example.createbaseproject.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun initView() {
        super.initView()
        Logger.log("OnViewCreated")
    }



}