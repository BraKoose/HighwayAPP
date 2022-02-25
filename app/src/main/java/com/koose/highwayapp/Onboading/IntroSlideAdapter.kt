package com.koose.highwayapp.Onboading

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.koose.highwayapp.R

class IntroSlideAdapter(private val introSlide: List<IntroSlide>):
                                RecyclerView.Adapter<IntroSlideAdapter.
                                IntroSliderViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            IntroSliderViewHolder {
        return IntroSliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: IntroSliderViewHolder, position: Int) {
        holder.bind(introSlide[position])
    }

    override fun getItemCount(): Int {
        return introSlide.size
    }

    inner class IntroSliderViewHolder(view: View):RecyclerView.ViewHolder(view) {
        private val businessHeaderText: TextView = view.findViewById(R.id.businessHeader)
        private val businessInfoText: TextView = view.findViewById(R.id.businessInfo)

        fun bind(introSlide: IntroSlide){
            businessHeaderText.text = introSlide.businessHeader
            businessInfoText.text = introSlide.businessInfo
        }

    }
}
