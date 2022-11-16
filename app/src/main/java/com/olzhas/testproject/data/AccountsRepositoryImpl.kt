//package com.olzhas.testproject.data
//
//import kotlinx.coroutines.flow.Flow
//
//class AccountsRepositoryImpl(
//
//    private val dao: AccountsDao
//): AccountsRepository {
//
//
//    override suspend fun insertAccount(account: Accounts) {
//        dao.insertAccount(account)
//    }
//
//    override suspend fun deleteAccount(account: Accounts) {
//        dao.deleteAccount(account)
//    }
//
//    override suspend fun getAccountById(id: Int): Accounts? {
//        return dao.getAccountById(id)
//    }
//
//    override fun getAccounts(): Flow<List<Accounts>> {
//        return dao.getAccounts()
//    }
//}