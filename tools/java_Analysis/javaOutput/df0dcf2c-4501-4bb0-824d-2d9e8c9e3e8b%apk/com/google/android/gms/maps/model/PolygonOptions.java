package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
  implements SafeParcelable
{
  public static final i a = new i();
  private final int b;
  private final List<LatLng> c;
  private final List<List<LatLng>> d;
  private float e = 10.0F;
  private int f = -16777216;
  private int g = 0;
  private float h = 0.0F;
  private boolean i = true;
  private boolean j = false;

  public PolygonOptions()
  {
    this.b = 1;
    this.c = new ArrayList();
    this.d = new ArrayList();
  }

  PolygonOptions(int paramInt1, List<LatLng> paramList, List paramList1, float paramFloat1, int paramInt2, int paramInt3, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramInt1;
    this.c = paramList;
    this.d = paramList1;
    this.e = paramFloat1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramFloat2;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
  }

  public final int a()
  {
    return this.b;
  }

  public final List b()
  {
    return this.d;
  }

  public final List<LatLng> c()
  {
    return this.c;
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

  public final boolean i()
  {
    return this.j;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int k = com.google.android.gms.internal.i.a(paramParcel);
      com.google.android.gms.internal.i.a(paramParcel, 1, this.b);
      com.google.android.gms.internal.i.a(paramParcel, 2, this.c, false);
      com.google.android.gms.internal.i.b(paramParcel, this.d);
      com.google.android.gms.internal.i.a(paramParcel, 4, this.e);
      com.google.android.gms.internal.i.a(paramParcel, 5, this.f);
      com.google.android.gms.internal.i.a(paramParcel, 6, this.g);
      com.google.android.gms.internal.i.a(paramParcel, 7, this.h);
      com.google.android.gms.internal.i.a(paramParcel, 8, this.i);
      com.google.android.gms.internal.i.a(paramParcel, 9, this.j);
      com.google.android.gms.internal.i.a(paramParcel, k);
      return;
    }
    i.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.PolygonOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
