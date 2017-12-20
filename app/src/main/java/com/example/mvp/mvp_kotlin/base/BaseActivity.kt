package com.example.mvp.mvp_kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mvp.mvp_kotlin.ApplicationBase
import com.example.mvp.mvp_kotlin.di.component.ApplicationComponent
import com.example.mvp.mvp_kotlin.di.module.ActivityModule
import kotlin.reflect.KFunction0

/**
 * Created by nikolascatur on 15/12/17.
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayout())
        setup()
        getApplicationComponent().inject(this)

    }

    abstract fun setup()
    abstract fun getLayout(): Int

    fun getApplicationComponent(): ApplicationComponent = (application as ApplicationBase).getApplicationComponent()

    fun getActiveModule(): ActivityModule = ActivityModule(this)
}

