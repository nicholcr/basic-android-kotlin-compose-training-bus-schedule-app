package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * from schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getBusSchedule(stopName: String): Flow<List<BusSchedule>>

    @Query("SELECT * from schedule ORDER BY arrival_time ASC")
    fun getAllBusSchedules(): Flow<List<BusSchedule>>
}