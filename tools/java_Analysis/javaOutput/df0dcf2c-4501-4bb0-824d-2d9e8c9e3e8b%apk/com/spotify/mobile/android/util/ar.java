package com.spotify.mobile.android.util;

import android.database.Cursor;
import com.spotify.mobile.android.provider.ae;
import java.util.HashSet;
import java.util.Set;

public final class ar<T>
{
  private Set<T> a;
  private Set<T> b;
  private int c;
  private as d;

  public ar(int paramInt, as paramas)
  {
    cc.a(paramas, "callback musn't be null");
    if (paramInt < 0)
      throw new IllegalArgumentException("numberOfCursors must be positive");
    this.c = paramInt;
    this.d = paramas;
    this.a = new HashSet(paramInt);
    this.b = new HashSet(paramInt);
  }

  public final void a(T paramT, Cursor paramCursor)
  {
    boolean bool = ae.a(paramCursor);
    int i;
    int j;
    int m;
    if (paramCursor.getCount() == 0)
    {
      i = 1;
      j = this.a.size();
      int k = this.b.size();
      m = j + k;
      if (!bool)
        break label179;
      if (i == 0)
        break label154;
      this.a.add(paramT);
      this.b.remove(paramT);
      label77: if ((k != 0) || (this.b.size() <= 0))
        break label204;
    }
    while (true)
    {
      int n = this.a.size() + this.b.size();
      if ((m < this.c) && (n == this.c))
        this.d.a();
      return;
      i = 0;
      break;
      label154: this.a.remove(paramT);
      this.b.add(paramT);
      break label77;
      label179: this.a.remove(paramT);
      this.b.remove(paramT);
      break label77;
      label204: if ((j >= this.c) || (this.a.size() != this.c));
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
