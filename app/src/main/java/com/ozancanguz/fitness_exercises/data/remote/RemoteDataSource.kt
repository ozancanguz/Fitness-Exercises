package com.ozancanguz.fitness_exercises.data.remote

import com.ozancanguz.fitness_exercises.data.api.ExerciseApi
import com.ozancanguz.fitness_exercises.data.model.Exercise
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val exerciseApi: ExerciseApi) {


    // get exercises function
    suspend fun getExercise(): Response<Exercise> {
        return exerciseApi.getExercises()
    }

}