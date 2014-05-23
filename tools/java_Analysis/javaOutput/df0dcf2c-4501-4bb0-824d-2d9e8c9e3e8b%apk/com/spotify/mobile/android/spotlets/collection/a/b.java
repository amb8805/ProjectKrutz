package com.spotify.mobile.android.spotlets.collection.a;

import android.content.Context;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ax;
import com.spotify.mobile.android.util.ay;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private final List<ax> a = new ArrayList();
  private final ax b = new ax(this.h);
  private final ViewUri.Verified c;
  private final String d;
  private final cw e;
  private final cy f;
  private c g;
  private ay h = new b.1(this);

  public b(ViewUri.Verified paramVerified, String paramString, boolean paramBoolean, cw paramcw, cy paramcy)
  {
    if (!paramBoolean)
      this.a.add(this.b);
    this.c = paramVerified;
    this.d = paramString;
    this.e = paramcw;
    this.f = paramcy;
    this.b.a(this.e.a(paramcy, false));
  }

  public final List<ax> a()
  {
    return this.a;
  }

  public final void a(Context paramContext)
  {
    this.e.a().a(this.f, false).b();
    this.b.a(false);
    com.spotify.mobile.android.c.c.a(a.class);
    a.a(paramContext, this.c, ClientEvent.a(this.d, ClientEvent.SubEvent.bq, null, null));
    if (this.g != null)
      this.g.a();
  }

  public final void a(c paramc)
  {
    this.g = paramc;
  }

  public final boolean b()
  {
    return this.b.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
