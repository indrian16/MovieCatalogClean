package io.indrian.moviecatalogue.data.mapper

import io.indrian.moviecatalogue.data.entity.TVShowEntity
import io.indrian.moviecatalogue.data.model.TVShow

class TVShowMapper: BaseMapper<TVShowEntity, TVShow>() {

    override fun toModel(entity: TVShowEntity): TVShow {

        return TVShow(
            id = entity.id,
            name = entity.name,
            poster = getPosterPath(entity.posterPath),
            backdrop = getBackdropPath(entity.backdropPath),
            releaseDate = parseDate(entity.firstAirDate),
            overview = safeOverview(entity.overview),
            voteAverage = entity.voteAverage,
            voteCount = entity.voteCount
        )
    }

    override fun toEntity(model: TVShow): TVShowEntity {

        return TVShowEntity()
    }
}