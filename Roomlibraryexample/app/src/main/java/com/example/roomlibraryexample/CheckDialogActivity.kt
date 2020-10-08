package com.example.roomlibraryexample

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_check_dialog.*


class CheckDialogActivity : AppCompatActivity() {

    lateinit var progressDialog: CustomDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_dialog)

        progressDialog = CustomDialog(this)

        btn_show_dialog.setOnClickListener {
            progressDialog.showProgressBar()

            Handler().postDelayed({
                progressDialog.hideProgressBar()
            }, 2000)

        }
    }
}
