package com.example.orderedbroadcasttest1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BBroadcastReceiver extends BroadcastReceiver {
	public void onReceive(Context context, Intent intent) {
		Bundle bundle=getResultExtras(true);
		Toast.makeText(context, "B is Invoked!"+"得到的信息"+bundle.getString("A"), Toast.LENGTH_SHORT).show();
	}
}

