package com.example.databindingexample

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Contact : BaseObservable() {

    private  var name: String =""
    private  var email: String=""

    fun setName(name: String) {
        this.name = name

        notifyPropertyChanged(BR.name)
    }

    fun setEmail(email: String) {
        this.email = email

        notifyPropertyChanged(BR.email)
    }

    @Bindable
    fun getName(): String {
        return name
    }


    @Bindable
    fun getEmail(): String {
        return email
    }
}