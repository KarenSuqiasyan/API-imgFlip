package com.example.apiimgflipnewversion.data.di

import android.app.Application
import androidx.room.Room
import com.example.apiimgflipnewversion.room.dao.DataDao
import com.example.apiimgflipnewversion.room.database.Database
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module


val databaseModule = module {
    fun memesDatabase(application: Application): Database {
        return Room.databaseBuilder(application, Database::class.java, "memes")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun memesDao(database: Database): DataDao {
        return  database.mameDao
    }

    single { memesDatabase(androidApplication()) }
    single { memesDao(get()) }
}