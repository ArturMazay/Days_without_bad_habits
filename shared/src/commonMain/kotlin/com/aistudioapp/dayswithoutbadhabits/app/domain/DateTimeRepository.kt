package com.aistudioapp.dayswithoutbadhabits.app.domain

interface DateTimeRepository {

    suspend fun getStartDay(): Long
    suspend fun saveStartDay(time: Long)
    suspend fun deleteCountDay()

}