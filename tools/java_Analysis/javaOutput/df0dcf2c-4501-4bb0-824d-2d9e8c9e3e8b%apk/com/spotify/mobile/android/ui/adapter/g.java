package com.spotify.mobile.android.ui.adapter;

import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.ui.page.j;
import java.util.ArrayList;
import java.util.List;

public final class g extends n
{
  private final List<h> a = new ArrayList();

  public g(FragmentActivity paramFragmentActivity)
  {
    this.a.add(new g.1(this, paramFragmentActivity));
    this.a.add(new g.12(this, paramFragmentActivity));
    this.a.add(new g.23(this, paramFragmentActivity));
    this.a.add(new g.26(this, paramFragmentActivity));
    this.a.add(new g.27(this, paramFragmentActivity));
    this.a.add(new g.28(this, paramFragmentActivity));
    this.a.add(new g.29(this, paramFragmentActivity));
    this.a.add(new g.30(this, paramFragmentActivity));
    this.a.add(new g.31(this, paramFragmentActivity));
    this.a.add(new g.2(this, paramFragmentActivity));
    this.a.add(new g.3(this, paramFragmentActivity));
    this.a.add(new g.4(this, paramFragmentActivity));
    this.a.add(new g.5(this, paramFragmentActivity));
    this.a.add(new g.6(this, paramFragmentActivity));
    this.a.add(new g.7(this, paramFragmentActivity));
    this.a.add(new g.8(this, paramFragmentActivity));
    this.a.add(new g.9(this, paramFragmentActivity));
    this.a.add(new g.10(this, paramFragmentActivity));
    this.a.add(new g.11(this, paramFragmentActivity));
    this.a.add(new g.13(this, paramFragmentActivity));
    this.a.add(new g.14(this, paramFragmentActivity));
    this.a.add(new g.15(this, paramFragmentActivity));
    this.a.add(new g.16(this, paramFragmentActivity));
    this.a.add(new g.17(this, paramFragmentActivity));
    this.a.add(new g.18(this, paramFragmentActivity));
    for (DebugFlag localDebugFlag : DebugFlag.values())
      this.a.add(new g.19(this, localDebugFlag, paramFragmentActivity));
    this.a.add(new g.20(this, paramFragmentActivity));
    this.a.add(new g.21(this, paramFragmentActivity));
    this.a.add(new g.22(this, paramFragmentActivity));
    this.a.add(new g.24(this, paramFragmentActivity));
    this.a.add(new g.25(this, paramFragmentActivity));
  }

  public final int a()
  {
    return this.a.size();
  }

  public final j a(int paramInt, ViewGroup paramViewGroup)
  {
    return ((h)this.a.get(paramInt)).b(paramViewGroup);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
