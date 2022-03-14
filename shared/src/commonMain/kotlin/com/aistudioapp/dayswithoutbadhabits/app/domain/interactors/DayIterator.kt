package com.aistudioapp.dayswithoutbadhabits.app.domain.interactors

interface DayIterator {
    suspend fun getDaysFromStart(): Int
    suspend fun saveDayStart()
    suspend fun deleteCountDay()
    suspend fun getCurrentDay() : Long
}