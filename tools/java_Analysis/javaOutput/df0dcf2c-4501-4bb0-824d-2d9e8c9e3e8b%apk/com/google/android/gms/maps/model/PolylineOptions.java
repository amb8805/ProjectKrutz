package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions
  implements SafeParcelable
{
  public static final j a = new j();
  private final int b;
  private final List<LatLng> c;
  private float d = 10.0F;
  private int e = -16777216;
  private float f = 0.0F;
  private boolean g = true;
  private boolean h = false;

  public PolylineOptions()
  {
    this.b = 1;
    this.c = new ArrayList();
  }

  PolylineOptions(int paramInt1, List paramList, float paramFloat1, int paramInt2, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramInt1;
    this.c = paramList;
    this.d = paramFloat1;
    this.e = paramInt2;
    this.f = paramFloat2;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
  }

  public final int a()
  {
    return this.b;
  }

  public final List<LatLng> b()
  {
    return this.c;
  }

  public final float c()
  {
    return this.d;
  }

  public final int d()
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

  public final boolean f()
  {
    return this.g;
  }

  public final boolean g()
  {
    return this.h;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int i = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, this.c, false);
      i.a(paramParcel, 3, this.d);
      i.a(paramParcel, 4, this.e);
      i.a(paramParcel, 5, this.f);
      i.a(paramParcel, 6, this.g);
      i.a(paramParcel, 7, this.h);
      i.a(paramParcel, i);
      return;
    }
    j.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.PolylineOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
