package com.eunho.movieapp.ui.viewModel

import androidx.lifecycle.ViewModel
import com.eunho.movieapp.domain.usecase.GetMovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val getMovieUseCase: GetMovieUseCase
): ViewModel(){

}