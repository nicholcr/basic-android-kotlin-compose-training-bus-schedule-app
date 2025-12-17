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
    @Query("SELECT * from bus_schedule WHERE id = :id")
    fun getBusSchedule(id: Int): Flow<BusSchedule>

    @Query("SELECT * from bus_schedule ORDER BY arrivalTimeInMillis ASC")
    fun getAllBusSchedules(): Flow<BusSchedule>
}