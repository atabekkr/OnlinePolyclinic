package com.atabekdev.onlinepolyclinic.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.databinding.FragmentLoginBinding
import com.atabekdev.onlinepolyclinic.data.constants.Constants
import com.atabekdev.onlinepolyclinic.data.local.LocalStorage
import com.atabekdev.onlinepolyclinic.data.model.UserData
import kotlin.math.log

class FragmentLogin : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding
    private val listOfUsers = Constants.users()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLoginBinding.bind(view)

        binding.btnSignIn.setOnClickListener {
            val id = binding.tietId.text.toString()
            val password = binding.tietPassword.text.toString()
            if (id.isNotEmpty() && password.isNotEmpty()) {
                val data = UserData(id, password)
                if (login(data)) {
                    LocalStorage().isLogin = true
                    findNavController().navigate(
                        FragmentLoginDirections.actionFragmentLoginToHomeFragment()
                    )
                } else {
                    Toast.makeText(requireContext(), "логин или пароль неправильно", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(requireContext(), "Заполните все поля", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    private fun login(data: UserData): Boolean {
        listOfUsers.forEach { 
            if (it == data) return true
        }
        return false
    }
}