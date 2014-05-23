package com.spotify.mobile.android.util.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;

@TargetApi(14)
public final class c extends a
{
  private NfcAdapter a;

  protected c(Context paramContext)
  {
    this.a = NfcAdapter.getDefaultAdapter(paramContext);
  }

  public final void a(b paramb, Activity paramActivity)
  {
    if (this.a == null)
      return;
    this.a.setNdefPushMessageCallback(new c.1(this, paramb, paramActivity), paramActivity, new Activity[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
