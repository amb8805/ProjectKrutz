package com.spotify.mobile.android.util.ui;

import android.support.v4.view.br;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements br
{
  private List<br> a = new ArrayList();

  public a()
  {
  }

  public final void a(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((br)localIterator.next()).a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((br)localIterator.next()).a(paramInt1, paramFloat, paramInt2);
  }

  public final void a(br parambr)
  {
    cc.a(parambr);
    this.a.add(parambr);
  }

  public final void b(int paramInt)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((br)localIterator.next()).b(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ui.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
