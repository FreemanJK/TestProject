package com.olzhas.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import com.olzhas.testproject.databinding.ActivityInterfaceBinding
import com.olzhas.testproject.databinding.ActivityMainBinding

class InterfaceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInterfaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterfaceBinding.inflate(layoutInflater)
        replaceFragment(HomeFragment())
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.settings -> replaceFragment(SettingsFragment())
                else ->{

                }
            }
            true
        }



    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}