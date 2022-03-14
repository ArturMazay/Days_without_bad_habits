package com.aistudioapp.dayswithoutbadhabits.coroutines

import kotlinx.coroutines.CoroutineDispatcher

expect object Dispatchers {

    val IO: CoroutineDispatcher

    val Main: CoroutineDispatcher

}