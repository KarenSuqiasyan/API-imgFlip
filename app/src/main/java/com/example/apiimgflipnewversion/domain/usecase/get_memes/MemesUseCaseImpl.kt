package com.example.apiimgflipnewversion.domain.usecase.get_memes

import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.data.repository.MemeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MemesUseCaseImpl(private val repository: MemeRepository) : MemeUseCase {

    override suspend fun getMameList() =
        withContext(Dispatchers.IO) {
            repository.getAllMemes()
        }

    override suspend fun addAllMemes(list: List<Meme>) {
        withContext(Dispatchers.IO) { repository.addAllMemes(list) }
    }

    override fun getALlMemesDto() = repository.getAllMemesDto()

}