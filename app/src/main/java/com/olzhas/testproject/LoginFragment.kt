package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.olzhas.testproject.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            //val name = binding.inputName.text
            val welcomeAboard = "Welcome back!"
            val bundle = Bundle()
            binding.receivedValueId.text = welcomeAboard
            val key = "MyArg1"
            bundle.putString(key, welcomeAboard)
            findNavController().navigate(R.id.welcomeFragment, bundle)
        }
        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }
    }
}