package com.example.mvp.mvp_kotlin.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by nikolascatur on 19/12/17.
 */
@Module
class ApplicationModule(val application: Application){

    @Provides
    @Singleton fun provideApplicationContext() : Context = application
}