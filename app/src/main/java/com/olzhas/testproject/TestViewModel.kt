package com.olzhas.testproject

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {

    var number = 0
    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()

    }

    val currentBoolean: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()

    }

    init{
        Log.d("Homefragment", "TestViewModel created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("HomeFragment", "TestViewModel cleared!")
    }

}