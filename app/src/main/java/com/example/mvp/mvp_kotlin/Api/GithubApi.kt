package com.example.mvp.mvp_kotlin.Api

import com.example.mvp.mvp_kotlin.model.Contributor
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by nikolascatur on 22/12/17.
 */
interface GithubApi {

    @GET("contributors")
    fun getListContributor(@Query("page")page:Int): Observable<List<Contributor>>
}