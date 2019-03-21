package eg.com.eserve.usecases.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import eg.com.eserve.entities.FavoriteCityId

@Dao
interface FavoritesDao {

    @Query("select * from FavoriteCityId")
    fun queryAll(): List<Long>

    @Insert
    fun insertFavoriteCityId(favoriteCityId: FavoriteCityId)

    @Delete
    fun removeFavoriteCityId(favoriteCityId: FavoriteCityId)
}