package com.aistudioapp.dayswithoutbadhabits.ui

import com.aistudioapp.dayswithoutbadhabits.coroutines.Dispatchers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

actual open class ViewModel {

    private val viewModelJob = SupervisorJob()

    private val viewModelScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    actual fun clear() {
        onCleared()
    }

    actual fun getViewModelScope(): CoroutineScope {
        return viewModelScope
    }

    protected actual open fun onCleared() {
        viewModelJob.cancel()
    }
}