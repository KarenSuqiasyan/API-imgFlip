package com.example.apiimgflipnewversion.data.repository

import com.example.apiimgflipnewversion.data.remote.retrofit.RetrofitServices
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.room.dao.DataDao
import com.example.apiimgflipnewversion.util.Result
import com.example.apiimgflipnewversion.domain.model.GetMemesResponse
import com.example.apiimgflipnewversion.util.analyzeResponse
import com.example.apiimgflipnewversion.util.makeApiCall
import retrofit2.Response


class MemeRepositoryImpl constructor(
    private val retrofitServices: RetrofitServices,
    private val dataDao: DataDao
) :
    MemeRepository {


    override suspend fun getAllMemes(): Result<GetMemesResponse?> = makeApiCall({
        getMemeData(
            retrofitServices.getMemeList()
        )
    })

    override fun getAllMemesDto() = dataDao.getAll()
    override suspend fun addAllMemes(list: List<Meme>) {
        dataDao.addDataList(list)
    }

    private fun getMemeData(memeResponse: Response<GetMemesResponse?>): Result<GetMemesResponse?> =
        analyzeResponse(memeResponse)
}