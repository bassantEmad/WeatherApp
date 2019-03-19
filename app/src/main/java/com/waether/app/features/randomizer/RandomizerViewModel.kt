package com.waether.app.features.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eg.com.eserve.usecases.numberIncrementer

private const val DEFAULT_VALUE = 0

class RandomizerViewModel : ViewModel() {

    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value = DEFAULT_VALUE // randomNumberGenerator().toInt()

    }

    fun incrementNumber() {
        numberIncrementer(numberLiveData)
    }

    override fun onCleared() {
        super.onCleared()
    }
}