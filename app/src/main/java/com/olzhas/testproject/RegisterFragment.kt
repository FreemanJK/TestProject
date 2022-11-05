package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.olzhas.testproject.databinding.FragmentRegisterBinding
import com.olzhas.testproject.databinding.FragmentWelcomeBinding


class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding: FragmentRegisterBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText = binding.inputName
        val bundle = Bundle()
        val btnReg = binding.btnRegister

        val alreadyHavebtn = binding.alreadyHaveAccount
        alreadyHavebtn.setOnClickListener {
            findNavController().navigate(R.id.loginFragment, bundle)
        }
        btnReg.setOnClickListener {
            val name = editText.text
            val welcomeAboard1 = "Welcome Aboard, $name"
            bundle.putString("MyArg", welcomeAboard1)
            findNavController().navigate(R.id.welcomeFragment, bundle)
        }
    }
}