package io.mobilisten.dev.onesignaltestapp;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService
{
    @Override
    public void onNewToken(String s)
    {
        Log.i("OneSignalDemoApp","Firebase token: "+s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage)
    {
        super.onMessageReceived(remoteMessage);
    }
}
