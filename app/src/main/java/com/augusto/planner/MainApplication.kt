package com.augusto.planner

import android.app.Application
import com.augusto.planner.core.di.MainServiceLocator

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        MainServiceLocator.initializer(
            application = this
        )
    }
}