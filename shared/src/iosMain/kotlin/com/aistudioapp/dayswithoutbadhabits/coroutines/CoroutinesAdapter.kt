package com.aistudioapp.dayswithoutbadhabits.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class CoroutinesAdapter: CoroutineScope {

    private val job = SupervisorJob()

    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    fun <T> collect(flow: Flow<T>, consumerFunction: (T) -> Unit) {
        launch {
            flow.collect {
                consumerFunction(it)
            }
        }
    }

    fun dispose() {
        job.cancel()
    }
}