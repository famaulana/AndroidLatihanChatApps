package com.example.androidlatihanchat_farhanagungmaulana.services

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.messaging.FirebaseMessaging


class FirebaseInstncIDServices : FirebaseInstanceIdService(){
    private val FRIENDLY_ENGAGE_TOPIC = "friendly_engage"

    override fun onTokenRefresh() {
        super.onTokenRefresh()

        val token = FirebaseInstanceId.getInstance().token

        FirebaseMessaging.getInstance().subscribeToTopic(FRIENDLY_ENGAGE_TOPIC)
    }
}