package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.i;
import java.util.Arrays;

public final class VisibleRegion
  implements SafeParcelable
{
  public static final n a = new n();
  public final LatLng b;
  public final LatLng c;
  public final LatLng d;
  public final LatLng e;
  public final LatLngBounds f;
  private final int g;

  VisibleRegion(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2, LatLng paramLatLng3, LatLng paramLatLng4, LatLngBounds paramLatLngBounds)
  {
    this.g = paramInt;
    this.b = paramLatLng1;
    this.c = paramLatLng2;
    this.d = paramLatLng3;
    this.e = paramLatLng4;
    this.f = paramLatLngBounds;
  }

  public final int a()
  {
    return this.g;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    VisibleRegion localVisibleRegion;
    do
    {
      return true;
      if (!(paramObject instanceof VisibleRegion))
        return false;
      localVisibleRegion = (VisibleRegion)paramObject;
    }
    while ((this.b.equals(localVisibleRegion.b)) && (this.c.equals(localVisibleRegion.c)) && (this.d.equals(localVisibleRegion.d)) && (this.e.equals(localVisibleRegion.e)) && (this.f.equals(localVisibleRegion.f)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return d.a(this).a("nearLeft", this.b).a("nearRight", this.c).a("farLeft", this.d).a("farRight", this.e).a("latLngBounds", this.f).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int i = i.a(paramParcel);
      i.a(paramParcel, 1, this.g);
      i.a(paramParcel, 2, this.b, paramInt, false);
      i.a(paramParcel, 3, this.c, paramInt, false);
      i.a(paramParcel, 4, this.d, paramInt, false);
      i.a(paramParcel, 5, this.e, paramInt, false);
      i.a(paramParcel, 6, this.f, paramInt, false);
      i.a(paramParcel, i);
      return;
    }
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.VisibleRegion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
