package io.indrian.moviecatalogue.data.mapper

import io.indrian.moviecatalogue.data.entity.MovieEntity
import io.indrian.moviecatalogue.data.model.Movie

class MovieMapper: BaseMapper<MovieEntity, Movie>() {

    override fun toModel(entity: MovieEntity): Movie {

        return Movie(
            id = entity.id,
            title = entity.title,
            poster = posterUrl+ entity.posterPath,
            backdrop = backdropUrl+ entity.backdropPath,
            releaseDate = parseDate(entity.releaseDate),
            overview = safeOverview(entity.overview),
            voteCount = entity.voteCount,
            voteAverage = entity.voteAverage
        )
    }

    override fun toEntity(model: Movie): MovieEntity {

        return MovieEntity()
    }
}