package com.spotify.mobile.android.a;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.ui.view.m;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dc;

public class c
  implements m
{
  private ClientEvent a;
  protected final Context b;
  protected final SpotifyLink c;
  protected final ViewUri.Verified d;
  protected final ViewUri.Verified e;
  protected final d f;
  protected ViewUri.SubView g;
  protected final a h = (a)com.spotify.mobile.android.c.c.a(a.class);
  protected final com.spotify.mobile.android.ui.actions.d i = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private boolean j;
  private ClientEvent k;
  private boolean l;

  public c(Context paramContext, SpotifyLink paramSpotifyLink, ViewUri.Verified paramVerified1, ViewUri.Verified paramVerified2, d paramd)
  {
    cc.a(paramContext, "Don't create a PlaySpotifyContextController with a null context");
    cc.a(paramSpotifyLink, "Don't create a PlaySpotifyContextController with a null context URI");
    cc.a(paramVerified1, "Don't create a PlaySpotifyContextController with a null view URI");
    cc.a(paramd, "Don't create a PlaySpotifyContextController with a null ContextUriProvider");
    this.b = paramContext;
    this.c = paramSpotifyLink;
    this.f = paramd;
    this.d = paramVerified1;
    if (paramVerified2 == null)
      paramVerified2 = ViewUri.aV;
    this.e = paramVerified2;
  }

  public final void a()
  {
    if (this.c.d().equals(this.f.a()))
      com.spotify.mobile.android.ui.actions.d.c(this.b);
    while (true)
    {
      if (this.j)
        a.a(this.b, this.d, this.g, this.a);
      return;
      Uri localUri = dc.a(this.c);
      if (localUri != null)
        com.spotify.mobile.android.ui.actions.d.a(this.b, this.d, this.e, localUri);
    }
  }

  public final void a(ViewUri.SubView paramSubView, ClientEvent paramClientEvent1, ClientEvent paramClientEvent2)
  {
    boolean bool1 = true;
    cc.a(paramSubView, "Don't call setEventLogging with null subView");
    boolean bool2;
    if ((paramSubView != null) && (paramClientEvent1 != null))
    {
      bool2 = bool1;
      this.j = bool2;
      if ((paramSubView == null) || (paramClientEvent2 == null))
        break label64;
    }
    while (true)
    {
      this.l = bool1;
      this.g = paramSubView;
      this.a = paramClientEvent1;
      this.k = paramClientEvent2;
      return;
      bool2 = false;
      break;
      label64: bool1 = false;
    }
  }

  public boolean a(PlayButton paramPlayButton)
  {
    return false;
  }

  public final void b()
  {
    com.spotify.mobile.android.ui.actions.d.c(this.b);
    if (this.l)
      a.a(this.b, this.d, this.g, this.k);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
