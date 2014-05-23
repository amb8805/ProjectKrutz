package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;

public final class g
{
  private static final Uri a = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();

  public static Uri a(String paramString)
  {
    f.a(paramString, "Resource name must not be null.");
    return a.buildUpon().appendPath(paramString).build();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
