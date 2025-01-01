package com.eunho.movieapp.di

import com.eunho.movieapp.domain.repository.LocalWorkMovie
import com.eunho.movieapp.domain.repository.LocalWorkMovieRepositoryImpl
import com.eunho.movieapp.domain.repository.NetworkMovie
import com.eunho.movieapp.domain.repository.NetworkMovieRepositoryImpl
import com.eunho.movieapp.domain.usecase.GetMovieUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGetMovieUseCase(
        localWorkMovie: LocalWorkMovieRepositoryImpl,
        networkMovie: NetworkMovieRepositoryImpl
    ): GetMovieUseCase {
        return GetMovieUseCase(localWorkMovie, networkMovie)
    }

    @Provides
    @Singleton
    fun provideNetworkMovieImpl(): NetworkMovieRepositoryImpl {
        return NetworkMovieRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideLocalWorkMovieImpl(): LocalWorkMovieRepositoryImpl {
        return LocalWorkMovieRepositoryImpl()
    }

}