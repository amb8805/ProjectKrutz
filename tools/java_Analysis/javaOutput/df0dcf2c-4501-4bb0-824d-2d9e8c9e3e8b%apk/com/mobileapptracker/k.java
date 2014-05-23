package com.mobileapptracker;

import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

final class k
  implements Runnable
{
  private final WeakReference b;

  public k(h paramh, Context paramContext)
  {
    this.b = new WeakReference(paramContext);
  }

  public final void run()
  {
    try
    {
      WebView localWebView = new WebView((Context)this.b.get());
      String str = localWebView.getSettings().getUserAgentString();
      localWebView.destroy();
      h.a(this.a, str);
      return;
    }
    catch (Exception localException)
    {
      while (!h.a(this.a));
      Log.d("MobileAppTracker", "Could not get user agent");
      localException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
