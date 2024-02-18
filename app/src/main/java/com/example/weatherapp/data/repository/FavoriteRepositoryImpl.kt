package com.example.weatherapp.data.repository

import com.example.weatherapp.data.local.db.FavoriteCitiesDao
import com.example.weatherapp.data.mapper.toDbModel
import com.example.weatherapp.data.mapper.toEntities
import com.example.weatherapp.domain.entity.City
import com.example.weatherapp.domain.repository.FavoriteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class FavoriteRepositoryImpl @Inject constructor(
    private val favoriteCitiesDao: FavoriteCitiesDao
) : FavoriteRepository {

    override val favoriteCities: Flow<List<City>> = favoriteCitiesDao.getFavoriteCities()
        .map { it.toEntities() }

    override fun observeIsFavorite(cityId: Int): Flow<Boolean> =
        favoriteCitiesDao.observeIsFavorite(cityId)

    override suspend fun addToFavorite(city: City) =
        favoriteCitiesDao.addToFavorite(city.toDbModel())

    override suspend fun removeFromFavorite(cityId: Int) =
        favoriteCitiesDao.removeFromFavorite(cityId)
}