package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.internal.an;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final a a = new a();
  private final int b;
  private Boolean c;
  private Boolean d;
  private int e = -1;
  private CameraPosition f;
  private Boolean g;
  private Boolean h;
  private Boolean i;
  private Boolean j;
  private Boolean k;
  private Boolean l;

  public GoogleMapOptions()
  {
    this.b = 1;
  }

  GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8)
  {
    this.b = paramInt1;
    this.c = an.a(paramByte1);
    this.d = an.a(paramByte2);
    this.e = paramInt2;
    this.f = paramCameraPosition;
    this.g = an.a(paramByte3);
    this.h = an.a(paramByte4);
    this.i = an.a(paramByte5);
    this.j = an.a(paramByte6);
    this.k = an.a(paramByte7);
    this.l = an.a(paramByte8);
  }

  public static GoogleMapOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null)
      return null;
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, e.a);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(0))
      localGoogleMapOptions.e = localTypedArray.getInt(0, -1);
    if (localTypedArray.hasValue(13))
      localGoogleMapOptions.c = Boolean.valueOf(localTypedArray.getBoolean(13, false));
    if (localTypedArray.hasValue(12))
      localGoogleMapOptions.d = Boolean.valueOf(localTypedArray.getBoolean(12, false));
    if (localTypedArray.hasValue(6))
      localGoogleMapOptions.h = Boolean.valueOf(localTypedArray.getBoolean(6, true));
    if (localTypedArray.hasValue(7))
      localGoogleMapOptions.l = Boolean.valueOf(localTypedArray.getBoolean(7, true));
    if (localTypedArray.hasValue(8))
      localGoogleMapOptions.i = Boolean.valueOf(localTypedArray.getBoolean(8, true));
    if (localTypedArray.hasValue(9))
      localGoogleMapOptions.k = Boolean.valueOf(localTypedArray.getBoolean(9, true));
    if (localTypedArray.hasValue(11))
      localGoogleMapOptions.j = Boolean.valueOf(localTypedArray.getBoolean(11, true));
    if (localTypedArray.hasValue(10))
      localGoogleMapOptions.g = Boolean.valueOf(localTypedArray.getBoolean(10, true));
    localGoogleMapOptions.f = CameraPosition.a(paramContext, paramAttributeSet);
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }

  public final int a()
  {
    return this.b;
  }

  public final byte b()
  {
    return an.a(this.c);
  }

  public final byte c()
  {
    return an.a(this.d);
  }

  public final byte d()
  {
    return an.a(this.g);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final byte e()
  {
    return an.a(this.h);
  }

  public final byte f()
  {
    return an.a(this.i);
  }

  public final byte g()
  {
    return an.a(this.j);
  }

  public final byte h()
  {
    return an.a(this.k);
  }

  public final byte i()
  {
    return an.a(this.l);
  }

  public final int j()
  {
    return this.e;
  }

  public final CameraPosition k()
  {
    return this.f;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int m = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, an.a(this.c));
      i.a(paramParcel, 3, an.a(this.d));
      i.a(paramParcel, 4, this.e);
      i.a(paramParcel, 5, this.f, paramInt, false);
      i.a(paramParcel, 6, an.a(this.g));
      i.a(paramParcel, 7, an.a(this.h));
      i.a(paramParcel, 8, an.a(this.i));
      i.a(paramParcel, 9, an.a(this.j));
      i.a(paramParcel, 10, an.a(this.k));
      i.a(paramParcel, 11, an.a(this.l));
      i.a(paramParcel, m);
      return;
    }
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
