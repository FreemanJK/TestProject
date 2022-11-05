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
import org.w3c.dom.Text


class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding: FragmentWelcomeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = binding.receivedValueId
        val text = arguments?.getString("MyArg")
        tv.text = text
        val tvlog = binding.receivedValueId
        val textlog = arguments?.getString("MyArg1")
        tvlog.text = textlog

        val btnContinue = binding.btnContinue
        btnContinue.setOnClickListener {
            findNavController().navigate(R.id.interfaceActivity)
        }
    }






}