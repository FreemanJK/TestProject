package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.olzhas.testproject.databinding.FragmentHomeBinding
import com.olzhas.testproject.databinding.FragmentRegisterBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!

    lateinit var viewModel: TestViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)
        val tv3 = binding.textView3
        val tv4 = binding.textView4
        viewModel.currentNumbber.observe(viewLifecycleOwner, Observer {
            tv3.text = it.toString()
        })

        viewModel.currentNumbber.observe(viewLifecycleOwner, Observer {
            tv4.text = it.toString()
        })
        incrementText()
    }

    private fun incrementText(){
        val button = binding.button
        button.setOnClickListener(){
            viewModel.currentNumbber.value = ++viewModel.number
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
        }
    }

}