package com.eunho.movieapp.domain.repository

import com.eunho.movieapp.data.model.MovieData
import com.eunho.movieapp.data.model.MovieDetailData

interface LocalWorkMovie {
    fun readMovieData(): List<MovieData>
    fun readMovieDetail(movieId: Int): List<MovieDetailData>
    fun saveMovieData(movieData: List<MovieData>)
    fun saveMovieDetail(movieDetailData: List<MovieDetailData>)
}