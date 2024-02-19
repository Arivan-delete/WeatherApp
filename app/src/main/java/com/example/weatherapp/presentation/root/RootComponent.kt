package com.example.weatherapp.presentation.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.example.weatherapp.presentation.details.DetailsComponent
import com.example.weatherapp.presentation.favorite.FavoriteComponent
import com.example.weatherapp.presentation.search.SearchComponent

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    sealed interface Child {

        data class Favourite(val component: FavoriteComponent) : Child

        data class Search(val component: SearchComponent) : Child

        data class Details(val component: DetailsComponent) : Child
    }
}