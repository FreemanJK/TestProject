package com.olzhas.testproject.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities =  [Accounts::class],
    version = 1
)
abstract class AccountsDataBase:RoomDatabase() {

    abstract val dao:AccountsDao

}