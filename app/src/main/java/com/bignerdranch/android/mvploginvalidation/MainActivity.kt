package com.bignerdranch.android.mvploginvalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bignerdranch.android.mvploginvalidation.Presenter.ILoginPresenter
import com.bignerdranch.android.mvploginvalidation.Presenter.LoginPresenter
import com.bignerdranch.android.mvploginvalidation.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {


    internal lateinit var loginPresenter: ILoginPresenter

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message,Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginPresenter = LoginPresenter(this)




        btn_login.setOnClickListener {
            loginPresenter.onLogin(et_email.text.toString(), et_password.text.toString())
        }



    }
}