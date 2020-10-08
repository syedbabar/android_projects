package com.example.realmexample.activity

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.realmexample.R
import com.example.realmexample.model.Role
import com.example.realmexample.model.User
import io.realm.Realm
import io.realm.Sort
import io.realm.kotlin.where

class MainActivity : AppCompatActivity() {

    private lateinit var realm: Realm

    private lateinit var arrayAdapter: ArrayAdapter<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a Realm instance for this thread
        realm = Realm.getDefaultInstance()

        searchUser("babar")
    }

    private fun addUser(id: Int, name: String, role: Role) {
        realm.beginTransaction()
        realm.executeTransactionAsync {
            it.insertOrUpdate(
                User(id, name, role)
            )
        }
        realm.commitTransaction()
    }

    private fun deleteUser(name: String) {
        realm.executeTransactionAsync {
            val getUser = it.where<User>().equalTo("name", name).findAll().deleteAllFromRealm()
        }
    }

    private fun getUser() {
        realm.beginTransaction()
        realm.executeTransactionAsync {
            val getUser = it.where<User>().findAll()
            Log.d("getUser", getUser.asJSON())
        }


        realm.commitTransaction()
    }

    private fun searchUser(name: String) {
        realm.beginTransaction()
        realm.executeTransactionAsync {
            val getUser = it.where<User>().equalTo("name", name).findAll()
            Log.d("getUser", getUser.asJSON())
        }
        realm.commitTransaction()
    }

    private fun sortUserByName() {
        realm.beginTransaction()
        realm.executeTransactionAsync {
            val getUser = it.where<User>().sort("name", Sort.ASCENDING).findAll()
            Log.d(
                "getUser", getUser.asJSON()
            )
        }
        realm.commitTransaction()
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }
}
