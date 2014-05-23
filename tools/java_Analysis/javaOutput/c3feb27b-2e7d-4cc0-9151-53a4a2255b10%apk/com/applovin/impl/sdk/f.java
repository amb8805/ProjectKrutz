package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Map;

class f extends ar
{
  private final AppLovinAdSize b;

  public f(b paramb, AppLovinAdSize paramAppLovinAdSize)
  {
    super("UpdateAdTask", b.b(paramb));
    this.b = paramAppLovinAdSize;
  }

  public void run()
  {
    int i = 1;
    e locale = (e)((Map)b.c(this.a).get(AppLovinAdType.REGULAR)).get(this.b);
    while (true)
    {
      synchronized (locale.b)
      {
        boolean bool1 = b.a(this.a, this.b);
        boolean bool2 = b.d(this.a);
        if (!e.b(locale).isEmpty())
        {
          j = i;
          if (System.currentTimeMillis() <= locale.d)
            break label149;
          if ((bool1) && (j != 0) && (i != 0) && (bool2) && (!locale.e))
          {
            locale.e = true;
            b.a(this.a, this.b, AppLovinAdType.REGULAR);
          }
          return;
        }
      }
      int j = 0;
      continue;
      label149: i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
