package com.example.vehicleticketapp.adapter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vehicleticketapp.Cities
import com.example.vehicleticketapp.CityAdapter
import com.example.vehicleticketapp.R
import com.example.vehicleticketapp.databinding.ActivityCityListBinding

class CityListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCityListBinding
    private lateinit var cityliste: ArrayList<Cities>
    private lateinit var cityAdapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        cityliste= ArrayList<Cities>()

        val city = Cities( "Ankara")
        val cityTwo = Cities( "İstanbul")
        val cityThree = Cities( "İzmir")
        val cityFour= Cities( "Antalya")
        val cityFive= Cities( "Konya")
        val citySix= Cities( "Eskisehir")

        cityliste.add(city)
        cityliste.add(cityTwo)
        cityliste.add(cityThree)
        cityliste.add(cityFour)
        cityliste.add(cityFive)
        cityliste.add(citySix)


        //   val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,cityliste.map { cities -> cities.cityName  })



        cityAdapter = CityAdapter(cityliste)
        binding.recyclerview.adapter = cityAdapter
        binding.recyclerview.setAdapter(cityAdapter)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        //binding.recyclerview.layoutManager=LinearLayoutManager(this)
        binding.recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.recyclerview.adapter =cityAdapter




    }
}




//data class City(val city: String)