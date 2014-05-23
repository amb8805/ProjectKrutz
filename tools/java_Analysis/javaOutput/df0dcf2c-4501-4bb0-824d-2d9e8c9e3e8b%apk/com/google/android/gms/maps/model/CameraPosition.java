package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.i;
import java.util.Arrays;

public final class CameraPosition
  implements SafeParcelable
{
  public static final c a = new c();
  public final LatLng b;
  public final float c;
  public final float d;
  public final float e;
  private final int f;

  CameraPosition(int paramInt, LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    f.a(paramLatLng, "null camera target");
    if ((0.0F <= paramFloat2) && (paramFloat2 <= 90.0F));
    for (int i = 1; i == 0; i = 0)
      throw new IllegalArgumentException(String.valueOf("Tilt needs to be between 0 and 90 inclusive"));
    this.f = paramInt;
    this.b = paramLatLng;
    this.c = paramFloat1;
    this.d = (paramFloat2 + 0.0F);
    if (paramFloat3 <= 0.0D)
      paramFloat3 = 360.0F + paramFloat3 % 360.0F;
    this.e = (paramFloat3 % 360.0F);
  }

  public CameraPosition(LatLng paramLatLng, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramLatLng, paramFloat1, paramFloat2, paramFloat3);
  }

  public static CameraPosition a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null)
      return null;
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, com.google.android.gms.e.a);
    if (localTypedArray.hasValue(2));
    for (float f1 = localTypedArray.getFloat(2, 0.0F); ; f1 = 0.0F)
    {
      if (localTypedArray.hasValue(3));
      for (float f2 = localTypedArray.getFloat(3, 0.0F); ; f2 = 0.0F)
      {
        LatLng localLatLng = new LatLng(f1, f2);
        b localb = new b();
        localb.a(localLatLng);
        if (localTypedArray.hasValue(5))
          localb.a(localTypedArray.getFloat(5, 0.0F));
        if (localTypedArray.hasValue(1))
          localb.c(localTypedArray.getFloat(1, 0.0F));
        if (localTypedArray.hasValue(4))
          localb.b(localTypedArray.getFloat(4, 0.0F));
        return localb.a();
      }
    }
  }

  public final int a()
  {
    return this.f;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    CameraPosition localCameraPosition;
    do
    {
      return true;
      if (!(paramObject instanceof CameraPosition))
        return false;
      localCameraPosition = (CameraPosition)paramObject;
    }
    while ((this.b.equals(localCameraPosition.b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(localCameraPosition.c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(localCameraPosition.d)) && (Float.floatToIntBits(this.e) == Float.floatToIntBits(localCameraPosition.e)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = Float.valueOf(this.c);
    arrayOfObject[2] = Float.valueOf(this.d);
    arrayOfObject[3] = Float.valueOf(this.e);
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    return d.a(this).a("target", this.b).a("zoom", Float.valueOf(this.c)).a("tilt", Float.valueOf(this.d)).a("bearing", Float.valueOf(this.e)).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int i = i.a(paramParcel);
      i.a(paramParcel, 1, this.f);
      i.a(paramParcel, 2, this.b, paramInt, false);
      i.a(paramParcel, 3, this.c);
      i.a(paramParcel, 4, this.d);
      i.a(paramParcel, 5, this.e);
      i.a(paramParcel, i);
      return;
    }
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
