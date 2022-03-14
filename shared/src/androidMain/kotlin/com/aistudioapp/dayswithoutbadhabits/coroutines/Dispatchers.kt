package com.aistudioapp.dayswithoutbadhabits.coroutines

import kotlinx.coroutines.CoroutineDispatcher

actual object Dispatchers {

    actual val IO: CoroutineDispatcher
        get() = kotlinx.coroutines.Dispatchers.IO

    actual val Main: CoroutineDispatcher
        get() = kotlinx.coroutines.Dispatchers.Main
}