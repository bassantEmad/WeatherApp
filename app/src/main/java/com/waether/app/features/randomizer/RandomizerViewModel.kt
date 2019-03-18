package com.waether.app.features.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eg.com.eserve.usecases.Ticker
import eg.com.eserve.usecases.randomNumberGenerator

private const val DEFAULT_VALUE = 0
private const val INCREMENT_BY_VALUE = 1

class RandomizerViewModel : ViewModel() {

    private val ticker = initializeTicker()
    val numberLiveData = MutableLiveData<Int>()

    private fun initializeTicker() = Ticker {
        numberLiveData.postValue(randomNumberGenerator().toInt())
    }

    init {
        numberLiveData.value = DEFAULT_VALUE //randomNumberGenerator() // numberLiveData.postValue(1.0)
        ticker.start()

    }

    override fun onCleared() {
        super.onCleared()
        ticker.cancel()
    }
}