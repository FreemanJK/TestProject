package com.olzhas.testproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.olzhas.testproject.WelcomeFragment.Companion.KEY_TITLE
import com.olzhas.testproject.data.Accounts
import com.olzhas.testproject.data.AccountsApp
import com.olzhas.testproject.data.AccountsDao
//import com.olzhas.testproject.data.Accounts
//import com.olzhas.testproject.data.AccountsApp
//import com.olzhas.testproject.data.AccountsDao
import com.olzhas.testproject.databinding.FragmentRegisterBinding
import com.olzhas.testproject.databinding.FragmentWelcomeBinding
import kotlinx.coroutines.launch


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
        val btnReg = binding.btnRegister

        val alreadyHavebtn = binding.alreadyHaveAccount
        alreadyHavebtn.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
        val accountsDao = (activity?.applicationContext as AccountsApp).db.accountsDao()
        btnReg.setOnClickListener {
            val name = editText.text
            val welcomeAboard1 = "Welcome Aboard, $name"
            val bundle = Bundle()
            addAccount(accountsDao)
            bundle.putString(KEY_TITLE, welcomeAboard1)
            findNavController().navigate(R.id.welcomeFragment, bundle)
        }
    }

    fun addAccount(accountsDao: AccountsDao){
        val name = binding.inputName?.text.toString()
        val email = binding.inputEmail?.text.toString()
        val password = binding.password?.text.toString()

        if(name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()){
            lifecycleScope.launch{
                accountsDao.insertAccount(Accounts(name = name, email = email, password = password))
                Toast.makeText(AccountsApp.INSTANCE, "Account was created", Toast.LENGTH_LONG).show()
                binding.inputName.text.clear()
                binding.inputEmail.text.clear()
            }
        }else{
            Toast.makeText(AccountsApp.INSTANCE,"Name cannot be blank",Toast.LENGTH_LONG).show()
        }
    }
}