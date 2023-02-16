package com.ozancanguz.fitness_exercises.data

import com.ozancanguz.fitness_exercises.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remoteDataSource: RemoteDataSource) {


    val remote=remoteDataSource


}