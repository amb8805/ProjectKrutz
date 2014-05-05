import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ao
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bp();
  private int a;
  private long b;
  private int c;

  public ao(int paramInt1, int paramInt2, long paramLong)
  {
    this.c = paramInt1;
    this.a = paramInt2;
    this.b = paramLong;
  }

  public ao(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readLong();
    this.c = paramParcel.readInt();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeInt(this.c);
  }
}

/* Location:
 * Qualified Name:     ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
