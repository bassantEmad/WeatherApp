package eg.com.eserve.usecases.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import eg.com.eserve.entities.City
import eg.com.eserve.entities.FavoriteCityId
import eg.com.eserve.usecases.applicationLiveData
import eg.com.eserve.usecases.getApplication

val weatherDatabase: WeatherDatabase by lazy {
    initializeDatabase(applicationLiveData.getApplication())
}

@Database(
    entities = [City::class, FavoriteCityId::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(CoordinatesTypeConverter::class)
abstract class WeatherDatabase : RoomDatabase() {
    abstract val citiesDao: CitiesDao
    abstract val favoritesDao: FavoritesDao
}