package com.augusto.planner

import android.app.Application
import com.augusto.planner.data.di.MainServiceLocator

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        MainServiceLocator.initializer(
            application = this
        )
    }
}