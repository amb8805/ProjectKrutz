package com.spotify.mobile.android.spotlets.search.b;

import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import com.google.common.base.i;
import java.util.Map;
import java.util.WeakHashMap;

abstract class c<D, C>
  implements f<D, C>
{
  final Map<D, C> a = new WeakHashMap();
  protected final com.spotify.mobile.android.spotlets.search.loader.a b;
  protected final com.spotify.mobile.android.spotlets.search.a c;

  protected c(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.loader.a parama1)
  {
    this.c = ((com.spotify.mobile.android.spotlets.search.a)i.a(parama));
    this.b = ((com.spotify.mobile.android.spotlets.search.loader.a)i.a(parama1));
  }

  protected abstract Uri a(D paramD);

  public final C a(View paramView, D paramD)
  {
    Object localObject = this.a.remove(paramD);
    if (localObject == null)
      this.b.a(a(paramD), a(), new d(this, paramView, paramD));
    return localObject;
  }

  protected abstract C a(D paramD, Cursor paramCursor);

  protected abstract String[] a();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
