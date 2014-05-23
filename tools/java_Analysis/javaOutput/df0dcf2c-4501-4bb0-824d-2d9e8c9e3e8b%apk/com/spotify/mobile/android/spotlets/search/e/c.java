package com.spotify.mobile.android.spotlets.search.e;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.h;

final class c
{
  private SpotifyIcon b;
  private Integer c;
  private Integer d;
  private int e;
  private View.OnClickListener f;

  c(b paramb)
  {
  }

  final EmptyView a()
  {
    EmptyView localEmptyView = new EmptyView(this.a.a);
    if (this.c != null)
      localEmptyView.a(this.a.a.getString(this.c.intValue()));
    if (this.d != null)
      localEmptyView.b(this.a.a.getString(this.d.intValue()));
    if (this.f != null)
    {
      Button localButton = h.b(this.a.a, localEmptyView);
      localButton.setOnClickListener(this.f);
      localButton.setText(this.e);
      localEmptyView.a(localButton);
    }
    if (this.b != null)
      localEmptyView.a(com.spotify.mobile.android.ui.stuff.i.b(this.a.a, this.b));
    return localEmptyView;
  }

  final c a(View.OnClickListener paramOnClickListener)
  {
    this.e = 2131689811;
    this.f = ((View.OnClickListener)com.google.common.base.i.a(paramOnClickListener));
    return this;
  }

  final c a(SpotifyIcon paramSpotifyIcon)
  {
    this.b = paramSpotifyIcon;
    return this;
  }

  final c a(Integer paramInteger)
  {
    this.c = paramInteger;
    return this;
  }

  final c b(Integer paramInteger)
  {
    this.d = paramInteger;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
