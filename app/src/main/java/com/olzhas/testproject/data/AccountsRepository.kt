//package com.olzhas.testproject.data
//
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.OnConflictStrategy
//import androidx.room.Query
//import kotlinx.coroutines.flow.Flow
//
//interface AccountsRepository {
//
//    suspend fun insertAccount(account: Accounts)
//
//    suspend fun deleteAccount(account: Accounts)
//
//    suspend fun getAccountById(id: Int): Accounts?
//
//    fun getAccounts(): Flow<List<Accounts>>
//}