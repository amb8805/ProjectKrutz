package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;

public final class MarkerOptions
  implements SafeParcelable
{
  public static final h a = new h();
  private final int b;
  private LatLng c;
  private String d;
  private String e;
  private a f;
  private float g = 0.5F;
  private float h = 1.0F;
  private boolean i;
  private boolean j = true;

  public MarkerOptions()
  {
    this.b = 1;
  }

  MarkerOptions(int paramInt, LatLng paramLatLng, String paramString1, String paramString2, IBinder paramIBinder, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramInt;
    this.c = paramLatLng;
    this.d = paramString1;
    this.e = paramString2;
    if (paramIBinder == null);
    for (a locala = null; ; locala = new a(ad.a(paramIBinder)))
    {
      this.f = locala;
      this.g = paramFloat1;
      this.h = paramFloat2;
      this.i = paramBoolean1;
      this.j = paramBoolean2;
      return;
    }
  }

  public final int a()
  {
    return this.b;
  }

  public final IBinder b()
  {
    if (this.f == null)
      return null;
    return this.f.a().asBinder();
  }

  public final LatLng c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.e;
  }

  public final float f()
  {
    return this.g;
  }

  public final float g()
  {
    return this.h;
  }

  public final boolean h()
  {
    return this.i;
  }

  public final boolean i()
  {
    return this.j;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int k = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, this.c, paramInt, false);
      i.a(paramParcel, 3, this.d, false);
      i.a(paramParcel, 4, this.e, false);
      i.a(paramParcel, 5, b());
      i.a(paramParcel, 6, this.g);
      i.a(paramParcel, 7, this.h);
      i.a(paramParcel, 8, this.i);
      i.a(paramParcel, 9, this.j);
      i.a(paramParcel, k);
      return;
    }
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.MarkerOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
