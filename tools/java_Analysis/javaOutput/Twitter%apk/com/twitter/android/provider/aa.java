package com.twitter.android.provider;

import android.net.Uri;
import android.net.Uri.Builder;

public final class aa
{
  private aa()
  {
  }

  public static Uri a(long paramLong1, long paramLong2)
  {
    return az.b.buildUpon().appendEncodedPath(String.valueOf(paramLong1)).appendQueryParameter("ownerId", String.valueOf(paramLong2)).build();
  }

  public static Uri a(Uri paramUri, long paramLong)
  {
    return paramUri.buildUpon().appendQueryParameter("ownerId", String.valueOf(paramLong)).build();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
