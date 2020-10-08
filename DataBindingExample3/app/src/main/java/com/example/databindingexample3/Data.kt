package com.example.databindingexample3

import androidx.databinding.BaseObservable

class Data : BaseObservable() {

    private var data: Int = 0
    fun setData(text: Int) {
        this.data = text

        notifyChange()
    }

    fun getData(): String {
        return data.toString()
    }
}