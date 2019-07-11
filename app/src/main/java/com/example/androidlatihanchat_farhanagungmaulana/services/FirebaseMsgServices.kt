package com.example.androidlatihanchat_farhanagungmaulana.services

import android.util.Log
import com.example.androidlatihanchat_farhanagungmaulana.utilities.Const.Companion.LOG_TAG
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class FirebaseMsgServices : FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d(LOG_TAG, "FCM Message Id: " + p0!!.getMessageId()!!)
        Log.d(LOG_TAG, "FCM Notification Message: " + p0!!.getNotification()!!)
        Log.d(LOG_TAG, "FCM Data Message: " + p0!!.getData())
    }
}