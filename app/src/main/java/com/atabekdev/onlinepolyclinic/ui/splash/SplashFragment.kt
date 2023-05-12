package com.atabekdev.onlinepolyclinic.ui.splash

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.ui.MainActivity
import com.atabekdev.onlinepolyclinic.data.local.LocalStorage
import kotlinx.coroutines.delay

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).visibilityBnv(false)

        lifecycleScope.launchWhenResumed {
            delay(2000)
            if (LocalStorage().isLogin) {
                findNavController().navigate(
                    SplashFragmentDirections.actionSplashFragmentToHomeFragment()
                )
            } else {
                findNavController().navigate(
                    SplashFragmentDirections.actionSplashFragmentToFragmentLogin()
                )
            }
        }
    }
}