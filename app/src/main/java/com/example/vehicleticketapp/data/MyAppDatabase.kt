package com.example.vehicleticketapp.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.google.firebase.database.core.Context

@Database(entities = [Bus::class], version = 1)
abstract class MyAppDatabase : RoomDatabase() {
    abstract fun busDao(): BusDao



    companion object {
        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        private const val DATABASE_NAME = "my_app_database"


        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Migration code goes here
            }
        }


        fun getInstance(application: Application): MyAppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    application.applicationContext,
                    MyAppDatabase::class.java, "bus_database"
                )
                    .addMigrations(MIGRATION_1_2)
                    .build()
                  //  .fallbackToDestructiveMigration()
                 //   .build()
                    .also { INSTANCE = it }

            }
        }


    }



    }









