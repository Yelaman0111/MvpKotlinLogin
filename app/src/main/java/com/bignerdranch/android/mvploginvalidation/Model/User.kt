package com.bignerdranch.android.mvploginvalidation.Model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(override val email: String, override val password: String ):IUser {
    override fun isValid(): Int {
        if (TextUtils.isEmpty(email))
            return 0
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 1
        else if(password.length <= 6)
            return 2
        else
            return -1
    }
}