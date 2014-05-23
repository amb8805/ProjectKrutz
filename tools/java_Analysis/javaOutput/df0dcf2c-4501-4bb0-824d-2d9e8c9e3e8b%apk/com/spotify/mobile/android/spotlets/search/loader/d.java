package com.spotify.mobile.android.spotlets.search.loader;

import android.net.Uri.Builder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.i;
import com.spotify.cosmos.android.util.RequestBuilder;
import com.spotify.cosmos.router.Request;

final class d
{
  public final String a;
  public final SearchLoader.SearchType b;
  private final int c;
  private final int d;
  private final int e;
  private final boolean f;
  private final boolean g;
  private Request h;
  private Integer i;
  private Long j;
  private boolean k;

  d(String paramString, SearchLoader.SearchType paramSearchType, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramSearchType;
    this.c = paramInt1;
    if (TextUtils.isEmpty(paramString))
      paramString = null;
    this.a = paramString;
    this.d = paramInt2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.e = paramInt3;
  }

  final Request a(com.spotify.mobile.android.spotlets.common.b.a.d paramd)
  {
    if (this.h != null)
      return this.h;
    if (this.b == null);
    for (String str = this.a; ; str = new Uri.Builder().scheme("hm").authority("searchview").path("/android/v1").appendPath(this.b.mString).appendPath(this.a).appendQueryParameter("username", paramd.a()).appendQueryParameter("country", paramd.c()).appendQueryParameter("catalogue", paramd.b()).appendQueryParameter("limit", String.valueOf(this.d)).appendQueryParameter("search-image-size", String.valueOf(this.c)).appendQueryParameter("radio", String.valueOf(this.g)).appendQueryParameter("mft", String.valueOf(this.f)).toString())
    {
      Request localRequest = RequestBuilder.get(str).with("country", paramd.c()).with("catalogue", paramd.b()).with("username", paramd.a()).build();
      this.h = localRequest;
      return localRequest;
    }
  }

  final boolean a()
  {
    if (this.j == null)
    {
      this.j = Long.valueOf(SystemClock.uptimeMillis());
      return true;
    }
    return false;
  }

  final boolean b()
  {
    return this.j != null;
  }

  final boolean c()
  {
    if (!this.k)
    {
      this.k = true;
      return true;
    }
    return false;
  }

  final boolean d()
  {
    return this.k;
  }

  final long e()
  {
    boolean bool = b();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    i.b(bool, "Request %s not started", arrayOfObject);
    return SystemClock.uptimeMillis() - this.j.longValue();
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof d)) && (hashCode() == paramObject.hashCode()));
  }

  final int f()
  {
    return this.e;
  }

  public final int hashCode()
  {
    if (this.i == null)
      if (this.a != null)
        break label32;
    label32: for (int m = 0; ; m = (this.a + this.b + this.c + this.d + this.f + this.g).hashCode())
    {
      this.i = Integer.valueOf(m);
      return this.i.intValue();
    }
  }

  public final String toString()
  {
    Integer.valueOf(hashCode());
    return null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.loader.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
