package com.example.vehicleticketapp.data

class BusRepository(private val busDao: BusDao) {

    suspend fun insertBus(company: String, name: String, time: String) {
        val newBus =Bus(1,"A company",12.30,"A bus station","B bus Station",200)
        busDao.insert(newBus)
    }


}