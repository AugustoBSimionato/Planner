package com.augusto.planner.data.datasource

import com.augusto.planner.domain.model.Profile
import kotlinx.coroutines.flow.Flow

interface UserRegistrationLocalDataSource {
    fun getUserRegistration(): Boolean
    fun saveUserRegistration(isUserRegistered: Boolean)
    val profile: Flow<Profile>
    suspend fun saveProfile(profile: Profile)
}