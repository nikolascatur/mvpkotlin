package com.example.mvp.mvp_kotlin.home

import android.content.Intent
import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.calculator.CalculatorActivity
import com.example.mvp.mvp_kotlin.di.component.DaggerHomeComponent
import com.example.mvp.mvp_kotlin.di.component.HomeComponent
import com.example.mvp.mvp_kotlin.github.GitHubActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by nikolascatur on 18/12/17.
 */
class HomeActivity : BaseActivity(), HomeContract.View {

    @Inject
    lateinit var homePresenter: HomePresenter

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun setup() {
        initInjection()
        initView()
    }

    fun initView() {
        homePresenter.setView(this)
    }


    fun initAction(){
        btnCalkulator.setOnClickListener {
            val intent = Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }

        btnNetwork.setOnClickListener {
            val intent = Intent(this, GitHubActivity::class.java)
            startActivity(intent)
        }
    }


    fun initInjection() {

        var homeComponent: HomeComponent = DaggerHomeComponent.builder().applicationComponent(getApplicationComponent()).build()
        homeComponent.Inject(this)
    }

}