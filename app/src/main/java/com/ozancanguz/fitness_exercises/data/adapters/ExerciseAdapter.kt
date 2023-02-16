package com.ozancanguz.fitness_exercises.data.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.data.model.Exercise
import com.ozancanguz.fitness_exercises.data.model.ExerciseItem
import com.ozancanguz.fitness_exercises.ui.fragments.exerciselist.ExerciseListFragment
import com.ozancanguz.fitness_exercises.ui.fragments.exerciselist.ExerciseListFragmentDirections
import com.ozancanguz.fitness_exercises.util.Util.Companion.loadImage
import kotlinx.android.synthetic.main.exercise_row_layout.view.*

class ExerciseAdapter:RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {
    class ExerciseViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    var exerciseList= emptyList<ExerciseItem>()

    fun setData(newData:Exercise){
        this.exerciseList=newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.exercise_row_layout,parent,false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
           val currentExercise=exerciseList[position]
        holder.itemView.rv_nametv.text=currentExercise.name

        // glide image loading
        holder.itemView.rv_img.loadImage(currentExercise.gifUrl)



        // nav safe args to details
        holder.itemView.setOnClickListener {
            val direction=ExerciseListFragmentDirections.actionExerciseListFragmentToDetailsFragment(currentExercise)
            holder.itemView.findNavController().navigate(direction)
        }
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }


}