package com.olzhas.testproject.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
@Dao
interface AccountsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(account: Accounts)

    @Delete
    suspend fun deleteAccount(account: Accounts)

    @Update
    suspend fun updateAccount(account: Accounts)

    @Query("SELECT * FROM `accounts_table`")
    fun fetchAllAccounts():Flow<List<Accounts>>

    @Query("SELECT * FROM `accounts_table` WHERE id =:id")
    fun fetchAccountById(id:Int): Flow<Accounts>
}