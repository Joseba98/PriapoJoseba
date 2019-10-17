package com.example.priapojoseba;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Log.i("ALARMA", "RIIINNG!!!");
        Toast.makeText(context, "I'm running", Toast.LENGTH_SHORT).show();
    }
}
