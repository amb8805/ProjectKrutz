package com.spotify.mobile.android.util;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.System;

public final class dh extends ContentObserver
{
  public static final Uri a = Settings.System.CONTENT_URI;
  private AudioManager b;
  private int c;
  private di d;

  public dh(Context paramContext, Handler paramHandler)
  {
    super(paramHandler);
    this.b = ((AudioManager)paramContext.getSystemService("audio"));
    this.c = this.b.getStreamVolume(3);
  }

  public final void a(di paramdi)
  {
    this.d = paramdi;
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    int i = this.b.getStreamVolume(3);
    if (this.c - i != 0)
    {
      this.c = i;
      if (this.d != null)
        this.d.a(i / this.b.getStreamMaxVolume(3));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
