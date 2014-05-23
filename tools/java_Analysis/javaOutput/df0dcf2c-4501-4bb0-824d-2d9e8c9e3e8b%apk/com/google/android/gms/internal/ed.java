package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class ed
  implements SafeParcelable
{
  public static final av a = new av();
  private final int b;
  private final String c;
  private final String[] d;
  private final String[] e;
  private final String[] f;
  private final String g;
  private final String h;
  private final String i;

  public ed(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramArrayOfString1;
    this.e = paramArrayOfString2;
    this.f = paramArrayOfString3;
    this.g = paramString2;
    this.h = paramString3;
    this.i = paramString4;
  }

  public final int a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final String[] c()
  {
    return this.d;
  }

  public final String[] d()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String[] e()
  {
    return this.f;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ed));
    ed localed;
    do
    {
      return false;
      localed = (ed)paramObject;
    }
    while ((this.b != localed.b) || (!d.a(this.c, localed.c)) || (!d.a(this.d, localed.d)) || (!d.a(this.e, localed.e)) || (!d.a(this.f, localed.f)) || (!d.a(this.g, localed.g)) || (!d.a(this.h, localed.h)) || (!d.a(this.i, localed.i)));
    return true;
  }

  public final String f()
  {
    return this.g;
  }

  public final String g()
  {
    return this.h;
  }

  public final String h()
  {
    return this.i;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    arrayOfObject[5] = this.g;
    arrayOfObject[6] = this.h;
    arrayOfObject[7] = this.i;
    return Arrays.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return d.a(this).a("versionCode", Integer.valueOf(this.b)).a("accountName", this.c).a("requestedScopes", this.d).a("visibleActivities", this.e).a("requiredFeatures", this.f).a("packageNameForAuth", this.g).a("callingPackageName", this.h).a("applicationName", this.i).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    av.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
