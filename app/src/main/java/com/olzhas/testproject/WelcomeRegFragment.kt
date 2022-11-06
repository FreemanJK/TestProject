package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.olzhas.testproject.databinding.FragmentLoginBinding
import com.olzhas.testproject.databinding.FragmentWelcomeBinding
import com.olzhas.testproject.databinding.FragmentWelcomeRegBinding
import org.w3c.dom.Text


class WelcomeRegFragment : Fragment() {

    private var _binding: FragmentWelcomeRegBinding? = null
    private val binding: FragmentWelcomeRegBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWelcomeRegBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv = binding.receivedValueId2

        val text = arguments?.getString("MyArg")
        tv.text = text

        val btnContinue = binding.btnContinue2
        btnContinue.setOnClickListener {
            findNavController().navigate(R.id.interfaceActivity)
        }
    }






}