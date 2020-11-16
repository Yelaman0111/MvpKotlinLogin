package com.bignerdranch.android.mvploginvalidation.Model

interface IUser {
    val email: String
    val password: String
    fun isValid(): Int
}