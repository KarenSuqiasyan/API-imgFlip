package com.example.apiimgflipnewversion.presentation.di

import com.example.apiimgflipnewversion.presentation.viewModel.MemeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MemeViewModel(get())
    }
}