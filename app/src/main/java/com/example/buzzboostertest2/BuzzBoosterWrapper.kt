package com.example.buzzboostertest2

import android.content.Context
import com.buzzvil.booster.external.BuzzBooster
import com.buzzvil.booster.external.BuzzBoosterConfig
import com.buzzvil.booster.external.BuzzBoosterUser

object BuzzBoosterWrapper {

    fun init(context: Context) {
        val buzzBoosterConfig = BuzzBoosterConfig("")
        BuzzBooster.init(context, buzzBoosterConfig)
        BuzzBooster.getInstance().addUserEventListener(BuzzBoosterEventListener())
    }

    @JvmStatic
    fun setUser(id: Long?) {
        val user = id?.takeIf { id > 0 }?.let {
            BuzzBoosterUser.Builder()
                .setUserId(id.toString())
                .build()
        }
        BuzzBooster.setUser(user)
    }

}
