package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class l
  implements Parcelable.Creator<TileOverlayOptions>
{
  public l()
  {
  }

  static void a(TileOverlayOptions paramTileOverlayOptions, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramTileOverlayOptions.a());
    i.a(paramParcel, 2, paramTileOverlayOptions.b());
    i.a(paramParcel, 3, paramTileOverlayOptions.d());
    i.a(paramParcel, 4, paramTileOverlayOptions.c());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
