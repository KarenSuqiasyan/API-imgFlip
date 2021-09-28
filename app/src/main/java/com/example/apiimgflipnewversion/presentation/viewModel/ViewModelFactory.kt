package com.example.apiimgflipnewversion.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.apiimgflipnewversion.data.repository.MemeRepositoryImpl

//class ViewModelFactory constructor(private val repository: MemeRepositoryImpl) :
//    ViewModelProvider.Factory {
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        return if (modelClass.isAssignableFrom(MemeViewModel::class.java)) {
//            MemeViewModel(this.repository) as T
//        } else {
//            throw IllegalArgumentException("ViewModel Not Found")
//        }
//    }
//}