package com.spotify.mobile.android.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cv
{
  private String a;
  private int b;
  private boolean c;
  private boolean d;

  private cv(String paramString)
  {
    this(paramString, 0, false);
  }

  public cv(String paramString, int paramInt)
  {
    this(paramString, paramInt, true);
  }

  public cv(String paramString, int paramInt, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramBoolean;
    this.d = false;
  }

  public static cv a(cw paramcw, cy paramcy, cv paramcv, List<cv> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      cv localcv = (cv)localIterator.next();
      localArrayList.add(localcv.b());
      if (localcv.c)
        localArrayList.add(localcv.b(true));
    }
    if (paramcv == null);
    for (String str = ""; ; str = paramcv.b())
      return a(paramcw.a(paramcy, str, (String[])localArrayList.toArray(new String[0])), paramList);
  }

  public static cv a(String paramString, List<cv> paramList)
  {
    if (paramString == null)
      return null;
    int i = paramString.lastIndexOf(" REVERSE");
    if (i > 0)
      paramString = paramString.substring(0, i);
    for (boolean bool = true; ; bool = false)
    {
      int j = paramList.indexOf(new cv(paramString));
      if (j >= 0)
        return ((cv)paramList.get(j)).a(bool);
      return null;
    }
  }

  private String b(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(this.a);
    if ((this.c) && (paramBoolean));
    for (String str = " REVERSE"; ; str = "")
      return str;
  }

  public final cv a(boolean paramBoolean)
  {
    if (!this.c)
      return this;
    this.d = paramBoolean;
    return this;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return b(this.d);
  }

  public final int c()
  {
    return this.b;
  }

  public final boolean d()
  {
    return this.c;
  }

  public final boolean e()
  {
    if (!this.c)
      return false;
    return this.d;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cv));
    while (!((cv)paramObject).a.equals(this.a))
      return false;
    return true;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
