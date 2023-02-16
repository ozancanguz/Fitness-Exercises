package com.ozancanguz.fitness_exercises.ui.fragments.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.databinding.FragmentDetailsBinding
import com.ozancanguz.fitness_exercises.util.Util.Companion.loadImage


class DetailsFragment : Fragment() {

       private var _binding: FragmentDetailsBinding? = null

    private val binding get() = _binding!!

    private val args:DetailsFragmentArgs by navArgs()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root

        updateUi()

        return view

    }

    private fun updateUi() {
        val currentExercise=args.currentExe
        binding.detailsnametv.text="Name: " +currentExercise.name
        binding.detailsbodypart.text="Body Part: " +currentExercise.bodyPart
        binding.detailsequip.text="Equipment: " +currentExercise.equipment
        binding.detailstarget.text="Target: " +currentExercise.target
        binding.detailsimg.loadImage(currentExercise.gifUrl)
    }


}