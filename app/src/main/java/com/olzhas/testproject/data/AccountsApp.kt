package com.olzhas.testproject.data

import android.app.Application

class AccountsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

    val db by lazy{
        AccountsDataBase.getInstance(this)
    }

    companion object {
        lateinit var INSTANCE: AccountsApp
    }
}