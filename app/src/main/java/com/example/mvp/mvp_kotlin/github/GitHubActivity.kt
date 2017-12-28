package com.example.mvp.mvp_kotlin.github

import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.di.component.DaggerGitHubComponent
import com.example.mvp.mvp_kotlin.di.component.GitHubComponent
import com.example.mvp.mvp_kotlin.di.module.GithubModule
import com.example.mvp.mvp_kotlin.domain.LoadGitHubContributor
import javax.inject.Inject

/**
 * Created by nikolascatur on 27/12/17.
 */
class GitHubActivity() : BaseActivity(), GitHubContract.View {

    @Inject
    lateinit var gitHubPresenter: GitHubPresenter

    val gitHubComponent by lazy {
        DaggerGitHubComponent.builder()
                .applicationComponent(getApplicationComponent())
                .githubModule(GithubModule()).build()
    }

    override fun setup() {
        initInjection()
        initView()
    }

    override fun getLayout(): Int = R.layout.activity_github

    fun initView() {
        gitHubPresenter.setView(this)
    }

    fun initInjection() {

        gitHubComponent.Inject(this)
    }

}