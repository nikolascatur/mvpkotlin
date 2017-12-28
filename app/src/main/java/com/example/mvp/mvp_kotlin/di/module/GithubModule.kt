package com.example.mvp.mvp_kotlin.di.module

import com.example.mvp.mvp_kotlin.domain.LoadGitHubContributor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by nikolascatur on 28/12/17.
 */
@Module
class GithubModule {

    @Provides
    @Singleton
    fun provideLoadContributor(): LoadGitHubContributor = LoadGitHubContributor()

}