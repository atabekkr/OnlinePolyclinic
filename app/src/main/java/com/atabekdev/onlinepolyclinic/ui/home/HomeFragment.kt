package com.atabekdev.onlinepolyclinic.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.databinding.FragmentHomeBinding
import com.atabekdev.onlinepolyclinic.ui.MainActivity

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        (activity as MainActivity).visibilityBnv(true)

    }
}