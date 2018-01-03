package com.example.mvp.mvp_kotlin.calculator

import com.example.mvp.mvp_kotlin.base.BasePresenter
import javax.inject.Inject

/**
 * Created by nikolascatur on 19/12/17.
 */
class CalculatorPresenter @Inject constructor(): BasePresenter<CalculatorContract.View>(),CalculatorContract.Presenter {
    override fun calculate(value: String): String {
        return value
    }

}