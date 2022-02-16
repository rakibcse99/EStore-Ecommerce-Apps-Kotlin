package com.rakibstudio.e_store.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rakibstudio.e_store.R
import com.rakibstudio.e_store.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    // TODO: 5/16/2021 LoginFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
loginbt.setOnClickListener {
    findNavController().navigate(R.id.action_loginFragment_to_exploreFragment)
}
            signupfg.setOnClickListener {

                findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
            }
        }


    }
}
