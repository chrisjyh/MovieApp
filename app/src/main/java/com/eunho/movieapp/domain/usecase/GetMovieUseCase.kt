package com.eunho.movieapp.domain.usecase

import com.eunho.movieapp.domain.repository.LocalWorkMovie
import com.eunho.movieapp.domain.repository.NetworkMovie
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(
    private val localWorkMovie: LocalWorkMovie,
    private val networkMovie: NetworkMovie
){


}