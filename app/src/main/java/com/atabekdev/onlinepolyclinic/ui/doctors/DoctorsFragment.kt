package com.atabekdev.onlinepolyclinic.ui.doctors

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.databinding.FragmentDoctorsBinding


class DoctorsFragment : Fragment(R.layout.fragment_doctors) {

    private lateinit var binding: FragmentDoctorsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDoctorsBinding.bind(view)

        binding.layout1.setOnClickListener {
            navigateToLink(Uri.parse("https://t.me/atik_qr"))
        }

        binding.layout2.setOnClickListener {
            navigateToLink(Uri.parse("https://t.me/atik_qr"))
        }

        binding.layout3.setOnClickListener {
            navigateToLink(Uri.parse("https://t.me/atik_qr"))
        }

        binding.layout4.setOnClickListener {
            navigateToLink(Uri.parse("https://t.me/atik_qr"))
        }

        binding.layout5.setOnClickListener {
            navigateToLink(Uri.parse("https://t.me/atik_qr"))
        }
    }

    private fun navigateToLink(uri: Uri) {
        val intent = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException){
            val intent2 = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent2)
        }
    }
}