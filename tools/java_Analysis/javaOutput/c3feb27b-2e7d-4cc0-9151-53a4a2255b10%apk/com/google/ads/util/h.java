package com.google.ads.util;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.google.ads.n;

@TargetApi(17)
public final class h
{
  public static void a(WebSettings paramWebSettings, n paramn)
  {
    g.a(paramWebSettings, paramn);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.util.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
