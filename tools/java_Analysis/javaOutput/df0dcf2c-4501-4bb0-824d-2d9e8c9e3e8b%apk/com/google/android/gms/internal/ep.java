package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ep extends ar
  implements SafeParcelable, a
{
  public static final bk a = new bk();
  private static final HashMap<String, ar.a<?, ?>> b;
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private ep F;
  private String G;
  private String H;
  private String I;
  private String J;
  private ep K;
  private double L;
  private ep M;
  private double N;
  private String O;
  private ep P;
  private List<ep> Q;
  private String R;
  private String S;
  private String T;
  private String U;
  private ep V;
  private String W;
  private String X;
  private String Y;
  private ep Z;
  private String aa;
  private String ab;
  private String ac;
  private String ad;
  private String ae;
  private String af;
  private final Set<Integer> c;
  private final int d;
  private ep e;
  private List<String> f;
  private ep g;
  private String h;
  private String i;
  private String j;
  private List<ep> k;
  private int l;
  private List<ep> m;
  private ep n;
  private List<ep> o;
  private String p;
  private String q;
  private ep r;
  private String s;
  private String t;
  private String u;
  private List<ep> v;
  private String w;
  private String x;
  private String y;
  private String z;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("about", ar.a.a("about", 2, ep.class));
    b.put("additionalName", ar.a.a("additionalName"));
    b.put("address", ar.a.a("address", 4, ep.class));
    b.put("addressCountry", ar.a.d("addressCountry", 5));
    b.put("addressLocality", ar.a.d("addressLocality", 6));
    b.put("addressRegion", ar.a.d("addressRegion", 7));
    b.put("associated_media", ar.a.b("associated_media", 8, ep.class));
    b.put("attendeeCount", ar.a.a("attendeeCount", 9));
    b.put("attendees", ar.a.b("attendees", 10, ep.class));
    b.put("audio", ar.a.a("audio", 11, ep.class));
    b.put("author", ar.a.b("author", 12, ep.class));
    b.put("bestRating", ar.a.d("bestRating", 13));
    b.put("birthDate", ar.a.d("birthDate", 14));
    b.put("byArtist", ar.a.a("byArtist", 15, ep.class));
    b.put("caption", ar.a.d("caption", 16));
    b.put("contentSize", ar.a.d("contentSize", 17));
    b.put("contentUrl", ar.a.d("contentUrl", 18));
    b.put("contributor", ar.a.b("contributor", 19, ep.class));
    b.put("dateCreated", ar.a.d("dateCreated", 20));
    b.put("dateModified", ar.a.d("dateModified", 21));
    b.put("datePublished", ar.a.d("datePublished", 22));
    b.put("description", ar.a.d("description", 23));
    b.put("duration", ar.a.d("duration", 24));
    b.put("embedUrl", ar.a.d("embedUrl", 25));
    b.put("endDate", ar.a.d("endDate", 26));
    b.put("familyName", ar.a.d("familyName", 27));
    b.put("gender", ar.a.d("gender", 28));
    b.put("geo", ar.a.a("geo", 29, ep.class));
    b.put("givenName", ar.a.d("givenName", 30));
    b.put("height", ar.a.d("height", 31));
    b.put("id", ar.a.d("id", 32));
    b.put("image", ar.a.d("image", 33));
    b.put("inAlbum", ar.a.a("inAlbum", 34, ep.class));
    b.put("latitude", ar.a.b("latitude", 36));
    b.put("location", ar.a.a("location", 37, ep.class));
    b.put("longitude", ar.a.b("longitude", 38));
    b.put("name", ar.a.d("name", 39));
    b.put("partOfTVSeries", ar.a.a("partOfTVSeries", 40, ep.class));
    b.put("performers", ar.a.b("performers", 41, ep.class));
    b.put("playerType", ar.a.d("playerType", 42));
    b.put("postOfficeBoxNumber", ar.a.d("postOfficeBoxNumber", 43));
    b.put("postalCode", ar.a.d("postalCode", 44));
    b.put("ratingValue", ar.a.d("ratingValue", 45));
    b.put("reviewRating", ar.a.a("reviewRating", 46, ep.class));
    b.put("startDate", ar.a.d("startDate", 47));
    b.put("streetAddress", ar.a.d("streetAddress", 48));
    b.put("text", ar.a.d("text", 49));
    b.put("thumbnail", ar.a.a("thumbnail", 50, ep.class));
    b.put("thumbnailUrl", ar.a.d("thumbnailUrl", 51));
    b.put("tickerSymbol", ar.a.d("tickerSymbol", 52));
    b.put("type", ar.a.d("type", 53));
    b.put("url", ar.a.d("url", 54));
    b.put("width", ar.a.d("width", 55));
    b.put("worstRating", ar.a.d("worstRating", 56));
  }

  public ep()
  {
    this.d = 1;
    this.c = new HashSet();
  }

  ep(Set<Integer> paramSet, int paramInt1, ep paramep1, List<String> paramList, ep paramep2, String paramString1, String paramString2, String paramString3, List<ep> paramList1, int paramInt2, List<ep> paramList2, ep paramep3, List<ep> paramList3, String paramString4, String paramString5, ep paramep4, String paramString6, String paramString7, String paramString8, List<ep> paramList4, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, ep paramep5, String paramString18, String paramString19, String paramString20, String paramString21, ep paramep6, double paramDouble1, ep paramep7, double paramDouble2, String paramString22, ep paramep8, List<ep> paramList5, String paramString23, String paramString24, String paramString25, String paramString26, ep paramep9, String paramString27, String paramString28, String paramString29, ep paramep10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.c = paramSet;
    this.d = paramInt1;
    this.e = paramep1;
    this.f = paramList;
    this.g = paramep2;
    this.h = paramString1;
    this.i = paramString2;
    this.j = paramString3;
    this.k = paramList1;
    this.l = paramInt2;
    this.m = paramList2;
    this.n = paramep3;
    this.o = paramList3;
    this.p = paramString4;
    this.q = paramString5;
    this.r = paramep4;
    this.s = paramString6;
    this.t = paramString7;
    this.u = paramString8;
    this.v = paramList4;
    this.w = paramString9;
    this.x = paramString10;
    this.y = paramString11;
    this.z = paramString12;
    this.A = paramString13;
    this.B = paramString14;
    this.C = paramString15;
    this.D = paramString16;
    this.E = paramString17;
    this.F = paramep5;
    this.G = paramString18;
    this.H = paramString19;
    this.I = paramString20;
    this.J = paramString21;
    this.K = paramep6;
    this.L = paramDouble1;
    this.M = paramep7;
    this.N = paramDouble2;
    this.O = paramString22;
    this.P = paramep8;
    this.Q = paramList5;
    this.R = paramString23;
    this.S = paramString24;
    this.T = paramString25;
    this.U = paramString26;
    this.V = paramep9;
    this.W = paramString27;
    this.X = paramString28;
    this.Y = paramString29;
    this.Z = paramep10;
    this.aa = paramString30;
    this.ab = paramString31;
    this.ac = paramString32;
    this.ad = paramString33;
    this.ae = paramString34;
    this.af = paramString35;
  }

  public final String A()
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

  public final String D()
  {
    return this.B;
  }

  public final String E()
  {
    return this.C;
  }

  public final String F()
  {
    return this.D;
  }

  public final String G()
  {
    return this.E;
  }

  final ep H()
  {
    return this.F;
  }

  public final String I()
  {
    return this.G;
  }

  public final String J()
  {
    return this.H;
  }

  public final String K()
  {
    return this.I;
  }

  public final String L()
  {
    return this.J;
  }

  final ep M()
  {
    return this.K;
  }

  public final double N()
  {
    return this.L;
  }

  final ep O()
  {
    return this.M;
  }

  public final double P()
  {
    return this.N;
  }

  public final String Q()
  {
    return this.O;
  }

  final ep R()
  {
    return this.P;
  }

  final List<ep> S()
  {
    return this.Q;
  }

  public final String T()
  {
    return this.R;
  }

  public final String U()
  {
    return this.S;
  }

  public final String V()
  {
    return this.T;
  }

  public final String W()
  {
    return this.U;
  }

  final ep X()
  {
    return this.V;
  }

  public final String Y()
  {
    return this.W;
  }

  public final String Z()
  {
    return this.X;
  }

  protected final boolean a(ar.a parama)
  {
    return this.c.contains(Integer.valueOf(parama.g()));
  }

  public final String aa()
  {
    return this.Y;
  }

  final ep ab()
  {
    return this.Z;
  }

  public final String ac()
  {
    return this.aa;
  }

  public final String ad()
  {
    return this.ab;
  }

  public final String ae()
  {
    return this.ac;
  }

  public final String af()
  {
    return this.ad;
  }

  public final String ag()
  {
    return this.ae;
  }

  public final String ah()
  {
    return this.af;
  }

  protected final Object b(ar.a parama)
  {
    switch (parama.g())
    {
    case 35:
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
      return this.i;
    case 7:
      return this.j;
    case 8:
      return this.k;
    case 9:
      return Integer.valueOf(this.l);
    case 10:
      return this.m;
    case 11:
      return this.n;
    case 12:
      return this.o;
    case 13:
      return this.p;
    case 14:
      return this.q;
    case 15:
      return this.r;
    case 16:
      return this.s;
    case 17:
      return this.t;
    case 18:
      return this.u;
    case 19:
      return this.v;
    case 20:
      return this.w;
    case 21:
      return this.x;
    case 22:
      return this.y;
    case 23:
      return this.z;
    case 24:
      return this.A;
    case 25:
      return this.B;
    case 26:
      return this.C;
    case 27:
      return this.D;
    case 28:
      return this.E;
    case 29:
      return this.F;
    case 30:
      return this.G;
    case 31:
      return this.H;
    case 32:
      return this.I;
    case 33:
      return this.J;
    case 34:
      return this.K;
    case 36:
      return Double.valueOf(this.L);
    case 37:
      return this.M;
    case 38:
      return Double.valueOf(this.N);
    case 39:
      return this.O;
    case 40:
      return this.P;
    case 41:
      return this.Q;
    case 42:
      return this.R;
    case 43:
      return this.S;
    case 44:
      return this.T;
    case 45:
      return this.U;
    case 46:
      return this.V;
    case 47:
      return this.W;
    case 48:
      return this.X;
    case 49:
      return this.Y;
    case 50:
      return this.Z;
    case 51:
      return this.aa;
    case 52:
      return this.ab;
    case 53:
      return this.ac;
    case 54:
      return this.ad;
    case 55:
      return this.ae;
    case 56:
    }
    return this.af;
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
    if (!(paramObject instanceof ep))
      return false;
    if (this == paramObject)
      return true;
    ep localep = (ep)paramObject;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      ar.a locala = (ar.a)localIterator.next();
      if (a(locala))
      {
        if (localep.a(locala))
        {
          if (!b(locala).equals(localep.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localep.a(locala))
        return false;
    }
    return true;
  }

  final int f()
  {
    return this.d;
  }

  final ep g()
  {
    return this.e;
  }

  public final List<String> h()
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

  final ep i()
  {
    return this.g;
  }

  public final String j()
  {
    return this.h;
  }

  public final String k()
  {
    return this.i;
  }

  public final String l()
  {
    return this.j;
  }

  final List<ep> m()
  {
    return this.k;
  }

  public final int n()
  {
    return this.l;
  }

  final List<ep> o()
  {
    return this.m;
  }

  final ep p()
  {
    return this.n;
  }

  final List<ep> q()
  {
    return this.o;
  }

  public final String r()
  {
    return this.p;
  }

  public final String s()
  {
    return this.q;
  }

  final ep t()
  {
    return this.r;
  }

  public final String u()
  {
    return this.s;
  }

  public final String v()
  {
    return this.t;
  }

  public final String w()
  {
    return this.u;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bk.a(this, paramParcel, paramInt);
  }

  final List<ep> x()
  {
    return this.v;
  }

  public final String y()
  {
    return this.w;
  }

  public final String z()
  {
    return this.x;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
