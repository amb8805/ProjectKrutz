import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class dh
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bh();
  public final String a;
  public final String b;
  public final long[] c;
  public final long[] d;
  private String e;

  public dh(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.e = paramParcel.readString();
    this.c = paramParcel.createLongArray();
    this.d = paramParcel.createLongArray();
  }

  public dh(String paramString1, String paramString2, String paramString3, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.e = paramString3;
    this.c = paramArrayOfLong1;
    this.d = paramArrayOfLong2;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.e);
    paramParcel.writeLongArray(this.c);
    paramParcel.writeLongArray(this.d);
  }
}

/* Location:
 * Qualified Name:     dh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
