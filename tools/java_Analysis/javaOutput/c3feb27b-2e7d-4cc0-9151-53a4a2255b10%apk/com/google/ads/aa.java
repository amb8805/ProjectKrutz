package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class aa
  implements o
{
  public aa()
  {
  }

  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    int i = -1;
    if ((paramWebView instanceof ActivationOverlay));
    while (true)
    {
      try
      {
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("w")))
          break label255;
        j = Integer.parseInt((String)paramHashMap.get("w"));
        if (!TextUtils.isEmpty((CharSequence)paramHashMap.get("h")))
        {
          k = Integer.parseInt((String)paramHashMap.get("h"));
          if (!TextUtils.isEmpty((CharSequence)paramHashMap.get("x")))
          {
            m = Integer.parseInt((String)paramHashMap.get("x"));
            if (!TextUtils.isEmpty((CharSequence)paramHashMap.get("y")))
            {
              n = Integer.parseInt((String)paramHashMap.get("y"));
              i = n;
            }
            if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("1")))
            {
              paramd.a(null, true, m, i, j, k);
              return;
            }
          }
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.d("Invalid number format in activation overlay response.", localNumberFormatException);
        return;
      }
      while (true)
      {
        int n;
        if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("0")))
        {
          paramd.a(null, false, m, i, j, k);
          return;
        }
        paramd.a(m, i, j, k);
        return;
        b.b("Trying to activate an overlay when this is not an overlay.");
        return;
        int m = i;
        continue;
        int k = i;
      }
      label255: int j = i;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
