package com.example.mvp.mvp_kotlin.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by nikolascatur on 19/12/17.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {}
