package com.olzhas.testproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {

    var number = 0
    val currentNumbber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()

    }

    val currentBoolean: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()

    }
}