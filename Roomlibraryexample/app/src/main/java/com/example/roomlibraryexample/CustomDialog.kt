package com.example.roomlibraryexample

import android.app.AlertDialog
import android.content.Context
import dmax.dialog.SpotsDialog

class CustomDialog(var context: Context) {
    lateinit var progressbar: AlertDialog

    fun showProgressBar() {
        progressbar = SpotsDialog.Builder().setTheme(R.style.Custom).setContext(context).build()

        progressbar.show()
    }

    fun hideProgressBar() {
        if (progressbar != null) {
            progressbar.dismiss()
        }
    }
}