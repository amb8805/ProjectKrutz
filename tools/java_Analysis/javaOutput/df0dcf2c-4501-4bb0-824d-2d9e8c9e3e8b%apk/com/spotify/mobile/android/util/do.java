package com.spotify.mobile.android.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.o;

public final class do
{
  private n a;
  private dp b;
  private Context c;
  private int d;
  private o<Cursor> e = new do.1(this);

  public do(Context paramContext, n paramn, int paramInt, dp paramdp)
  {
    this.c = paramContext;
    this.a = paramn;
    this.d = paramInt;
    this.b = paramdp;
  }

  public final void a(Uri paramUri, String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("content_uri", paramUri.toString());
    localBundle.putString("track_uri", paramString1);
    localBundle.putString("sort_order", paramString2);
    this.a.a(this.d, localBundle, this.e);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.do
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
