package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room

import com.example.vehicleticketapp.adapter.CityListActivity
import com.example.vehicleticketapp.data.MyAppDatabase
import com.example.vehicleticketapp.databinding.ActivityCityListBinding
/*import com.example.vehicleticketapp.adapter.Adapter
import com.example.vehicleticketapp.data.Bus
import com.example.vehicleticketapp.data.MyAppDatabase*/
import com.example.vehicleticketapp.databinding.ActivityFindTicketBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FindTicket : AppCompatActivity() {

    // val database = Room.databaseBuilder(Context, MyAppDatabase::class.java, "myapp_database")


    /**
     * Crate city list to select a city when searching ticket.
     * Create binding.
     */
    private lateinit var cityList: ArrayList<Cities>
    private lateinit var binding: ActivityFindTicketBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindTicketBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /**
         * Create arraylist for city list.
         */
        cityList = ArrayList()


        /**
         * When user want to choose city, user click "fromtext".So city list is appear as a Alert Dialog.
         */
        binding.fromText.setOnClickListener {
            val cityListView = LayoutInflater.from(this).inflate(R.layout.itemadapter, null)
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setView(cityListView)
            alertDialog.show()
        }

        /**
         * After all choices, search ticket for these choices.
         */
        val searchbutton: Button = findViewById(R.id.search_buses)
        searchbutton.setOnClickListener {
            val intent = Intent(this, Tickets::class.java)
            startActivity(intent)
        }


    }


}



