package com.example.vehicleticketapp.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BusDao {
    @Insert
    suspend fun insert(bus: Bus)

    @Query("SELECT * FROM buses")
    suspend fun getAllBuses(): List<Bus>


  /*  @Query("SELECT * FROM bus")
    fun getAll(): Array<Bus>*/
   // @Query("SELECT * FROM bus WHERE name = :name")
    //fun getbusBycity(name: String): LiveData<Bus> @Query("SELECT * FROM bus WHERE hex_color = :hex")
    // fun getbusByHex(city: String): LiveData<Bus>



         @Insert
         fun insert(vararg bus: Bus)

         @Update
         fun update(bus: Bus)

         @Delete
         fun delete(bus: Bus)



    }




