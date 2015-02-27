package org.example.androidsdk.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneReceiver extends BroadcastReceiver {
    public PhoneReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle extras = intent.getExtras();
        if(extras != null){
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.d("PhoneReceiver", state);
            if(state == TelephonyManager.EXTRA_STATE_RINGING){
                String phoneNumber = (String)extras.get(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d("PhoneReceiver", phoneNumber);

            }

        }
    }
}
