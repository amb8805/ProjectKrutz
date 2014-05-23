package com.spotify.mobile.android.ui.page.a;

import android.os.Handler;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c
{
  private Handler a;
  private ViewGroup b;
  private List<k> c = Collections.synchronizedList(new ArrayList());
  private f d;
  private Runnable e = new c.1(this);

  public c(Handler paramHandler, ViewGroup paramViewGroup)
  {
    this.a = paramHandler;
    this.b = paramViewGroup;
    cc.a(this.a, "You must pass a handler that is not null.");
    cc.a(this.b, "You must pass a ViewGroup container that is not null.");
  }

  private void a()
  {
    if (this.c.isEmpty())
      this.b.setVisibility(8);
    int i;
    do
    {
      do
        return;
      while (this.d != null);
      k localk = (k)this.c.remove(0);
      this.d = localk.a();
      this.b.setVisibility(0);
      this.b.removeAllViews();
      this.b.addView(this.d.e());
      i = localk.b();
    }
    while (i == -1);
    this.a.postDelayed(this.e, i);
  }

  public final void a(f paramf)
  {
    a(paramf, 2000);
  }

  public final void a(f paramf, int paramInt)
  {
    cc.a(paramf, "The page cannot be null.");
    if ((paramInt == -1) || (paramInt > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "delayMs must be OverlayHandler.FOREVER or greater than 0.");
      k localk = new k(paramf, paramInt);
      if (!this.c.contains(localk))
      {
        this.c.add(localk);
        a();
      }
      return;
    }
  }

  public final void b(f paramf)
  {
    cc.a(paramf, "The page cannot be null.");
    this.c.remove(new k(paramf, 0));
    if ((this.d != null) && (this.d.equals(paramf)))
    {
      this.b.setVisibility(8);
      this.a.removeCallbacks(this.e);
      this.d = null;
      a();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
