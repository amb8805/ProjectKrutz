package com.spotify.mobile.android.util.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.widget.AdapterView;

public final class ScrollPosition
  implements Parcelable
{
  public static final Parcelable.Creator<ScrollPosition> CREATOR = new ScrollPosition.1();
  public final int a;
  public final int b;

  public ScrollPosition(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public ScrollPosition(AdapterView<?> paramAdapterView)
  {
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ui.ScrollPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
