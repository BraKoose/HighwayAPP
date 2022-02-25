package com.koose.highwayapp.Onboading

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.koose.highwayapp.R
import org.w3c.dom.Text

class IntroSlideAdapter(private val introSlide: List<IntroSlide>):
    RecyclerView.Adapter<IntroSlideAdapter.IntroSlideViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IntroSlideAdapter.IntroSlideViewHolder {
        return IntroSlideViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item_container, parent, false
            )
        )
        }

    override fun onBindViewHolder(holder: IntroSlideAdapter.IntroSlideViewHolder, position: Int) {
        holder.bind(introSlide[position])
        }

    override fun getItemCount(): Int {
        return introSlide.size
    }

    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val businessHeader = view.findViewById<TextView>(R.id.businessHeader)
        private val businessInfo = view.findViewById<TextView>(R.id.businessInfo)

        fun bind(introSlide:IntroSlide){
            businessHeader.text = introSlide.businessHeader
            businessInfo.text = introSlide.businessInfo
        }

    }

}





