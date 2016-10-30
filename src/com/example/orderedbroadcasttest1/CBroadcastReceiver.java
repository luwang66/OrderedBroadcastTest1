package com.example.orderedbroadcasttest1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CBroadcastReceiver extends BroadcastReceiver {
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "C is Invoked!", Toast.LENGTH_SHORT).show();
	}
}
