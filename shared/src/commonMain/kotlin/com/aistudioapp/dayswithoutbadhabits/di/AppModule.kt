package com.aistudioapp.dayswithoutbadhabits.di

import com.aistudioapp.dayswithoutbadhabits.app.DaysWithoutBadHabitsViewModel
import com.aistudioapp.dayswithoutbadhabits.app.data.DataTimePreferencesImpl
import com.aistudioapp.dayswithoutbadhabits.app.data.DateTimePreferences
import com.aistudioapp.dayswithoutbadhabits.app.domain.DateTimeRepository
import com.aistudioapp.dayswithoutbadhabits.app.domain.DateTimeRepositoryImpl
import com.aistudioapp.dayswithoutbadhabits.app.domain.interactors.DayIterator
import com.aistudioapp.dayswithoutbadhabits.app.domain.interactors.DayIteratorImpl
import org.koin.dsl.module

fun appModule() = module {

    single { DaysWithoutBadHabitsViewModel(dayIterator = get()) }
    single<DateTimePreferences> { DataTimePreferencesImpl() }
    single<DateTimeRepository> { DateTimeRepositoryImpl(dataTimePreferences = get()) }
    single<DayIterator> { DayIteratorImpl(dateTimeRepository = get()) }

}