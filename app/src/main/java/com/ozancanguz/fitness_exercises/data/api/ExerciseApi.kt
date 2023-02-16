package com.ozancanguz.fitness_exercises.data.api

import com.ozancanguz.fitness_exercises.data.model.Exercise
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ExerciseApi {

     @Headers("Authorization: Bearer 844|nHc5uSAr948kWrcy1fFkfVqlIRGpvBMkYMjQgBdi")
    @GET("exercise+database+api/313/list+of+all+exercise")
     suspend fun getExercises(): Response<Exercise>


}