package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class bm extends cc
  implements Player
{
  public bm(l paraml, int paramInt)
  {
    super(paraml, paramInt);
  }

  private Player g()
  {
    return new PlayerEntity(this);
  }

  public final String b()
  {
    return d("external_player_id");
  }

  public final String c()
  {
    return d("profile_name");
  }

  public final Uri d()
  {
    return e("profile_icon_image_uri");
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Uri e()
  {
    return e("profile_hi_res_image_uri");
  }

  public final boolean equals(Object paramObject)
  {
    return PlayerEntity.a(this, paramObject);
  }

  public final long f()
  {
    return a("last_updated");
  }

  public final int hashCode()
  {
    return PlayerEntity.a(this);
  }

  public final String toString()
  {
    return PlayerEntity.b(this);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((PlayerEntity)g()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
