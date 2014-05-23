package com.spotify.mobile.android.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.g;
import com.spotify.mobile.android.util.c.b;
import java.util.Collections;
import java.util.List;

final class k extends android.support.v4.app.j
{
  private List<b> a = Collections.emptyList();

  public k(g paramg)
  {
    super(paramg);
  }

  public final Fragment a(int paramInt)
  {
    b localb = (b)this.a.get(paramInt);
    j localj = new j();
    localj.b_(localb.c());
    return localj;
  }

  public final void a(List<b> paramList)
  {
    this.a = paramList;
    c();
  }

  public final int b()
  {
    return this.a.size();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
