package com.eunho.movieapp.domain.repository

import com.eunho.movieapp.data.model.MovieData
import com.eunho.movieapp.data.model.MovieDetailData

interface NetworkMovie {
    fun readMovieData(): List<MovieData>
    fun readMovieDetail(movieId: Int): List<MovieDetailData>
}