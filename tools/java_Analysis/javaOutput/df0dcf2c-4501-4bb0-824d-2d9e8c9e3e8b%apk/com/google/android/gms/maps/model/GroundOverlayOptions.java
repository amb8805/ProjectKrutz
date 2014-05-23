package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;

public final class GroundOverlayOptions
  implements SafeParcelable
{
  public static final e a = new e();
  private final int b;
  private a c;
  private LatLng d;
  private float e;
  private float f;
  private LatLngBounds g;
  private float h;
  private float i;
  private boolean j = true;
  private float k = 0.0F;
  private float l = 0.5F;
  private float m = 0.5F;

  public GroundOverlayOptions()
  {
    this.b = 1;
  }

  GroundOverlayOptions(int paramInt, IBinder paramIBinder, LatLng paramLatLng, float paramFloat1, float paramFloat2, LatLngBounds paramLatLngBounds, float paramFloat3, float paramFloat4, boolean paramBoolean, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    this.b = paramInt;
    this.c = new a(ad.a(paramIBinder));
    this.d = paramLatLng;
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramLatLngBounds;
    this.h = paramFloat3;
    this.i = paramFloat4;
    this.j = paramBoolean;
    this.k = paramFloat5;
    this.l = paramFloat6;
    this.m = paramFloat7;
  }

  public final IBinder a()
  {
    return this.c.a().asBinder();
  }

  public final int b()
  {
    return this.b;
  }

  public final LatLng c()
  {
    return this.d;
  }

  public final float d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final float e()
  {
    return this.f;
  }

  public final LatLngBounds f()
  {
    return this.g;
  }

  public final float g()
  {
    return this.h;
  }

  public final float h()
  {
    return this.i;
  }

  public final float i()
  {
    return this.k;
  }

  public final float j()
  {
    return this.l;
  }

  public final float k()
  {
    return this.m;
  }

  public final boolean l()
  {
    return this.j;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int n = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, a());
      i.a(paramParcel, 3, this.d, paramInt, false);
      i.a(paramParcel, 4, this.e);
      i.a(paramParcel, 5, this.f);
      i.a(paramParcel, 6, this.g, paramInt, false);
      i.a(paramParcel, 7, this.h);
      i.a(paramParcel, 8, this.i);
      i.a(paramParcel, 9, this.j);
      i.a(paramParcel, 10, this.k);
      i.a(paramParcel, 11, this.l);
      i.a(paramParcel, 12, this.m);
      i.a(paramParcel, n);
      return;
    }
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlayOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
