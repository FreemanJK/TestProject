package com.olzhas.testproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.olzhas.testproject.databinding.ActivityInterfaceBinding

class InterfaceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInterfaceBinding
    private lateinit var currentFragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterfaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()


    }

    private fun setupNavigation() {
        val navController =
            (supportFragmentManager.findFragmentById(R.id.mainNavFragment) as NavHostFragment).navController
        binding.bottomNavigationView.setupWithNavController(navController)

//        val navListener = binding.bottomNavigationView.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.home -> {
//                    currentFragment = HomeFragment()
//                }
//                R.id.profile -> {
//                    currentFragment = ProfileFragment()
//                }
//                R.id.settings -> {
//                    currentFragment = SettingsFragment()
//                }
//            }
//            supportFragmentManager.beginTransaction().replace(R.id.mainNavFragment, currentFragment)
//                .commit()
//            true
//        }
    }
}




//    private fun replaceFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame_layout,fragment)
//        fragmentTransaction.commit()
//    }
