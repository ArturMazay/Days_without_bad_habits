package com.aistudioapp.dayswithoutbadhabits.app

import com.aistudioapp.dayswithoutbadhabits.app.domain.interactors.DayIterator
import com.aistudioapp.dayswithoutbadhabits.coroutines.Dispatchers
import com.aistudioapp.dayswithoutbadhabits.ui.ViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class DaysWithoutBadHabitsViewModel(private val dayIterator: DayIterator) :
    ViewModel() {

    val dayCount:MutableStateFlow<String> = MutableStateFlow("0")
    private var dateSenderSubscription: Job? = null


    init{
        runCatching {
            dateSenderSubscription = getViewModelScope().launch(Dispatchers.IO) {
                dayCount.value = dayIterator.getDaysFromStart().toString()
            }
        }
    }

    fun startDay() {
        runCatching {
            dateSenderSubscription = getViewModelScope().launch(Dispatchers.IO) {
                  dayIterator.saveDayStart()
             if (dayIterator.getCurrentDay() == 0L) {
                    dayCount.value = dayIterator.getDaysFromStart().toString()
                }
            }
        }
    }

    fun deleteDayCount() {
        runCatching {
            dateSenderSubscription = getViewModelScope().launch(Dispatchers.IO) {
                dayIterator.deleteCountDay()
                dayCount.value = "0"
            }
        }
    }
}