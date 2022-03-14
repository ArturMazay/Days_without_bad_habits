package com.aistudioapp.dayswithoutbadhabits.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual object Dispatchers {
    actual val IO: CoroutineDispatcher
        get() = Dispatchers.Main

    actual val Main: CoroutineDispatcher
        get() = Dispatchers.Main
}