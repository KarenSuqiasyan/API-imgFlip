package com.example.apiimgflipnewversion.domain.usecase.get_memes

import androidx.lifecycle.LiveData
import com.example.apiimgflipnewversion.domain.model.GetMemesResponse
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.util.Result


interface MemeUseCase {

    suspend fun getMameList(): Result<GetMemesResponse?>

    suspend fun addAllMemes(list: List<Meme>)

    fun getALlMemesDto(): LiveData<List<Meme>?>

}