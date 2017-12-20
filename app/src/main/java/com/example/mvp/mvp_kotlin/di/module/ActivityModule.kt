package com.example.mvp.mvp_kotlin.di.module

import com.example.mvp.mvp_kotlin.base.BaseActivity
import dagger.Module
import dagger.Provides

/**
 * Created by nikolascatur on 19/12/17.
 */

@Module
class ActivityModule(val baseActivity : BaseActivity){

    @Provides
    fun activity(): BaseActivity = baseActivity
}