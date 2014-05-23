package com.spotify.mobile.android.spotlets.browse.b;

import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;

public final class e
{
  private final ClientEvent.SubEvent a;
  private final ViewUri.Verified b;
  private final ViewUri.SubView c;

  public e(ClientEvent.SubEvent paramSubEvent, ViewUri.Verified paramVerified, ViewUri.SubView paramSubView)
  {
    cc.a(paramSubEvent, "Don't create LogInfo with null subEvent");
    cc.a(paramVerified, "Don't create LogInfo with null viewUri");
    cc.a(paramSubView, "Don't create LogInfo with null subView");
    this.a = paramSubEvent;
    this.b = paramVerified;
    this.c = paramSubView;
  }

  public final ClientEvent.SubEvent a()
  {
    return this.a;
  }

  public final ViewUri.Verified b()
  {
    return this.b;
  }

  public final ViewUri.SubView c()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
