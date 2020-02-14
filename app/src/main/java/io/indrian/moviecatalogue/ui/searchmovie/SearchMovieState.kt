package io.indrian.moviecatalogue.ui.searchmovie

import io.indrian.moviecatalogue.data.model.Movie

sealed class SearchMovieState {

    object InitState : SearchMovieState()
    object Loading: SearchMovieState()
    data class Error(val message: String): SearchMovieState()
    data class Loaded(
        val movies: List<Movie>
    ): SearchMovieState()
    object NotFound : SearchMovieState()
}