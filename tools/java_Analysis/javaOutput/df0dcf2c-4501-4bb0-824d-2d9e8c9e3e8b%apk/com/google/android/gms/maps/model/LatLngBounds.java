package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.i;
import java.util.Arrays;

public final class LatLngBounds
  implements SafeParcelable
{
  public static final f a = new f();
  public final LatLng b;
  public final LatLng c;
  private final int d;

  LatLngBounds(int paramInt, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    com.google.android.gms.internal.f.a(paramLatLng1, "null southwest");
    com.google.android.gms.internal.f.a(paramLatLng2, "null northeast");
    if (paramLatLng2.b >= paramLatLng1.b);
    for (int i = 1; ; i = 0)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Double.valueOf(paramLatLng1.b);
      arrayOfObject[1] = Double.valueOf(paramLatLng2.b);
      if (i != 0)
        break;
      throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", arrayOfObject));
    }
    this.d = paramInt;
    this.b = paramLatLng1;
    this.c = paramLatLng2;
  }

  public final int a()
  {
    return this.d;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LatLngBounds localLatLngBounds;
    do
    {
      return true;
      if (!(paramObject instanceof LatLngBounds))
        return false;
      localLatLngBounds = (LatLngBounds)paramObject;
    }
    while ((this.b.equals(localLatLngBounds.b)) && (this.c.equals(localLatLngBounds.c)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return d.a(this).a("southwest", this.b).a("northeast", this.c).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int i = i.a(paramParcel);
      i.a(paramParcel, 1, this.d);
      i.a(paramParcel, 2, this.b, paramInt, false);
      i.a(paramParcel, 3, this.c, paramInt, false);
      i.a(paramParcel, i);
      return;
    }
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
