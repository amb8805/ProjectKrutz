import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ap
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bo();
  public final int a;
  public final String b;
  public final String c;
  public final String d;

  public ap(Parcel paramParcel)
  {
    this.d = paramParcel.readString();
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }

  public ap(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.d = paramString1;
    this.a = paramInt;
    this.b = paramString2;
    this.c = paramString3;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}

/* Location:
 * Qualified Name:     ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
