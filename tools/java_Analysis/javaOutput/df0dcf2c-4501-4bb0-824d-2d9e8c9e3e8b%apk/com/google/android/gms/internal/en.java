package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class en
  implements SafeParcelable
{
  public static final bj a = new bj();
  private final int b;
  private final String c;
  private final ArrayList<ak> d;
  private final ArrayList<ak> e;
  private final boolean f;

  public en(int paramInt, String paramString, ArrayList<ak> paramArrayList1, ArrayList<ak> paramArrayList2, boolean paramBoolean)
  {
    this.b = paramInt;
    this.c = paramString;
    this.d = paramArrayList1;
    this.e = paramArrayList2;
    this.f = paramBoolean;
  }

  public final int a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final ArrayList<ak> c()
  {
    return this.d;
  }

  public final ArrayList<ak> d()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean e()
  {
    return this.f;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bj.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.en
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
