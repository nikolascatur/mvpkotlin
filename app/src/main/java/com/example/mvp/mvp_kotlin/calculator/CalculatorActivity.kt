package com.example.mvp.mvp_kotlin.calculator

import com.example.mvp.mvp_kotlin.R
import com.example.mvp.mvp_kotlin.base.BaseActivity
import com.example.mvp.mvp_kotlin.di.component.DaggerHomeComponent
import com.example.mvp.mvp_kotlin.util.RxHelper
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_calculator.*
import javax.inject.Inject

/**
 * Created by nikolascatur on 19/12/17.
 */
class CalculatorActivity : BaseActivity(), CalculatorContract.View {
    @Inject
    lateinit var calculatorPresenter: CalculatorPresenter

    val homeComponent by lazy {
        DaggerHomeComponent.builder()
                .applicationComponent(getApplicationComponent())
                .build()
    }

    override fun setup() {
        initInjection()
        initView()
        observerInput()
    }

    override fun getLayout(): Int = R.layout.activity_calculator

    fun initView() {
        calculatorPresenter.setView(this)
    }

    fun observerInput(){
        addUiSubscription(dataInputCalculator().subscribe(this::updateResult))
    }

    fun dataInputCalculator(): Observable<String> = RxHelper
            .textTrim(etInput)
            .map { input -> calculatorPresenter.calculate(input) }
            .distinctUntilChanged()

    fun initInjection() {
        homeComponent.Inject(this)
    }

    override fun updateResult(result: String) {
        tvResult.setText(result)
    }

}