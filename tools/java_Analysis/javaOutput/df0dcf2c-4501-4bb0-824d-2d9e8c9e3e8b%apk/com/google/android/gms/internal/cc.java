package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Arrays;

public abstract class cc
{
  protected final l a;
  protected final int b;
  private final int c;

  public cc(l paraml, int paramInt)
  {
    this.a = ((l)f.a(paraml));
    if ((paramInt >= 0) && (paramInt < paraml.i));
    for (boolean bool = true; ; bool = false)
    {
      f.a(bool);
      this.b = paramInt;
      this.c = paraml.a(this.b);
      return;
    }
  }

  protected final long a(String paramString)
  {
    return this.a.a(paramString, this.b, this.c);
  }

  protected final int b(String paramString)
  {
    return this.a.b(paramString, this.b, this.c);
  }

  protected final boolean c(String paramString)
  {
    return this.a.d(paramString, this.b, this.c);
  }

  protected final String d(String paramString)
  {
    return this.a.c(paramString, this.b, this.c);
  }

  protected final Uri e(String paramString)
  {
    String str = this.a.c(paramString, this.b, this.c);
    if (str == null)
      return null;
    return Uri.parse(str);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof cc;
    boolean bool2 = false;
    if (bool1)
    {
      cc localcc = (cc)paramObject;
      boolean bool3 = d.a(Integer.valueOf(localcc.b), Integer.valueOf(this.b));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = d.a(Integer.valueOf(localcc.c), Integer.valueOf(this.c));
        bool2 = false;
        if (bool4)
        {
          l locall1 = localcc.a;
          l locall2 = this.a;
          bool2 = false;
          if (locall1 == locall2)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  protected final boolean f(String paramString)
  {
    return this.a.e(paramString, this.b, this.c);
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
