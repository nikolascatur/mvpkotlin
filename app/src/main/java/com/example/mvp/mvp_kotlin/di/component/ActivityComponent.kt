package com.example.mvp.mvp_kotlin.di.component

import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.di.PerActivity
import com.example.mvp.mvp_kotlin.di.module.ActivityModule
import dagger.Component

/**
 * Created by nikolascatur on 19/12/17.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun baseActivity(): BaseActivity;
}