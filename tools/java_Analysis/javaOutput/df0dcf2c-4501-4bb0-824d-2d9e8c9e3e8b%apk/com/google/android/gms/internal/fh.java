package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

public class fh
  implements SafeParcelable
{
  public static final ca a = new ca();
  private final int b;
  private final String c;
  private final List<ak> d;
  private final List<Uri> e;
  private final Uri f;
  private final String g;
  private final String h;
  private final String i;
  private final Bundle j;
  private final Bundle k;

  public fh(int paramInt, String paramString1, List<ak> paramList, List<Uri> paramList1, Uri paramUri, String paramString2, String paramString3, String paramString4, Bundle paramBundle1, Bundle paramBundle2)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramList;
    this.e = paramList1;
    this.f = paramUri;
    this.g = paramString2;
    this.h = paramString3;
    this.i = paramString4;
    this.j = paramBundle1;
    this.k = paramBundle2;
  }

  public final List<ak> a()
  {
    return this.d;
  }

  public final List<Uri> b()
  {
    return this.e;
  }

  public final Uri c()
  {
    return this.f;
  }

  public final String d()
  {
    return this.g;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.h;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fh));
    fh localfh;
    do
    {
      return false;
      localfh = (fh)paramObject;
    }
    while ((this.b != localfh.b) || (!d.a(this.d, localfh.d)) || (!d.a(this.e, localfh.e)) || (!d.a(this.f, localfh.f)) || (!d.a(this.g, localfh.g)) || (!d.a(this.h, localfh.h)) || (!d.a(this.i, localfh.i)));
    return true;
  }

  public final String f()
  {
    return this.i;
  }

  public final String g()
  {
    return this.c;
  }

  public final Bundle h()
  {
    return this.j;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = this.d;
    arrayOfObject[2] = this.e;
    arrayOfObject[3] = this.f;
    arrayOfObject[4] = this.g;
    arrayOfObject[5] = this.h;
    arrayOfObject[6] = this.i;
    return Arrays.hashCode(arrayOfObject);
  }

  public final Bundle i()
  {
    return this.k;
  }

  public final int j()
  {
    return this.b;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ca.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
