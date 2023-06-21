package com.example.vehicleticketapp

import android.content.ComponentCallbacks2
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.vehicleticketapp.databinding.RecyclerItemBinding

class CityAdapter(private val cityList: ArrayList<Cities>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    class CityViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)


    /**
     * Implement of adapter methods.
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val binding =
            RecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        //   val city = cityList[position]
        // holder.bind(city)

        /**
         * Connect the recyclerview with citylist
         */
        holder.binding.recyclerTextView.text = cityList.get(position).cityName


    }


}








