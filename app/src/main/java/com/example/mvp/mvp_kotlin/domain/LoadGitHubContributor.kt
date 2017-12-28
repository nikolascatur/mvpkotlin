package com.example.mvp.mvp_kotlin.domain

import com.example.mvp.mvp_kotlin.Api.GithubApi
import com.example.mvp.mvp_kotlin.base.BaseNetwork
import com.example.mvp.mvp_kotlin.model.Contributor
import io.reactivex.Observable

/**
 * Created by nikolascatur on 22/12/17.
 */
open class LoadGitHubContributor : BaseNetwork<GithubApi>() {
    override fun getBaseUrl(): String = "https://api.github.com/repos/square/retrofit/"

    override fun getApi(): Class<GithubApi> = GithubApi::class.java


    fun getListContributor(page:Int): Observable<List<Contributor>> = networkService().getListContributor(page)

}