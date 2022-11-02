package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class RegisterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText: EditText = view.findViewById(R.id.inputName)
        val bundle = Bundle()
        val btnReg : Button = view.findViewById(R.id.btnRegister)

        val alreadyHavebtn: Button = view.findViewById(R.id.alreadyHaveAccount)
        alreadyHavebtn.setOnClickListener {
            findNavController().navigate(R.id.loginFragment, bundle)
        }
        btnReg.setOnClickListener {
            val name = editText.text
            val welcomeAboard = "Welcome Aboard, $name"
            bundle.putString("MyArg", welcomeAboard)
            findNavController().navigate(R.id.welcomeFragment, bundle)
        }
    }
}