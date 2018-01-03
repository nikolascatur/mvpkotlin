package com.example.mvp.mvp_kotlin.github

import com.example.mvp.mvp_kotlin.model.Contributor

/**
 * Created by nikolascatur on 27/12/17.
 */
interface GitHubContract{

    interface View{
        fun attachContent(contributors:List<Contributor>)
    }

    interface Presenter{
        fun loadContent()

    }
}