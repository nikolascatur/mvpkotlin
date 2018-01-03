package com.example.mvp.mvp_kotlin.base

import com.example.mvp.mvp_kotlin.model.Contributor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by nikolascatur on 21/12/17.
 */
abstract class BaseNetwork<T> {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun interceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

    fun httpClientBuilder(): OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor())
            .readTimeout(3, TimeUnit.SECONDS)
            .writeTimeout(3,TimeUnit.SECONDS)
            .connectTimeout(3,TimeUnit.SECONDS)
            .build()

    fun gsonProvider():Gson = GsonBuilder().create()

    fun provideRetrovit():Retrofit = Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .client(httpClientBuilder())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    fun networkService():T = provideRetrovit().create(getApi())

    fun clearAllSubscription() = compositeDisposable.clear()

    fun addSubscription(disposable: Disposable): Disposable {
        compositeDisposable.add(disposable)
        return compositeDisposable
    }

    abstract fun getBaseUrl():String

    abstract fun getApi():Class<T>

}