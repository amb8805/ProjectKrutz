package com.spotify.mobile.android.a;

import android.content.Context;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import java.util.Collections;
import java.util.List;

public final class a extends c
{
  public static final b a = new b();
  private final List<String> j;
  private long k = 0L;
  private ClientEvent l;
  private boolean m;
  private PlayButton n;

  public a(Context paramContext, SpotifyLink paramSpotifyLink, List<String> paramList, ViewUri.Verified paramVerified1, ViewUri.Verified paramVerified2, d paramd)
  {
    super(paramContext, paramSpotifyLink, paramVerified1, paramVerified2, paramd);
    this.j = Collections.unmodifiableList(paramList);
  }

  public final void a(ViewUri.SubView paramSubView, ClientEvent paramClientEvent1, ClientEvent paramClientEvent2, ClientEvent paramClientEvent3)
  {
    a(paramSubView, paramClientEvent1, paramClientEvent2);
    if (paramSubView != null);
    for (boolean bool = true; ; bool = false)
    {
      this.m = bool;
      this.l = paramClientEvent3;
      return;
    }
  }

  public final boolean a(PlayButton paramPlayButton)
  {
    if (this.j.size() > 0)
    {
      b.a(a, this);
      this.k = SystemClock.elapsedRealtime();
      this.n = paramPlayButton;
      PlayButton localPlayButton = this.n;
      localPlayButton.startAnimation(AnimationUtils.loadAnimation(localPlayButton.getContext(), 2130968591));
      com.spotify.mobile.android.ui.actions.d.a(this.b, this.j);
      return true;
    }
    return super.a(paramPlayButton);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
