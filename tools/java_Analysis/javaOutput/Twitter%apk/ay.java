import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ay
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dk();
  public final boolean a;
  public final long b;

  public ay(Parcel paramParcel)
  {
    if (paramParcel.readInt() == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.a = bool;
      this.b = paramParcel.readLong();
      return;
    }
  }

  public ay(boolean paramBoolean, long paramLong)
  {
    this.a = paramBoolean;
    this.b = paramLong;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeLong(this.b);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     ay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
