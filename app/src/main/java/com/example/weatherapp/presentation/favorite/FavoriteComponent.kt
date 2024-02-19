package com.example.weatherapp.presentation.favorite

import com.example.weatherapp.domain.entity.City
import kotlinx.coroutines.flow.StateFlow

interface FavoriteComponent {

    val model: StateFlow<FavoriteStore.State>

    fun onClickSearch()

    fun onClickAddFavorite()

    fun onCityItemClick(city: City)
}