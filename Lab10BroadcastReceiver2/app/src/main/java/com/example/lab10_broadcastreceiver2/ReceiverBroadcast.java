package com.example.lab10_broadcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiverBroadcast extends BroadcastReceiver {

    public ReceiverBroadcast(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast Received!",Toast.LENGTH_SHORT).show();
    }
}
