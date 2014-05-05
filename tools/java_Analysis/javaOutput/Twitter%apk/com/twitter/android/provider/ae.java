package com.twitter.android.provider;

import ad;
import cr;
import cv;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ae
  implements Serializable
{
  public final long a;
  public final String b;
  public final String c;
  public final long d;

  private ae(cv paramcv)
  {
    this.a = paramcv.a();
    this.b = paramcv.b();
    this.c = paramcv.c();
    ad localad = paramcv.h();
    if (localad == null);
    for (long l = 0L; ; l = localad.a)
    {
      this.d = l;
      return;
    }
  }

  public static byte[] a(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new ae((cv)localIterator.next()));
    return cr.a(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
