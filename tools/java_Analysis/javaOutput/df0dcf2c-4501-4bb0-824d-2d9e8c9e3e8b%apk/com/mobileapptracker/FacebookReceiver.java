package com.mobileapptracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class FacebookReceiver extends BroadcastReceiver
{
  public FacebookReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("mat_fb_intent", 0).edit();
    localEditor.putString("action", paramIntent.getAction());
    localEditor.commit();
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.FacebookReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
