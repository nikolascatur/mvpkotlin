package com.example.mvp.mvp_kotlin.di.component

import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by nikolascatur on 19/12/17.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(baseActivity: BaseActivity)
}


