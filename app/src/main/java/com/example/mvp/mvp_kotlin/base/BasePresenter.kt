package com.example.mvp.mvp_kotlin.base

/**
 * Created by nikolascatur on 18/12/17.
 */
abstract class BasePresenter<T>() {

    private var view: T? = null

    fun setView(view:T) {
        this.view = view
    }

    fun getView(): T? = this.view

}