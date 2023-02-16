package com.ozancanguz.fitness_exercises.ui.fragments.exerciselist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.data.adapters.ExerciseAdapter
import com.ozancanguz.fitness_exercises.databinding.FragmentExerciseListBinding
import com.ozancanguz.fitness_exercises.viewmodel.ExerciseViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.exercise_row_layout.view.*

@AndroidEntryPoint
class ExerciseListFragment : Fragment() {
       private var _binding: FragmentExerciseListBinding? = null

      private val binding get() = _binding!!

      // init viewmodel
      val exerciseViewModel:ExerciseViewModel by viewModels()

     // init adapter
     private val adapter=ExerciseAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentExerciseListBinding.inflate(inflater, container, false)
        val view = binding.root

        // setting up recyclerview
        setupRv()

        //observe live data and update ui
        observeLiveData()

        return view

    }

    private fun observeLiveData() {
        exerciseViewModel.getExercises()
        exerciseViewModel.exerciseList.observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
        })

    }

    private fun setupRv() {
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adapter
    }


}