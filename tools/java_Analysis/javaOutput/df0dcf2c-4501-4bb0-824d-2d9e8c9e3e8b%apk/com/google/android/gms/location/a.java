package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class a
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  public a()
  {
  }

  static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramActivityRecognitionResult.c, false);
    i.a(paramParcel, 1000, paramActivityRecognitionResult.b);
    i.a(paramParcel, 2, paramActivityRecognitionResult.d);
    i.a(paramParcel, 3, paramActivityRecognitionResult.e);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
