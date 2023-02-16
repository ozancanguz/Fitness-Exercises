package com.ozancanguz.fitness_exercises.ui.fragments.exerciselist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.databinding.FragmentExerciseListBinding


class ExerciseListFragment : Fragment() {
       private var _binding: FragmentExerciseListBinding? = null

    private val binding get() = _binding!!





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)
        val view = binding.root


        return view

    }


}