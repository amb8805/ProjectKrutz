package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import com.spotify.mobile.android.util.dk;

public class DeviceActivity extends BaseFragmentActivity
{
  public DeviceActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    if (!((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
      setTheme(2131755264);
    super.onCreate(paramBundle);
    setContentView(2130903067);
    setVolumeControlStream(3);
    if (paramBundle == null)
    {
      l locall = c().a();
      locall.b(2131362202, com.spotify.mobile.android.ui.fragments.c.D());
      locall.b();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DeviceActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
