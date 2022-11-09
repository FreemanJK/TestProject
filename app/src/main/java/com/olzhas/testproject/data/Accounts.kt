package com.olzhas.testproject.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Accounts(
    val email: String,
    val name: String,
    val password: String,
    @PrimaryKey val id: Int? = null

)
