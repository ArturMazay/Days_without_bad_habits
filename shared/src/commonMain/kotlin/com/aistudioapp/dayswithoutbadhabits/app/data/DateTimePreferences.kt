package com.aistudioapp.dayswithoutbadhabits.app.data

interface DateTimePreferences {
    suspend fun getStartDay(): Long
    suspend fun saveStartDay(time: Long)
    suspend fun deleteCountDay()
}