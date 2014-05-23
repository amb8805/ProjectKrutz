package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class er extends ar
  implements SafeParcelable, b
{
  public static final bn a = new bn();
  private static final HashMap<String, ar.a<?, ?>> b;
  private final Set<Integer> c;
  private final int d;
  private String e;
  private ep f;
  private String g;
  private ep h;
  private String i;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("id", ar.a.d("id", 2));
    b.put("result", ar.a.a("result", 4, ep.class));
    b.put("startDate", ar.a.d("startDate", 5));
    b.put("target", ar.a.a("target", 6, ep.class));
    b.put("type", ar.a.d("type", 7));
  }

  public er()
  {
    this.d = 1;
    this.c = new HashSet();
  }

  er(Set<Integer> paramSet, int paramInt, String paramString1, ep paramep1, String paramString2, ep paramep2, String paramString3)
  {
    this.c = paramSet;
    this.d = paramInt;
    this.e = paramString1;
    this.f = paramep1;
    this.g = paramString2;
    this.h = paramep2;
    this.i = paramString3;
  }

  protected final boolean a(ar.a parama)
  {
    return this.c.contains(Integer.valueOf(parama.g()));
  }

  protected final Object b(ar.a parama)
  {
    switch (parama.g())
    {
    case 3:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2:
      return this.e;
    case 4:
      return this.f;
    case 5:
      return this.g;
    case 6:
      return this.h;
    case 7:
    }
    return this.i;
  }

  public final HashMap<String, ar.a<?, ?>> b()
  {
    return b;
  }

  protected final Object c()
  {
    return null;
  }

  protected final boolean d()
  {
    return false;
  }

  public final int describeContents()
  {
    return 0;
  }

  final Set<Integer> e()
  {
    return this.c;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof er))
      return false;
    if (this == paramObject)
      return true;
    er localer = (er)paramObject;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      ar.a locala = (ar.a)localIterator.next();
      if (a(locala))
      {
        if (localer.a(locala))
        {
          if (!b(locala).equals(localer.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localer.a(locala))
        return false;
    }
    return true;
  }

  final int f()
  {
    return this.d;
  }

  public final String g()
  {
    return this.e;
  }

  final ep h()
  {
    return this.f;
  }

  public final int hashCode()
  {
    Iterator localIterator = b.values().iterator();
    int j = 0;
    ar.a locala;
    if (localIterator.hasNext())
    {
      locala = (ar.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int k = j + locala.g() + b(locala).hashCode(); ; k = j)
    {
      j = k;
      break;
      return j;
    }
  }

  public final String i()
  {
    return this.g;
  }

  final ep j()
  {
    return this.h;
  }

  public final String k()
  {
    return this.i;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bn.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.er
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
