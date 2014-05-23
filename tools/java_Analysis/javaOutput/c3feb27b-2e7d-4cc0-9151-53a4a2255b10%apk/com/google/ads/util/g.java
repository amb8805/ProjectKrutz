package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.m;
import com.google.ads.m.a;
import com.google.ads.n;
import java.io.File;

@TargetApi(11)
public class g
{
  public static void a(View paramView)
  {
    paramView.setLayerType(1, null);
  }

  public static void a(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
  }

  public static void a(WebSettings paramWebSettings, n paramn)
  {
    Context localContext = (Context)paramn.f.a();
    m.a locala = (m.a)((m)paramn.d.a()).b.a();
    paramWebSettings.setAppCacheEnabled(true);
    paramWebSettings.setAppCacheMaxSize(((Long)locala.i.a()).longValue());
    paramWebSettings.setAppCachePath(new File(localContext.getCacheDir(), "admob").getAbsolutePath());
    paramWebSettings.setDatabaseEnabled(true);
    paramWebSettings.setDatabasePath(localContext.getDatabasePath("admob").getAbsolutePath());
    paramWebSettings.setDomStorageEnabled(true);
    paramWebSettings.setSupportZoom(true);
    paramWebSettings.setBuiltInZoomControls(true);
    paramWebSettings.setDisplayZoomControls(false);
  }

  public static void b(View paramView)
  {
    paramView.setLayerType(0, null);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.util.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
