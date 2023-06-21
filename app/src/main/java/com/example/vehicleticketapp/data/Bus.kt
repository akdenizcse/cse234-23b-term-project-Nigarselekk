package com.example.vehicleticketapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "buses")
data class Bus(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val company: String,
    val departureTime: Double,
    val departureStation: String,
    val arrivalStation: String,
    val cost: Int
)
