package com.example.apiimgflipnewversion.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.room.dao.DataDao


@Database(entities = [Meme::class],version = 1)
abstract class Database: RoomDatabase() {
    abstract val mameDao: DataDao
}