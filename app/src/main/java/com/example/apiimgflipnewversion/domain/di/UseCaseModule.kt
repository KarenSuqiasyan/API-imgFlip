package com.example.apiimgflipnewversion.domain.di

import com.example.apiimgflipnewversion.domain.usecase.get_memes.MemeUseCase
import com.example.apiimgflipnewversion.domain.usecase.get_memes.MemesUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<MemeUseCase> {
        MemesUseCaseImpl(get())
    }
}