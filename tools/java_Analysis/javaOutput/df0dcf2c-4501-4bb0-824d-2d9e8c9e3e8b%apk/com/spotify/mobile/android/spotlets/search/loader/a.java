package com.spotify.mobile.android.spotlets.search.loader;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.n;
import com.google.common.base.i;

public final class a
{
  private final Context a;
  private final n b;

  public a(Context paramContext, n paramn)
  {
    this.b = ((n)i.a(paramn, "null loader manager"));
    this.a = ((Context)i.a(paramContext, "null context"));
  }

  public final void a()
  {
    this.b.a(2131362112);
  }

  public final void a(Uri paramUri, String[] paramArrayOfString, b paramb)
  {
    i.a(paramb, "null listener");
    this.b.b(2131362112, null, new a.1(this, paramUri, paramArrayOfString, paramb));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.loader.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
