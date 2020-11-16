package com.bignerdranch.android.mvploginvalidation.View

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}