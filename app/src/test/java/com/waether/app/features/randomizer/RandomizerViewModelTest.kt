package com.waether.app.features.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class RandomizerViewModelTest {


    @JvmField
    @Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    // initialize value of numberLiveData is DEFAULT_VALUE
    @Test
    fun `init Then Update NumberLiveData Value To Zero`() {
        // Arrange
        // Act
        val viewModel = RandomizerViewModel()

        // Assert
        Assert.assertTrue(viewModel.numberLiveData.value == 0)

    }


    // when i invoke numberIncrementer(), numberLiveData is incremented by 1
    @Test
    fun `increment Number When Number LiveDataValue Is Zero Then Update NumberLiveData Value To One`() {

        // Arrange
        val viewModel = RandomizerViewModel()
        viewModel.numberLiveData.value = 0

        // Act
        viewModel.incrementNumber()

        // Assert
        Assert.assertTrue(viewModel.numberLiveData.value == 1)
    }
}