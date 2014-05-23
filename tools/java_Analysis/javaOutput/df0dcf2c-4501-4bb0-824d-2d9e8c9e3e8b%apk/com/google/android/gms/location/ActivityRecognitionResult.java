package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult
  implements SafeParcelable
{
  public static final a a = new a();
  int b = 1;
  List<DetectedActivity> c;
  long d;
  long e;

  public ActivityRecognitionResult()
  {
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "ActivityRecognitionResult [probableActivities=" + this.c + ", timeMillis=" + this.d + ", elapsedRealtimeMillis=" + this.e + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
