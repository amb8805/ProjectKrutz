package com.spotify.mobile.android.ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.common.collect.h;
import java.util.HashSet;
import java.util.Set;

public abstract class l extends Fragment
{
  private static final m<n, Activity, Void> a = new l.1();
  private static final m<n, Bundle, Void> b = new l.2();
  private static final m<n, View, Bundle> c = new l.3();
  private static final m<n, Void, Void> d = new l.4();
  private static final m<n, Bundle, Void> e = new l.5();
  private static final m<n, Void, Void> f = new l.6();
  private static final m<n, Void, Void> g = new l.7();
  private final Set<n> h = new HashSet();

  public l()
  {
  }

  private <A, B> void a(m<n, A, B> paramm, A paramA, B paramB)
  {
    h.a(this.h, new l.8(this, paramm, paramA, paramB));
  }

  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    a(a, paramActivity, null);
  }

  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    a(b, paramBundle, null);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    a(c, paramView, paramBundle);
  }

  public final void a(n paramn)
  {
    this.h.add(paramn);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    a(e, paramBundle, null);
  }

  public final void w()
  {
    super.w();
    a(d, null, null);
  }

  public final void x()
  {
    super.x();
    a(f, null, null);
  }

  public final void y()
  {
    super.y();
    a(g, null, null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
