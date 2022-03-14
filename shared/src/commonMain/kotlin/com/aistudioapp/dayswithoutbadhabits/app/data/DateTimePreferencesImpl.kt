package com.aistudioapp.dayswithoutbadhabits.app.data

import com.russhwolf.settings.Settings

class DataTimePreferencesImpl : DateTimePreferences {

    private val settings: Settings = Settings()

    override suspend fun getStartDay(): Long {
        return settings.getLong(PREF_NAME_SAVED_DAY_TIME, 0L)

    }

    override suspend fun saveStartDay(time: Long) {
        settings.putLong(PREF_NAME_SAVED_DAY_TIME, time)

    }

    override suspend fun deleteCountDay() {
        settings.remove(PREF_NAME_SAVED_DAY_TIME)
    }

    private companion object {
        const val PREF_NAME_SAVED_DAY_TIME = "last_saved_day"

    }
}