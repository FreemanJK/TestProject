package com.olzhas.testproject.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
@Dao
interface AccountsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(account: Accounts)
    @Delete
    suspend fun deleteAccount(account: Accounts)
    @Query("SELECT * FROM accounts WHERE id=:id")
    suspend fun getAccountById(id: Int): Accounts?
    @Query("SELECT * FROM accounts")
    fun getAccounts(): Flow<List<Accounts>>
}