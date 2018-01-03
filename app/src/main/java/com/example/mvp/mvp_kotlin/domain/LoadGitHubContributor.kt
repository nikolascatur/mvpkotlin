package com.example.mvp.mvp_kotlin.domain

import com.example.mvp.mvp_kotlin.Api.GithubApi
import com.example.mvp.mvp_kotlin.base.BaseNetwork
import com.example.mvp.mvp_kotlin.model.Contributor
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

/**
 * Created by nikolascatur on 22/12/17.
 */
open class LoadGitHubContributor : BaseNetwork<GithubApi>() {
    override fun getBaseUrl(): String = "https://api.github.com/repos/square/retrofit/"

    override fun getApi(): Class<GithubApi> = GithubApi::class.java

    fun getListContributor(observer:DisposableObserver<List<Contributor>>,page:Int): Disposable =
            networkService().getListContributor(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(observer)

    fun execute(observer: DisposableObserver<List<Contributor>>, param: Int): Disposable =
            addSubscription(getListContributor(observer,param))


}