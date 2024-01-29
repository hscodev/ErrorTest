package com.example.buzzboostertest2

import com.buzzvil.booster.external.UserEvent
import com.buzzvil.booster.external.UserEventListener

class BuzzBoosterEventListener: UserEventListener {
    override fun onUserEvent(userEvent: UserEvent) {
        when (userEvent.name) {
            BOTTOM_SHEET_SHOW -> {
            }
            VISIT -> {
            }
        }
    }

    companion object {
        private const val BOTTOM_SHEET_SHOW = "bb_bottom_sheet_show"
        private const val VISIT = "bb_visit"
    }
}
