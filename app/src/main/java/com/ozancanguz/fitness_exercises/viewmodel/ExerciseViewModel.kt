package com.ozancanguz.fitness_exercises.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.fitness_exercises.data.repository.Repository
import com.ozancanguz.fitness_exercises.data.model.Exercise
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExerciseViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application){

    var exerciseList= MutableLiveData<Exercise>()


    fun getExercises(){
        viewModelScope.launch {
            val response=repository.remote.getExercise()
            if(response.isSuccessful){
                exerciseList.postValue(response.body())
            }else{
                Log.d("viewmodel","No data")
            }
        }
    }


}