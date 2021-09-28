package com.example.apiimgflipnewversion.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiimgflipnewversion.domain.model.Meme
import com.example.apiimgflipnewversion.util.Result
import com.example.apiimgflipnewversion.domain.usecase.get_memes.MemeUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MemeViewModel constructor(private val useCase: MemeUseCase) : ViewModel() {

    private val errorMessage = MutableLiveData<String>()
//
//    private val _getMemeList by lazy { MutableLiveData<List<Meme>>() }
//    val getMemeList: LiveData<List<Meme>> = _getMemeList


    init {
        loadMemes()
    }

    private fun loadMemes() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = useCase.getMameList()) {
                is Result.Success -> withContext(Dispatchers.Main) {
//                    _getMemeList.value = result.data?.data?.memes
                    result.data?.data?.memes?.let {
                        useCase.addAllMemes(it)
                    }
                }
                is Result.Error -> withContext(Dispatchers.Main) {
                    onError(result.errors.errorMessage)
                }
            }


//            if (result.isSuccessful) {
//                result.body()?.data?.memes?.let {
//                    useCase.addAllMemes(it)
//                }
//            } else {
//                onError("Error : ${result.message()} ")
//            }


        }
    }

   fun getAllMemesDto() = useCase.getALlMemesDto()

    private fun onError(message: String?) {
        errorMessage.value = message
    }

}