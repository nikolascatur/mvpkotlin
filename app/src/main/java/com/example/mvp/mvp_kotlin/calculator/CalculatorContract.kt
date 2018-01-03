package com.example.mvp.mvp_kotlin.calculator

/**
 * Created by nikolascatur on 19/12/17.
 */
interface CalculatorContract{

    interface View {
        fun updateResult(result:String)
    }

    interface Presenter{
        fun calculate(value:String): String
    }
}