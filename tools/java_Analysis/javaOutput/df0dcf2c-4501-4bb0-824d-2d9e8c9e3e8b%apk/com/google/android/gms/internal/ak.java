package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class ak
  implements SafeParcelable
{
  public static final k a = new k();
  private final int b;
  private final int c;
  private final int d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;

  public ak(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
  }

  public final int a()
  {
    return this.b;
  }

  public final int b()
  {
    return this.c;
  }

  public final int c()
  {
    return this.d;
  }

  public final String d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.f;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ak));
    ak localak;
    do
    {
      return false;
      localak = (ak)paramObject;
    }
    while ((this.b != localak.b) || (this.c != localak.c) || (this.d != localak.d) || (!d.a(this.e, localak.e)) || (!d.a(this.f, localak.f)));
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

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = Integer.valueOf(this.d);
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    if (this.c == 2);
    for (int i = 1; i != 0; i = 0)
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = this.f;
      arrayOfObject3[1] = this.g;
      return String.format("Person [%s] %s", arrayOfObject3);
    }
    if ((this.c == 1) && (this.d == -1));
    for (int j = 1; j != 0; j = 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = this.e;
      arrayOfObject2[1] = this.g;
      return String.format("Circle [%s] %s", arrayOfObject2);
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.e;
    arrayOfObject1[1] = this.g;
    return String.format("Group [%s] %s", arrayOfObject1);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
