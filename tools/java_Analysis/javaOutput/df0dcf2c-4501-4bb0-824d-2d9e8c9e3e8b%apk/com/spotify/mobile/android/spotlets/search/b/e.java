package com.spotify.mobile.android.spotlets.search.b;

import android.view.ContextMenu;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

public class e
{
  private final Map<Class<?>, f<?, ?>> a = new HashMap();

  public e()
  {
  }

  public final void a(ContextMenu paramContextMenu, View paramView)
  {
    Object localObject1 = paramView.getTag(2131362209);
    if (localObject1 == null);
    f localf;
    Object localObject2;
    do
    {
      do
      {
        return;
        localf = (f)this.a.get(localObject1.getClass());
      }
      while (localf == null);
      localObject2 = localf.a(paramView, localObject1);
    }
    while (localObject2 == null);
    localf.a(paramContextMenu, localObject2);
  }

  public final <D, C> void a(Class<D> paramClass, f<D, C> paramf)
  {
    this.a.put(paramClass, paramf);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
