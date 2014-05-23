package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Arrays;

public final class cj
{
  public final Uri a;

  public cj(Uri paramUri)
  {
    this.a = paramUri;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cj));
    do
    {
      return false;
      if (this == paramObject)
        return true;
    }
    while (((cj)paramObject).hashCode() != hashCode());
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
