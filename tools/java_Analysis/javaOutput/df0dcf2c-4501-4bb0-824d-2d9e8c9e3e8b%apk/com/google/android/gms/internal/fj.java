package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class fj
  implements SafeParcelable
{
  public static final cb a = new cb();
  private final int b;
  private final boolean c;
  private final ArrayList<ak> d;
  private final ArrayList<ak> e;
  private final Bundle f;
  private final boolean g;

  public fj(int paramInt, boolean paramBoolean1, ArrayList<ak> paramArrayList1, ArrayList<ak> paramArrayList2, Bundle paramBundle, boolean paramBoolean2)
  {
    this.b = paramInt;
    this.c = paramBoolean1;
    this.d = paramArrayList1;
    this.e = paramArrayList2;
    this.f = paramBundle;
    this.g = paramBoolean2;
  }

  public final boolean a()
  {
    return this.c;
  }

  public final ArrayList<ak> b()
  {
    return this.d;
  }

  public final ArrayList<ak> c()
  {
    return this.e;
  }

  public final Bundle d()
  {
    return this.f;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean e()
  {
    return this.g;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof fj));
    fj localfj;
    do
    {
      return false;
      localfj = (fj)paramObject;
    }
    while ((this.b != localfj.b) || (!d.a(Boolean.valueOf(this.c), Boolean.valueOf(localfj.c))) || (!d.a(this.d, localfj.d)) || (!d.a(this.e, localfj.e)) || (!d.a(this.f, localfj.f)));
    return true;
  }

  public final int f()
  {
    return this.b;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Boolean.valueOf(this.c);
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    return Arrays.hashCode(arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cb.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
