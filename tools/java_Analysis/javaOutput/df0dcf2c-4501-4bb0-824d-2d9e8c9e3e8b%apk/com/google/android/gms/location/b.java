package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class b
  implements Parcelable.Creator<DetectedActivity>
{
  public b()
  {
  }

  static void a(DetectedActivity paramDetectedActivity, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramDetectedActivity.c);
    i.a(paramParcel, 1000, paramDetectedActivity.b);
    i.a(paramParcel, 2, paramDetectedActivity.d);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
