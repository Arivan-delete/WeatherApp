package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.repository.FavoriteRepository
import javax.inject.Inject

class ObserveFavoriteStateUseCase @Inject constructor(
    private val repository: FavoriteRepository
) {

    operator fun invoke(cityId: Int) = repository.observeIsFavorite(cityId)
}