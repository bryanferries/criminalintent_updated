package com.bignerdranch.android.criminalintent

import java.util.*

//Create the class to make the crime objects
data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)
