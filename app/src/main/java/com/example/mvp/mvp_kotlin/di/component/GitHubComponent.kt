package com.example.mvp.mvp_kotlin.di.component

import com.example.mvp.mvp_kotlin.di.PerActivity
import com.example.mvp.mvp_kotlin.di.module.GithubModule
import com.example.mvp.mvp_kotlin.github.GitHubActivity
import dagger.Component
import javax.inject.Inject

/**
 * Created by nikolascatur on 28/12/17.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(GithubModule::class))
interface GitHubComponent {
    fun Inject(gitHubActivity: GitHubActivity)
}
