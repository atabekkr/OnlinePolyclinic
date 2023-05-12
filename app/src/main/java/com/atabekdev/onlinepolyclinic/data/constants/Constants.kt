package com.atabekdev.onlinepolyclinic.data.constants

import com.atabekdev.onlinepolyclinic.data.model.UserData

object Constants {

    fun users() : List<UserData> {
        val list = mutableListOf<UserData>()

        list.add(UserData("100101201", "user"))
        list.add(UserData("100101202", "user"))
        list.add(UserData("100101203", "user"))
        list.add(UserData("100101204", "user"))
        list.add(UserData("100101205", "user"))

        return list
    }

}