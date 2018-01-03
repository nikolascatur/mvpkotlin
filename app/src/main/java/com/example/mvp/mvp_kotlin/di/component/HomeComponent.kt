package com.example.mvp.mvp_kotlin.di.component

import com.example.mvp.mvp_kotlin.calculator.CalculatorActivity
import com.example.mvp.mvp_kotlin.di.PerActivity
import com.example.mvp.mvp_kotlin.di.module.ActivityModule
import com.example.mvp.mvp_kotlin.home.HomeActivity
import dagger.Component
import javax.inject.Inject

/**
 * Created by nikolascatur on 19/12/17.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface HomeComponent {
    fun Inject(homeActivity: HomeActivity)
    fun Inject(calculatorActivity: CalculatorActivity)
}