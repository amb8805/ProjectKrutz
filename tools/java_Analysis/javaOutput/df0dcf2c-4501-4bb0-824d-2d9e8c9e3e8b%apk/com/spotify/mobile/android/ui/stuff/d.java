package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import java.lang.ref.WeakReference;

final class d
{
  public final ContentViewManager.ContentState a;
  public final int b;
  public final int c;
  private final SpotifyIcon d;
  private WeakReference<Drawable> e = new WeakReference(null);

  private d(ContentViewManager.ContentState paramContentState, SpotifyIcon paramSpotifyIcon, int paramInt1, int paramInt2)
  {
    this.a = paramContentState;
    this.d = paramSpotifyIcon;
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public final Drawable a(Context paramContext)
  {
    Drawable localDrawable = (Drawable)this.e.get();
    if (localDrawable == null)
    {
      localDrawable = i.b(paramContext, this.d);
      this.e = new WeakReference(localDrawable);
    }
    return localDrawable;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    if (bool1)
    {
      int i = ((d)paramObject).a.a();
      int j = this.a.a();
      bool2 = false;
      if (i == j)
        bool2 = true;
    }
    return bool2;
  }

  public final int hashCode()
  {
    return this.a.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.stuff.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
