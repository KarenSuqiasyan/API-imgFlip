package com.example.apiimgflipnewversion.app

import android.app.Application
import com.example.apiimgflipnewversion.data.di.databaseModule
import com.example.apiimgflipnewversion.data.di.repoModule
import com.example.apiimgflipnewversion.data.di.retrofitModule
import com.example.apiimgflipnewversion.domain.di.useCaseModule
import com.example.apiimgflipnewversion.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(retrofitModule, viewModelModule, repoModule, useCaseModule,databaseModule))
        }
    }
}