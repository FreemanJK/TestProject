//package com.olzhas.testproject.data
//
////import android.content.Context
////import androidx.room.Database
////import androidx.room.Room
////import androidx.room.RoomDatabase
////
////@Database(
////    entities =  [Accounts::class],
////    version = 1
////)
////abstract class AccountsDataBase:RoomDatabase() {
////
////    abstract fun accountsDao():AccountsDao
////
////    companion object{//for adding function to this class
////        @Volatile
////        private var INSTANCE: AccountsDataBase? = null
////
////        fun getInstance(context: Context):AccountsDataBase{
////            synchronized(this){
////                 var instance = INSTANCE
////
////                if(instance == null){
////                    instance = Room.databaseBuilder(
////                        context.applicationContext,AccountsDataBase::class.java,
////                        "accounts_database"
////                    ).fallbackToDestructiveMigration().build()
////                    INSTANCE = instance
////                }
////                return instance
////
////            }
////        }
////    }
////
////}