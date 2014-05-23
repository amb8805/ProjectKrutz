package com.spotify.mobile.android.service.managers;

import com.spotify.mobile.android.orbit.OrbitPlayerInterface;

public final class c
{
  private OrbitPlayerInterface a;

  public c(OrbitPlayerInterface paramOrbitPlayerInterface)
  {
    this.a = paramOrbitPlayerInterface;
  }

  public final void a()
  {
    this.a.clearQueue();
  }

  public final void a(int paramInt)
  {
    this.a.seekToPosition(paramInt);
  }

  public final void a(String paramString1, int paramInt, boolean paramBoolean, String paramString2, String paramString3, String paramString4)
  {
    this.a.playPath(paramString1, paramInt, paramBoolean, paramString2, paramString3, paramString4);
  }

  public final void a(boolean paramBoolean)
  {
    this.a.setPaused(paramBoolean);
  }

  public final void a(String[] paramArrayOfString)
  {
    this.a.playPreview(paramArrayOfString);
  }

  public final void b()
  {
    this.a.togglePaused();
  }

  public final void b(int paramInt)
  {
    this.a.skipNTracksBackwards(paramInt);
  }

  public final void b(boolean paramBoolean)
  {
    this.a.playPrevious(paramBoolean);
  }

  public final void c()
  {
    this.a.playNext();
  }

  public final void c(int paramInt)
  {
    this.a.skipNTracksForwards(paramInt);
  }

  public final void d()
  {
    this.a.stopPreview();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.managers.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
