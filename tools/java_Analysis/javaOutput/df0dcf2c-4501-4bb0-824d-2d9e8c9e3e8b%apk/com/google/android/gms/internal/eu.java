package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eu extends ar
  implements SafeParcelable, a
{
  public static final bo a = new bo();
  private static final HashMap<String, ar.a<?, ?>> b;
  private String A;
  private List<eu.i> B;
  private boolean C;
  private final Set<Integer> c;
  private final int d;
  private String e;
  private eu.a f;
  private String g;
  private String h;
  private int i;
  private eu.b j;
  private String k;
  private String l;
  private List<eu.c> m;
  private int n;
  private String o;
  private eu.d p;
  private boolean q;
  private String r;
  private eu.e s;
  private String t;
  private int u;
  private List<eu.g> v;
  private List<eu.h> w;
  private int x;
  private int y;
  private String z;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("aboutMe", ar.a.d("aboutMe", 2));
    b.put("ageRange", ar.a.a("ageRange", 3, eu.a.class));
    b.put("birthday", ar.a.d("birthday", 4));
    b.put("braggingRights", ar.a.d("braggingRights", 5));
    b.put("circledByCount", ar.a.a("circledByCount", 6));
    b.put("cover", ar.a.a("cover", 7, eu.b.class));
    b.put("currentLocation", ar.a.d("currentLocation", 8));
    b.put("displayName", ar.a.d("displayName", 9));
    b.put("emails", ar.a.b("emails", 10, eu.c.class));
    b.put("gender", ar.a.a("gender", 12, new ao().a("male", 0).a("female", 1).a("other", 2)));
    b.put("id", ar.a.d("id", 14));
    b.put("image", ar.a.a("image", 15, eu.d.class));
    b.put("isPlusUser", ar.a.c("isPlusUser", 16));
    b.put("language", ar.a.d("language", 18));
    b.put("name", ar.a.a("name", 19, eu.e.class));
    b.put("nickname", ar.a.d("nickname", 20));
    b.put("objectType", ar.a.a("objectType", 21, new ao().a("person", 0).a("page", 1)));
    b.put("organizations", ar.a.b("organizations", 22, eu.g.class));
    b.put("placesLived", ar.a.b("placesLived", 23, eu.h.class));
    b.put("plusOneCount", ar.a.a("plusOneCount", 24));
    b.put("relationshipStatus", ar.a.a("relationshipStatus", 25, new ao().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8)));
    b.put("tagline", ar.a.d("tagline", 26));
    b.put("url", ar.a.d("url", 27));
    b.put("urls", ar.a.b("urls", 28, eu.i.class));
    b.put("verified", ar.a.c("verified", 29));
  }

  public eu()
  {
    this.d = 2;
    this.c = new HashSet();
  }

  eu(Set<Integer> paramSet, int paramInt1, String paramString1, eu.a parama, String paramString2, String paramString3, int paramInt2, eu.b paramb, String paramString4, String paramString5, List<eu.c> paramList, int paramInt3, String paramString6, eu.d paramd, boolean paramBoolean1, String paramString7, eu.e parame, String paramString8, int paramInt4, List<eu.g> paramList1, List<eu.h> paramList2, int paramInt5, int paramInt6, String paramString9, String paramString10, List<eu.i> paramList3, boolean paramBoolean2)
  {
    this.c = paramSet;
    this.d = paramInt1;
    this.e = paramString1;
    this.f = parama;
    this.g = paramString2;
    this.h = paramString3;
    this.i = paramInt2;
    this.j = paramb;
    this.k = paramString4;
    this.l = paramString5;
    this.m = paramList;
    this.n = paramInt3;
    this.o = paramString6;
    this.p = paramd;
    this.q = paramBoolean1;
    this.r = paramString7;
    this.s = parame;
    this.t = paramString8;
    this.u = paramInt4;
    this.v = paramList1;
    this.w = paramList2;
    this.x = paramInt5;
    this.y = paramInt6;
    this.z = paramString9;
    this.A = paramString10;
    this.B = paramList3;
    this.C = paramBoolean2;
  }

  public final int A()
  {
    return this.y;
  }

  public final String B()
  {
    return this.z;
  }

  public final String C()
  {
    return this.A;
  }

  final List<eu.i> D()
  {
    return this.B;
  }

  public final boolean E()
  {
    return this.C;
  }

  protected final boolean a(ar.a parama)
  {
    return this.c.contains(Integer.valueOf(parama.g()));
  }

  protected final Object b(ar.a parama)
  {
    switch (parama.g())
    {
    case 11:
    case 13:
    case 17:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.g());
    case 2:
      return this.e;
    case 3:
      return this.f;
    case 4:
      return this.g;
    case 5:
      return this.h;
    case 6:
      return Integer.valueOf(this.i);
    case 7:
      return this.j;
    case 8:
      return this.k;
    case 9:
      return this.l;
    case 10:
      return this.m;
    case 12:
      return Integer.valueOf(this.n);
    case 14:
      return this.o;
    case 15:
      return this.p;
    case 16:
      return Boolean.valueOf(this.q);
    case 18:
      return this.r;
    case 19:
      return this.s;
    case 20:
      return this.t;
    case 21:
      return Integer.valueOf(this.u);
    case 22:
      return this.v;
    case 23:
      return this.w;
    case 24:
      return Integer.valueOf(this.x);
    case 25:
      return Integer.valueOf(this.y);
    case 26:
      return this.z;
    case 27:
      return this.A;
    case 28:
      return this.B;
    case 29:
    }
    return Boolean.valueOf(this.C);
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
    if (!(paramObject instanceof eu))
      return false;
    if (this == paramObject)
      return true;
    eu localeu = (eu)paramObject;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      ar.a locala = (ar.a)localIterator.next();
      if (a(locala))
      {
        if (localeu.a(locala))
        {
          if (!b(locala).equals(localeu.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localeu.a(locala))
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

  final eu.a h()
  {
    return this.f;
  }

  public final int hashCode()
  {
    Iterator localIterator = b.values().iterator();
    int i1 = 0;
    ar.a locala;
    if (localIterator.hasNext())
    {
      locala = (ar.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int i2 = i1 + locala.g() + b(locala).hashCode(); ; i2 = i1)
    {
      i1 = i2;
      break;
      return i1;
    }
  }

  public final String i()
  {
    return this.g;
  }

  public final String j()
  {
    return this.h;
  }

  public final int k()
  {
    return this.i;
  }

  final eu.b l()
  {
    return this.j;
  }

  public final String m()
  {
    return this.k;
  }

  public final String n()
  {
    return this.l;
  }

  final List<eu.c> o()
  {
    return this.m;
  }

  public final int p()
  {
    return this.n;
  }

  public final String q()
  {
    return this.o;
  }

  final eu.d r()
  {
    return this.p;
  }

  public final boolean s()
  {
    return this.q;
  }

  public final String t()
  {
    return this.r;
  }

  final eu.e u()
  {
    return this.s;
  }

  public final String v()
  {
    return this.t;
  }

  public final int w()
  {
    return this.u;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bo.a(this, paramParcel, paramInt);
  }

  final List<eu.g> x()
  {
    return this.v;
  }

  final List<eu.h> y()
  {
    return this.w;
  }

  public final int z()
  {
    return this.x;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.eu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
