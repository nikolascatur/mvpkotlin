package com.example.mvp.mvp_kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.Unbinder
import com.example.mvp.mvp_kotlin.ApplicationBase
import com.example.mvp.mvp_kotlin.di.component.ApplicationComponent
import com.example.mvp.mvp_kotlin.di.module.ActivityModule
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


/**
 * Created by nikolascatur on 15/12/17.
 */

abstract class BaseActivity : AppCompatActivity() {

    var unbinder: Unbinder? = null

    val uiSubscription:CompositeDisposable = CompositeDisposable()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayout())
        unbinder = ButterKnife.bind(this)
        setup()
        getApplicationComponent().inject(this)

    }

    fun addUiSubscription(disposable: Disposable) : Disposable{
        uiSubscription.add(disposable)
        return uiSubscription
    }

    fun clearAllSubscription(){
        uiSubscription.clear()
    }

    abstract fun setup()
    abstract fun getLayout(): Int

    fun getApplicationComponent(): ApplicationComponent = (application as ApplicationBase).getApplicationComponent()

    fun getActiveModule(): ActivityModule = ActivityModule(this)

    override fun onDestroy() {
        super.onDestroy()
        unbinder!!.unbind()
        clearAllSubscription()
    }
}

