package com.example.createbaseproject.ui.splash

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.createbaseproject.R
import com.example.createbaseproject.base.fragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashFragment : BaseFragment(R.layout.fragment_splash) {

    override fun initView() {
        super.initView()
        lifecycleScope.launch {
            delay(500)
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }
    }

}