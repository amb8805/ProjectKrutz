import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ac
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dg();
  public final String a;
  public final String b;

  private ac(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.a = paramParcel.readString();
  }

  public ac(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.a = paramString2;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.a);
  }
}

/* Location:
 * Qualified Name:     ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
