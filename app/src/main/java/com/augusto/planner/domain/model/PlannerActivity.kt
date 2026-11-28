package com.augusto.planner.domain.model

import java.util.Calendar
import com.augusto.planner.domain.utils.createCalendarFromTimeInMillis
import com.augusto.planner.domain.utils.toPlannerActivityDate
import com.augusto.planner.domain.utils.toPlannerActivityDateTime
import com.augusto.planner.domain.utils.toPlannerActivityTime

data class PlannerActivity(
    val uuid: String,
    val name: String,
    val dateTime: Long,
    val isCompleted: Boolean,
) {
    private val dateTimerCalendar: Calendar = createCalendarFromTimeInMillis(dateTime)

    val dateString: String = dateTimerCalendar.toPlannerActivityDate()
    val timeString: String = dateTimerCalendar.toPlannerActivityTime()
    val dateTimeString: String = dateTimerCalendar.toPlannerActivityDateTime()
}