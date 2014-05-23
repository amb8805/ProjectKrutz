package com.google.android.gms.internal;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;

public final class l
  implements SafeParcelable
{
  public static final cg a = new cg();
  private static final HashMap<CursorWindow, Throwable> k = null;
  private static final Object l = new Object();
  private static final cd m = new l.1(new String[0]);
  int b;
  String[] c;
  Bundle d;
  CursorWindow[] e;
  int f;
  Bundle g;
  int[] h;
  int i;
  boolean j = false;

  l()
  {
  }

  private void a(String paramString, int paramInt)
  {
    if ((this.d == null) || (!this.d.containsKey(paramString)))
      throw new IllegalArgumentException("No such column: " + paramString);
    if (b())
      throw new IllegalArgumentException("Buffer is closed.");
    if ((paramInt < 0) || (paramInt >= this.i))
      throw new CursorIndexOutOfBoundsException(paramInt, this.i);
  }

  private boolean b()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int a(int paramInt)
  {
    int n = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.i))
    {
      bool = true;
      f.a(bool);
    }
    while (true)
    {
      if (n < this.h.length)
      {
        if (paramInt < this.h[n])
          n--;
      }
      else
      {
        if (n == this.h.length)
          n--;
        return n;
        bool = false;
        break;
      }
      n++;
    }
  }

  public final long a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.e[paramInt2].getLong(paramInt1 - this.h[paramInt2], this.d.getInt(paramString));
  }

  public final void a()
  {
    int n = 0;
    this.d = new Bundle();
    for (int i1 = 0; i1 < this.c.length; i1++)
      this.d.putInt(this.c[i1], i1);
    this.h = new int[this.e.length];
    int i2 = 0;
    while (n < this.e.length)
    {
      this.h[n] = i2;
      i2 += this.e[n].getNumRows();
      n++;
    }
    this.i = i2;
  }

  public final int b(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.e[paramInt2].getInt(paramInt1 - this.h[paramInt2], this.d.getInt(paramString));
  }

  public final String c(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.e[paramInt2].getString(paramInt1 - this.h[paramInt2], this.d.getInt(paramString));
  }

  public final boolean d(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return Long.valueOf(this.e[paramInt2].getLong(paramInt1 - this.h[paramInt2], this.d.getInt(paramString))).longValue() == 1L;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean e(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1);
    return this.e[paramInt2].isNull(paramInt1 - this.h[paramInt2], this.d.getInt(paramString));
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cg.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
