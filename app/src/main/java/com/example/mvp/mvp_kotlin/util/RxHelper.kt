package com.example.mvp.mvp_kotlin.util

import android.widget.EditText
import android.widget.TextView
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.Observable

/**
 * Created by nikolascatur on 03/01/18.
 */
class RxHelper {

    companion object {
        fun textTrim(editText: EditText): Observable<String> {
            return RxTextView
                    .textChanges(editText)
                    .map(CharSequence::toString)
//            !!
//                    .map { input -> CalculatorHelper.calculate(input) }
//                    .distinctUntilChanged()
        }
    }
}