package com.waether.app

import android.app.Application
import com.waether.app.core.activitiesLifecycleCallbacks
import eg.com.eserve.usecases.Domain

class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(activitiesLifecycleCallbacks)
        Domain.integrateWith(this)
    }
}