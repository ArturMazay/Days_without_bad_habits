package com.aistudioapp.dayswithoutbadhabits.app.domain

import com.aistudioapp.dayswithoutbadhabits.app.data.DateTimePreferences

class DateTimeRepositoryImpl(private val dataTimePreferences: DateTimePreferences) :
    DateTimeRepository {

    override suspend fun getStartDay(): Long = dataTimePreferences.getStartDay()

    override suspend fun saveStartDay(time: Long) = dataTimePreferences.saveStartDay(time)

    override suspend fun deleteCountDay() = dataTimePreferences.deleteCountDay()

}