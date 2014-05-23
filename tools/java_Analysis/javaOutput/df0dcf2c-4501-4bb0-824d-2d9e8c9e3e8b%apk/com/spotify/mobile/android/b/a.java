package com.spotify.mobile.android.b;

import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cz;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  public static String a(Set<String> paramSet)
  {
    cc.a(paramSet, "Don't pass paths as null");
    Object localObject1 = null;
    long l1 = 0L;
    Iterator localIterator = paramSet.iterator();
    String str;
    while (true)
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        try
        {
          cz localcz = new cz(str);
          long l2 = localcz.b();
          int i = localcz.a();
          l3 = l2 * i;
          if (l3 > l1)
          {
            localObject2 = str;
            l4 = l3;
            l1 = l4;
            localObject1 = localObject2;
            continue;
            return localObject1;
          }
        }
        catch (IOException localIOException)
        {
        }
      }
    while (true)
    {
      long l3;
      break;
      long l4 = l1;
      Object localObject2 = localObject1;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
