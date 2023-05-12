package com.atabekdev.onlinepolyclinic.ui.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.data.local.LocalStorage
import com.atabekdev.onlinepolyclinic.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding.reference.setOnClickListener {
            findNavController().navigate(
                ProfileFragmentDirections.actionProfileFragmentToReferenceFragment()
            )
        }

        binding.llMedication.setOnClickListener {
            findNavController().navigate(
                ProfileFragmentDirections.actionProfileFragmentToMedicationFragment()
            )
        }

        binding.btnLogout.setOnClickListener {
            LocalStorage().isLogin = false
            findNavController().navigate(R.id.splashFragment)
        }

    }
}