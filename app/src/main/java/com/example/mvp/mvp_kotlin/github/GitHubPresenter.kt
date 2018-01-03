package com.example.mvp.mvp_kotlin.github

import com.example.mvp.mvp_kotlin.base.BasePresenter
import com.example.mvp.mvp_kotlin.domain.LoadGitHubContributor
import com.example.mvp.mvp_kotlin.model.Contributor
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import javax.inject.Inject

/**
 * Created by nikolascatur on 27/12/17.
 */
class GitHubPresenter @Inject constructor(val loadGitHubContributor: LoadGitHubContributor) : BasePresenter<GitHubContract.View>(), GitHubContract.Presenter {

    override fun loadContent() {
       loadGitHubContributor.execute(object : DisposableObserver<List<Contributor>>(){
           override fun onComplete() {
           }

           override fun onError(e: Throwable) {
           }

           override fun onNext(contributs: List<Contributor>) {
               getView()?.attachContent(contributs)
           }


       }, 1)
    }


}