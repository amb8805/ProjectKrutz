package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class LocationRequest
  implements SafeParcelable
{
  public static final c i = new c();
  int a;
  int b = 102;
  long c = 3600000L;
  long d = ()(this.c / 6.0D);
  boolean e = false;
  long f = 9223372036854775807L;
  int g = 2147483647;
  float h = 0.0F;

  public LocationRequest()
  {
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest))
        return false;
      localLocationRequest = (LocationRequest)paramObject;
    }
    while ((this.b == localLocationRequest.b) && (this.c == localLocationRequest.c) && (this.d == localLocationRequest.d) && (this.e == localLocationRequest.e) && (this.f == localLocationRequest.f) && (this.g == localLocationRequest.g) && (this.h == localLocationRequest.h));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Long.valueOf(this.c);
    arrayOfObject[2] = Long.valueOf(this.d);
    arrayOfObject[3] = Boolean.valueOf(this.e);
    arrayOfObject[4] = Long.valueOf(this.f);
    arrayOfObject[5] = Integer.valueOf(this.g);
    arrayOfObject[6] = Float.valueOf(this.h);
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Request[");
    String str;
    switch (this.b)
    {
    case 101:
    case 103:
    default:
      str = "???";
    case 100:
    case 102:
    case 104:
    case 105:
    }
    while (true)
    {
      localStringBuilder2.append(str);
      if (this.b != 105)
      {
        localStringBuilder1.append(" requested=");
        localStringBuilder1.append(this.c + "ms");
      }
      localStringBuilder1.append(" fastest=");
      localStringBuilder1.append(this.d + "ms");
      if (this.f != 9223372036854775807L)
      {
        long l = this.f - SystemClock.elapsedRealtime();
        localStringBuilder1.append(" expireIn=");
        localStringBuilder1.append(l + "ms");
      }
      if (this.g != 2147483647)
        localStringBuilder1.append(" num=").append(this.g);
      localStringBuilder1.append((char)']');
      return localStringBuilder1.toString();
      str = "PRIORITY_HIGH_ACCURACY";
      continue;
      str = "PRIORITY_BALANCED_POWER_ACCURACY";
      continue;
      str = "PRIORITY_LOW_POWER";
      continue;
      str = "PRIORITY_NO_POWER";
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
