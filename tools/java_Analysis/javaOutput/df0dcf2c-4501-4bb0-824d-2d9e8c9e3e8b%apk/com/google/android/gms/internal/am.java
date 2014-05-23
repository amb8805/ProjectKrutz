package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class am
  implements SafeParcelable
{
  public static final m a = new m();
  private final int b;
  private final ao c;

  am(int paramInt, ao paramao)
  {
    this.b = paramInt;
    this.c = paramao;
  }

  private am(ao paramao)
  {
    this.b = 1;
    this.c = paramao;
  }

  public static am a(p<?, ?> paramp)
  {
    if ((paramp instanceof ao))
      return new am((ao)paramp);
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }

  final int a()
  {
    return this.b;
  }

  final ao b()
  {
    return this.c;
  }

  public final p<?, ?> c()
  {
    if (this.c != null)
      return this.c;
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
