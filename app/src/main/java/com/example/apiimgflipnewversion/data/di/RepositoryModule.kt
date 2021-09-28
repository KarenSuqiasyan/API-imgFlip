package com.example.apiimgflipnewversion.data.di

import com.example.apiimgflipnewversion.data.repository.MemeRepositoryImpl
import com.example.apiimgflipnewversion.data.repository.MemeRepository
import org.koin.dsl.module

val repoModule = module {
    single<MemeRepository> {
        MemeRepositoryImpl(get(),get())
    }
}