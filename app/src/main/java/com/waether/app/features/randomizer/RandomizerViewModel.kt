package com.waether.app.features.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import eg.com.eserve.usecases.randomNumberGenerator
import kotlin.random.Random

class RandomizerViewModel : ViewModel() {

    val numberLiveData = MutableLiveData<Double>()

    init {
        numberLiveData.value = randomNumberGenerator()
    }

    override fun onCleared() {
        super.onCleared()
    }
}