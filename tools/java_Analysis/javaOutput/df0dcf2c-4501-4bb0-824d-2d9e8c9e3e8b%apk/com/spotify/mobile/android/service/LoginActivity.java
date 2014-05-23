package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.flow.FlowActivity;
import com.spotify.mobile.android.util.dk;

public class LoginActivity extends FlowActivity
{
  public LoginActivity()
  {
  }

  public static Intent a(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = new Intent("com.spotify.mobile.android.service.action.session.LOGIN");
    localIntent.setClass(paramContext, LoginActivity.class);
    localIntent.putExtra("intent", paramIntent);
    return localIntent;
  }

  protected void onCreate(Bundle paramBundle)
  {
    if (!((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
      setTheme(2131755263);
    super.onCreate(paramBundle);
    setContentView(2130903066);
    a(com.spotify.mobile.android.service.flow.a.c.E());
    setVisible(false);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.LoginActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
