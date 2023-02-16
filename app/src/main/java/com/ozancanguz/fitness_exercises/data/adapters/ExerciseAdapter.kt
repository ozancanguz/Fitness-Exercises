package com.ozancanguz.fitness_exercises.data.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.data.model.Exercise
import com.ozancanguz.fitness_exercises.data.model.ExerciseItem
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
        holder.itemView.rv_img.load(currentExercise.gifUrl)
    }

    override fun getItemCount(): Int {
        return exerciseList.size
    }


}