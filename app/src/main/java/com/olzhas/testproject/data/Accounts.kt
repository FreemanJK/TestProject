package com.olzhas.testproject.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "accounts_table")
data class Accounts(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name="email_id")
    val email: String = "",
    val name: String = "",
    val password: String = ""

)
