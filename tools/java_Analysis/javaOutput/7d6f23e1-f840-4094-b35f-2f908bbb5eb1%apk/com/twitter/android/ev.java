package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.client.j;
import com.twitter.android.platform.C2DMService;
import com.twitter.android.platform.TwitterDataSyncService;
import com.twitter.android.platform.d;

final class ev extends i
{
  private ev(ActivityFragment paramActivityFragment)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2, int paramInt3)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427649, 1).show();
    }
    else
    {
      return;
    }
    switch (localdp.b)
    {
    case 3:
    default:
      return;
    case 2:
    case 4:
    }
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("activity", false);
    if (!C2DMService.a);
    for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("show_notif", bool);
      FragmentActivity localFragmentActivity = this.a.getActivity();
      TwitterDataSyncService.a(localFragmentActivity, localBundle, true, d.a(localFragmentActivity, this.a.j.d()));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ev
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
