package com.example.realmexample.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Role(
    @PrimaryKey
    var id: Int = 1,
    var name: String? = ""
) : RealmObject()