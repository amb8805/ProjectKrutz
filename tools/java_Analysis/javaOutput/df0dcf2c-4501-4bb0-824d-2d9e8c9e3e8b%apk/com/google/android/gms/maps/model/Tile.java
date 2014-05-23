package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.i;

public final class Tile
  implements SafeParcelable
{
  public static final k a = new k();
  public final int b;
  public final int c;
  public final byte[] d;
  private final int e;

  public Tile()
  {
    this(1, -1, -1, null);
  }

  Tile(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.e = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramArrayOfByte;
  }

  public final int a()
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
      i.a(paramParcel, 1, this.e);
      i.a(paramParcel, 2, this.b);
      i.a(paramParcel, 3, this.c);
      i.a(paramParcel, this.d);
      i.a(paramParcel, i);
      return;
    }
    k.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.Tile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
