package com.example.apiimgflipnewversion.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.apiimgflipnewversion.domain.model.Meme


@Dao
interface DataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addDataList(list: List<Meme>)

    @Query("SELECT * FROM meme")
    fun getAll(): LiveData<List<Meme>?>
}