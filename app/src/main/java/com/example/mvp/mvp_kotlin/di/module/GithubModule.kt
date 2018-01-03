package com.example.mvp.mvp_kotlin.di.module

import com.example.mvp.mvp_kotlin.di.PerActivity
import com.example.mvp.mvp_kotlin.domain.LoadGitHubContributor
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by nikolascatur on 28/12/17.
 */
@Module
class GithubModule {

    @Provides
    fun provideLoadContributor(): LoadGitHubContributor = LoadGitHubContributor()

}