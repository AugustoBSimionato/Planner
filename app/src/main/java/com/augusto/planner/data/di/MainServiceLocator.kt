package com.augusto.planner.data.di

import android.app.Application
import com.augusto.planner.data.datasource.AuthenticationLocalDataSource
import com.augusto.planner.data.datasource.AuthenticationLocalDataSourceImpl
import com.augusto.planner.data.datasource.UserRegistrationLocalDataSource
import com.augusto.planner.data.datasource.UserRegistrationLocalDataSourceImpl

object MainServiceLocator {

    private var _application: Application? = null
    private val application: Application get() = _application!!

    val userRegistrationLocalDataSource: UserRegistrationLocalDataSource by lazy {
        UserRegistrationLocalDataSourceImpl(
            applicationContext = application.applicationContext
        )
    }

    val authenticationLocalDataSource: AuthenticationLocalDataSource by lazy {
        AuthenticationLocalDataSourceImpl(
            applicationContext = application.applicationContext
        )
    }

    fun initializer(application: Application) {
        _application = application
    }

    fun clear() {
        _application = null
    }
}