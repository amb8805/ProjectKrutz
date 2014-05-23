package com.spotify.mobile.android.spotlets.search.b;

import android.database.Cursor;
import android.view.View;
import com.spotify.mobile.android.spotlets.search.loader.b;
import java.lang.ref.WeakReference;
import java.util.Map;

final class d<D, C>
  implements b
{
  private final WeakReference<c<D, C>> a;
  private final WeakReference<View> b;
  private final WeakReference<D> c;

  d(c<D, C> paramc, View paramView, D paramD)
  {
    this.a = new WeakReference(paramc);
    this.b = new WeakReference(paramView);
    this.c = new WeakReference(paramD);
  }

  public final void a(Cursor paramCursor)
  {
    c localc = (c)this.a.get();
    View localView = (View)this.b.get();
    Object localObject = this.c.get();
    if ((localc != null) && (localView != null) && (localObject != null) && (paramCursor.moveToFirst()) && (localView.getTag(2131362209) == localObject))
    {
      localc.a.put(localObject, localc.a(localObject, paramCursor));
      if (localView.isShown())
        localView.showContextMenu();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
