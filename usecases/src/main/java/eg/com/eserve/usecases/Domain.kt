package eg.com.eserve.usecases

import android.app.Application
import android.arch.lifecycle.MutableLiveData

// internal means applicationLiveData is restricted to the current module which is usecases
internal var applicationLiveData = MutableLiveData<Application>()

// Extension fun
internal fun MutableLiveData<Application>.getApplication(): Application = value!!

object Domain {

    fun integrateWith(application: Application) {
        applicationLiveData.value = application
    }
}