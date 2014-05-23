package com.twitter.android;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import com.twitter.android.provider.ao;
import com.twitter.android.provider.v;

public final class aw
  implements LoaderManager.LoaderCallbacks
{
  private final Context a;
  private final LoaderManager b;
  private final bf c;
  private int d;
  private long e;
  private String f;
  private long g;

  public aw(Context paramContext, LoaderManager paramLoaderManager, bf parambf, int paramInt)
  {
    this.a = paramContext;
    this.b = paramLoaderManager;
    this.c = parambf;
    this.d = 1;
  }

  private void a(boolean paramBoolean, long paramLong1, String paramString, long paramLong2)
  {
    this.e = paramLong1;
    this.f = paramString;
    this.g = paramLong2;
    if (paramBoolean)
    {
      this.b.restartLoader(this.d, null, this);
      return;
    }
    this.b.initLoader(this.d, null, this);
  }

  public final void a(long paramLong1, String paramString, long paramLong2)
  {
    a(false, paramLong1, paramString, paramLong2);
  }

  public final void b(long paramLong1, String paramString, long paramLong2)
  {
    a(true, paramLong1, paramString, paramLong2);
  }

  public final Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    String[] arrayOfString1;
    String str;
    Uri localUri1;
    if (this.f != null)
    {
      Uri localUri2 = ao.a.buildUpon().appendQueryParameter("ownerId", String.valueOf(this.g)).build();
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.f;
      arrayOfString1 = arrayOfString2;
      str = "username=?";
      localUri1 = localUri2;
    }
    while (true)
    {
      return new CursorLoader(this.a, localUri1, v.a, str, arrayOfString1, null);
      localUri1 = ao.c.buildUpon().appendEncodedPath(String.valueOf(this.e)).appendQueryParameter("ownerId", String.valueOf(this.g)).build();
      str = null;
      arrayOfString1 = null;
    }
  }

  public final void onLoaderReset(Loader paramLoader)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
