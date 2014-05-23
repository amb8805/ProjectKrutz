package com.spotify.mobile.android.util;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;

public final class br
{
  private Activity a;
  private d b = (d)c.a(d.class);
  private a c = (a)c.a(a.class);

  public br(Activity paramActivity)
  {
    this.a = paramActivity;
  }

  @JavascriptInterface
  public final void addToQueue(String paramString)
  {
    d.a(this.a, paramString);
  }

  @JavascriptInterface
  public final void clearQueue()
  {
    d.b(this.a);
  }

  @JavascriptInterface
  public final void close()
  {
    this.a.finish();
  }

  @JavascriptInterface
  public final void playNext()
  {
    d.d(this.a);
  }

  @JavascriptInterface
  public final void playPrevious()
  {
    d.b(this.a, false);
  }

  @JavascriptInterface
  public final void playPrevious(boolean paramBoolean)
  {
    d.b(this.a, paramBoolean);
  }

  @JavascriptInterface
  public final void playTrack(String paramString)
  {
    d.a(this.a, ViewUri.aO, aa.a(paramString), false);
  }

  @JavascriptInterface
  public final void shareUri(String paramString1, String paramString2, String paramString3)
  {
    a.a(this.a, paramString1, paramString2, paramString3);
  }

  @JavascriptInterface
  public final void showPlayer()
  {
    d.a(this.a);
  }

  @JavascriptInterface
  public final void togglePaused()
  {
    d.c(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.br
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
