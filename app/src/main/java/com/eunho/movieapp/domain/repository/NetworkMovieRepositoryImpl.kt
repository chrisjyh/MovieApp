package com.eunho.movieapp.domain.repository

import com.eunho.movieapp.data.model.MovieData
import com.eunho.movieapp.data.model.MovieDetailData
import javax.inject.Inject

class NetworkMovieRepositoryImpl @Inject constructor(): NetworkMovie {
    override fun readMovieData(): List<MovieData> {
        return listOf(MovieData(1,"","","",""))
    }

    override fun readMovieDetail(movieId: Int): List<MovieDetailData> {
        return listOf(MovieDetailData(1,"","","",""))
    }
}