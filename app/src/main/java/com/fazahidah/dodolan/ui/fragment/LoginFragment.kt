package com.fazahidah.dodolan.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fazahidah.dodolan.R
import com.fazahidah.dodolan.databinding.LoginFragmentBinding
import com.fazahidah.dodolan.ui.activity.MainActivity

class LoginFragment : Fragment() {

    private lateinit var binding: LoginFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(inflater, container, false)
        bindingActions()

        return binding.root
    }

    private fun bindingActions() {
        binding.buttonLogin.setOnClickListener {
            openActivity(MainActivity::class.java)
        }

        binding.register.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }

    private fun openActivity(cls: Class<*>) {
        val intent = Intent(this.context, cls)
        startActivity(intent)
    }
}