package com.demo.small.app.detail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StubBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "StubBroadcastReceiver, onReceive", Toast.LENGTH_SHORT).show();
    }
}
