package com.example.vehicleticketapp

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vehicleticketapp.adapter.CityListActivity
import com.example.vehicleticketapp.databinding.ActivityCityListBinding


class CityList : AppCompatActivity() {

    /**
     * Define citylist, adapter and binding.
     */
    private lateinit var binding: ActivityCityListBinding
    private lateinit var cityliste: ArrayList<Cities>
    private lateinit var cityAdapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        cityliste = ArrayList<Cities>()


        /**
         * Create Cities object for city list.
         */
        val city = Cities("Ankara")
        val cityTwo = Cities("İstanbul")
        val cityThree = Cities("İzmir")
        val cityFour = Cities("Antalya")
        val cityFive = Cities("Konya")
        val citySix = Cities("Eskisehir")


        /**
         * Add object to the city list.
         */
        cityliste.add(city)
        cityliste.add(cityTwo)
        cityliste.add(cityThree)
        cityliste.add(cityFour)
        cityliste.add(cityFive)
        cityliste.add(citySix)


        //   val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,cityliste.map { cities -> cities.cityName  })

        /**
         * Connect the adapter and city list and also recylerview.
         */

        cityAdapter = CityAdapter(cityliste)
        binding.recyclerview.adapter = cityAdapter

        //binding.recyclerview.layoutManager=LinearLayoutManager(this)
        binding.recyclerview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = ArrayAdapter(
            this,
            R.layout.simple_list_item_1,
            cityliste.map { cities -> cities.cityName })


    }

}


