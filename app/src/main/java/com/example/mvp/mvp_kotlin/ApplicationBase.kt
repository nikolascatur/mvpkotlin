package com.example.mvp.mvp_kotlin

import android.app.Application
import com.example.mvp.mvp_kotlin.di.component.ApplicationComponent
import com.example.mvp.mvp_kotlin.di.component.DaggerApplicationComponent
import com.example.mvp.mvp_kotlin.di.module.ApplicationModule

/**
 * Created by nikolascatur on 15/12/17.
 */
open class ApplicationBase : Application() {

    fun getApplicationComponent(): ApplicationComponent =
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()

    override fun onCreate() {
        super.onCreate()
        getApplicationComponent()

    }
}