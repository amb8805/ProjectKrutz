package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class s
  implements o
{
  public s()
  {
  }

  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof AdWebView))
    {
      ((AdWebView)paramWebView).f();
      return;
    }
    b.b("Trying to close WebView that isn't an AdWebView");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
