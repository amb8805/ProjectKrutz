package com.spotify.mobile.android.service;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.spotify.mobile.android.util.cc;

public final class v
{
  private final Context a;
  private final w b;
  private ComponentName c;
  private boolean d;
  private final AudioManager e;
  private final AudioManager.OnAudioFocusChangeListener f = new v.1(this);

  public v(Context paramContext, w paramw)
  {
    cc.a(paramContext);
    cc.a(paramw);
    this.d = false;
    this.a = paramContext;
    this.b = paramw;
    this.e = ((AudioManager)paramContext.getSystemService("audio"));
  }

  public final boolean a()
  {
    int i = 1;
    if (this.d)
      return i;
    if (this.e.requestAudioFocus(this.f, 3, i) == i);
    while (true)
    {
      this.d = i;
      if (this.d)
        this.b.c();
      return this.d;
      int j = 0;
    }
  }

  public final void b()
  {
    if (!this.d)
      return;
    this.d = false;
    this.e.abandonAudioFocus(this.f);
    this.b.a(false, false);
  }

  public final void c()
  {
    if (this.c == null)
      this.c = new ComponentName(this.a.getPackageName(), MediaButtonReceiver.class.getName());
    this.e.registerMediaButtonEventReceiver(this.c);
    this.b.a();
  }

  public final void d()
  {
    if (this.c != null)
      this.e.unregisterMediaButtonEventReceiver(this.c);
    this.b.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
