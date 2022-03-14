package com.aistudioapp.dayswithoutbadhabits.app.domain.interactors

import com.aistudioapp.dayswithoutbadhabits.app.domain.DateTimeRepository
import kotlinx.datetime.Clock

class DayIteratorImpl(private val dateTimeRepository: DateTimeRepository) : DayIterator {

    private val currentDay by lazy {
        Clock.System.now().toEpochMilliseconds() / MILLISECONDS_IN_DAY
    }
    
    override suspend fun getDaysFromStart(): Int {
        val startDay = dateTimeRepository.getStartDay()
        if (startDay == 0L) {
            return startDay.toInt()
        }
        return (currentDay - startDay).toInt()
    }

    override suspend fun saveDayStart() {
        dateTimeRepository.saveStartDay(currentDay)
    }

    override suspend fun deleteCountDay() {
        dateTimeRepository.deleteCountDay()
    }

    override suspend fun getCurrentDay(): Long {
       return dateTimeRepository.getStartDay()
    }

    private companion object {
        const val MILLISECONDS_IN_DAY = 24 * 60 * 60 * 1000
    }
}