package com.aistudioapp.dayswithoutbadhabits.android.di

import android.app.Application
import com.aistudioapp.dayswithoutbadhabits.di.DependencyInjection
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        DependencyInjection.initKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
        }
    }
}