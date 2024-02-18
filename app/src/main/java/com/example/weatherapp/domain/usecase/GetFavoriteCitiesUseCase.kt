package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.repository.FavoriteRepository
import javax.inject.Inject

class GetFavoriteCitiesUseCase @Inject constructor(
    private val repository: FavoriteRepository
) {

    operator fun invoke() = repository.favoriteCities
}