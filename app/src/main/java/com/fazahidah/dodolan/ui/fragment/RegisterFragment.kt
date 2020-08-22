package com.fazahidah.dodolan.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fazahidah.dodolan.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterFragmentBinding.inflate(inflater, container, false)
        bindingActions()

        return binding.root
    }

    private fun bindingActions() {
        binding.loginText.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}