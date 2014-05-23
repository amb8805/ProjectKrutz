package com.spotify.mobile.android.service;

import android.content.Context;
import com.spotify.mobile.android.core.internal.LocalFilePlayer;
import com.spotify.mobile.android.core.internal.LocalFilePlayer.LocalFilePlayerListener;
import com.spotify.mobile.android.core.internal.SoundDriver;
import com.spotify.mobile.android.core.internal.SoundDriver.SoundDriverListener;

public final class b
{
  private Context a;
  private int b = 0;
  private LocalFilePlayer.LocalFilePlayerListener c = new b.1(this);
  private SoundDriver.SoundDriverListener d = new b.2(this);

  public b(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a()
  {
    SoundDriver.addListener(this.d);
    LocalFilePlayer.addListener(this.c);
  }

  public final void b()
  {
    SoundDriver.removeListener(this.d);
    LocalFilePlayer.removeListener(this.c);
  }

  public final int c()
  {
    return this.b;
  }

  public final void d()
  {
    SoundDriver.startDuckingAudio(this.b);
  }

  public final void e()
  {
    SoundDriver.stopDuckingAudio(this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
