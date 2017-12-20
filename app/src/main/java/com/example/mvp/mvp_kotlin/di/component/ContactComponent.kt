package com.example.mvp.mvp_kotlin.di.component

import com.example.mvp.mvp_kotlin.contact.ContactActivity
import com.example.mvp.mvp_kotlin.di.PerActivity
import com.example.mvp.mvp_kotlin.di.module.ActivityModule
import dagger.Component
import javax.inject.Inject

/**
 * Created by nikolascatur on 20/12/17.
 */
@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ContactComponent {
    fun Inject(contactActivity: ContactActivity)

}