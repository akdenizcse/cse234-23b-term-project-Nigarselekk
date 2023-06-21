package com.example.vehicleticketapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.vehicleticketapp.data.BusDao
import com.example.vehicleticketapp.data.MyAppDatabase
import com.example.vehicleticketapp.databinding.ActivityCityListBinding
import com.example.vehicleticketapp.fragments.AccountFragment
import com.example.vehicleticketapp.fragments.PastTravelsFragment
import com.example.vehicleticketapp.fragments.SearchTicketFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    // @SuppressLint("SuspiciousIndentation")
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)

        /**
         * Create fragment for Account, Past travels and Search Ticket. We use these in bottom navigation bar.
          */

        val accountFragment = AccountFragment()
        val pastTravelsFragment = PastTravelsFragment()
        val searchTicketFragment = SearchTicketFragment()

        /**
         * Determine the default fragment as Search ticket fragment.
         */
        makeCurrentFragment(searchTicketFragment)


        /**
         * Change the current fragment according to their itemId.
         */

      val bottom_navigation :BottomNavigationView= findViewById(R.id.bottom_navigation)
        bottom_navigation. setOnItemSelectedListener{
            when (it.itemId){
                R.id.ic_account -> makeCurrentFragment (pastTravelsFragment)
                R.id.ic_pastTravels -> makeCurrentFragment(accountFragment)
                R.id.ic_searchTicket -> makeCurrentFragment(searchTicketFragment)
            }

                 true
         }


    }


    private fun makeCurrentFragment(fragment: Fragment) {
      supportFragmentManager.beginTransaction().apply {

          replace(R.id.fl_wrapper,fragment)
          commit()
      }
    }











}

