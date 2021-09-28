package com.example.apiimgflipnewversion.data.repository

import androidx.lifecycle.LiveData
import com.example.apiimgflipnewversion.domain.model.GetMemesResponse
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.util.Result


interface MemeRepository {

    suspend fun getAllMemes(): Result<GetMemesResponse?>
    fun getAllMemesDto(): LiveData<List<Meme>?>
    suspend fun addAllMemes(list: List<Meme>)
}