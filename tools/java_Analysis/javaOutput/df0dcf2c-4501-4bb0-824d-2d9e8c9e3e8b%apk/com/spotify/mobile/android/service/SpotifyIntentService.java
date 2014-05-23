package com.spotify.mobile.android.service;

import android.app.IntentService;
import android.content.Intent;
import com.spotify.mobile.android.util.a;

public class SpotifyIntentService extends IntentService
{
  public SpotifyIntentService()
  {
    super("SpotifyIntentService");
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null));
    String str2;
    do
    {
      String str1;
      do
      {
        return;
        str1 = paramIntent.getAction();
        if (str1.equals("com.spotify.mobile.android.service.action.OVERRIDE_TEST_GROUP"))
        {
          String str3 = paramIntent.getStringExtra("test_name");
          int i = paramIntent.getIntExtra("test_group", -1);
          if (a.a(str3, i))
            a.a(getContentResolver(), str3, i);
        }
      }
      while (!str1.equals("com.spotify.mobile.android.service.action.RESET_TEST_GROUP"));
      str2 = paramIntent.getStringExtra("test_name");
    }
    while (!a.a(str2));
    a.a(getContentResolver(), str2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.SpotifyIntentService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
