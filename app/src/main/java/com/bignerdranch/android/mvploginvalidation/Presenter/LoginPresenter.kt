package com.bignerdranch.android.mvploginvalidation.Presenter

import com.bignerdranch.android.mvploginvalidation.Model.User
import com.bignerdranch.android.mvploginvalidation.View.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView): ILoginPresenter {


    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCode = user.isValid()


        when(loginCode){
            0 ->{
                iLoginView.onLoginError("Email must not be null")
            }
            1->{
                iLoginView.onLoginError("Wrong email address")
            }
            2 ->{
                iLoginView.onLoginError("Password must be greater then 6")
            }
            -1->{
                iLoginView.onLoginSuccess("Login success")
            }
        }

    }
}