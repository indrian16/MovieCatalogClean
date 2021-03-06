package io.indrian.whatmovies.ui.movie

import io.indrian.whatmovies.data.model.Movie

sealed class MoviesListState {

    object Loading: MoviesListState()
    data class Error(val message: String): MoviesListState()
    data class Loaded(
        val movies: List<Movie>
    ): MoviesListState()
}