package com.olzhas.testproject.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts-table")
data class Accounts(
    @ColumnInfo(name="email-id")
    val email: String = "",
    val name: String = "",
    val password: String = "",
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

)
