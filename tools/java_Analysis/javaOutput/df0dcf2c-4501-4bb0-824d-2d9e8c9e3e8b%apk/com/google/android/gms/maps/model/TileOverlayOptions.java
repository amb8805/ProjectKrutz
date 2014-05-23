package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.aq;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.i;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final l a = new l();
  private final int b;
  private aq c;
  private m d;
  private boolean e = true;
  private float f;

  public TileOverlayOptions()
  {
    this.b = 1;
  }

  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean, float paramFloat)
  {
    this.b = paramInt;
    this.c = as.a(paramIBinder);
    if (this.c == null);
    for (TileOverlayOptions.1 local1 = null; ; local1 = new TileOverlayOptions.1(this))
    {
      this.d = local1;
      this.e = paramBoolean;
      this.f = paramFloat;
      return;
    }
  }

  public final int a()
  {
    return this.b;
  }

  public final IBinder b()
  {
    return this.c.asBinder();
  }

  public final float c()
  {
    return this.f;
  }

  public final boolean d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (ap.a())
    {
      int i = i.a(paramParcel);
      i.a(paramParcel, 1, this.b);
      i.a(paramParcel, 2, b());
      i.a(paramParcel, 3, this.e);
      i.a(paramParcel, 4, this.f);
      i.a(paramParcel, i);
      return;
    }
    l.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
