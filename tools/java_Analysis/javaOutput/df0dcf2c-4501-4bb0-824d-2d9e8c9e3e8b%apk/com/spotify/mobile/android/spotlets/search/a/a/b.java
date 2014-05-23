package com.spotify.mobile.android.spotlets.search.a.a;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.a.b.c;
import com.spotify.mobile.android.spotlets.search.model.h;
import com.spotify.mobile.android.ui.stuff.i;

public abstract class b<D extends h> extends a<D>
{
  private final Drawable b;
  private final boolean c;

  public b(com.spotify.mobile.android.spotlets.search.a parama, Class<D> paramClass, SpotifyIcon paramSpotifyIcon, boolean paramBoolean)
  {
    super(parama, paramClass);
    this.b = i.a(parama.d(), paramSpotifyIcon);
    this.c = paramBoolean;
  }

  public void a(int paramInt, ListItemView paramListItemView, D paramD, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramD, paramViewGroup);
    c.a(paramListItemView, paramD.getImageUri(), this.b, this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
