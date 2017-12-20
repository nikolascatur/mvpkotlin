package com.example.mvp.mvp_kotlin.home

import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.di.component.DaggerHomeComponent
import com.example.mvp.mvp_kotlin.di.component.HomeComponent
import javax.inject.Inject

/**
 * Created by nikolascatur on 18/12/17.
 */
 class HomeActivity : BaseActivity(),HomeContract.View{

    @Inject
    lateinit var homePresenter: HomePresenter
    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun setup() {
        initInjection()
        initView()
    }

    fun initView(){
        homePresenter.setView(this)
    }

    fun initInjection(){

        var homeComponent:HomeComponent = DaggerHomeComponent.builder().applicationComponent(getApplicationComponent()).build()
        homeComponent.Inject(this)
    }

}