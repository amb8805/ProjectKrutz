import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class dt
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new d();
  public final int a;

  public dt(int paramInt)
  {
    this.a = paramInt;
  }

  public dt(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
  }
}

/* Location:
 * Qualified Name:     dt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
