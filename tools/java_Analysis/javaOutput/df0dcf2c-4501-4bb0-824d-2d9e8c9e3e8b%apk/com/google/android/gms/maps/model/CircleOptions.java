package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;

public final class CircleOptions
  implements SafeParcelable
{
  public static final d a = new d();
  private final int b;
  private LatLng c = null;
  private double d = 0.0D;
  private float e = 10.0F;
  private int f = -16777216;
  private int g = 0;
  private float h = 0.0F;
  private boolean i = true;

  public CircleOptions()
  {
    this.b = 1;
  }

  CircleOptions(int paramInt1, LatLng paramLatLng, double paramDouble, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean)
  {
    this.b = paramInt1;
    this.c = paramLatLng;
    this.d = paramDouble;
    this.e = paramFloat1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramFloat2;
    this.i = paramBoolean;
  }

  public final int a()
  {
    return this.b;
  }

  public final LatLng b()
  {
    return this.c;
  }

  public final double c()
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

  public final int e()
  {
    return this.f;
  }

  public final int f()
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

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int j = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, this.c, paramInt, false);
      i.a(paramParcel, 3, this.d);
      i.a(paramParcel, 4, this.e);
      i.a(paramParcel, 5, this.f);
      i.a(paramParcel, 6, this.g);
      i.a(paramParcel, 7, this.h);
      i.a(paramParcel, 8, this.i);
      i.a(paramParcel, j);
      return;
    }
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.CircleOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */