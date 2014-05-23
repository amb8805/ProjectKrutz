package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class CoverCardHorizontal extends FrameLayout
{
  private Playlist a;
  private CardView b;

  public CoverCardHorizontal(Context paramContext)
  {
    super(paramContext);
  }

  public CoverCardHorizontal(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static CoverCardHorizontal a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (CoverCardHorizontal)LayoutInflater.from(paramContext).inflate(2130903079, paramViewGroup, false);
  }

  public final Playlist a()
  {
    return this.a;
  }

  public final void a(Playlist paramPlaylist)
  {
    this.a = paramPlaylist;
    this.b.b();
    this.b.a(this.a.b());
    ImageView localImageView = this.b.c();
    ((dd)c.a(dd.class)).a().a(this.a.c()).a(i.f(getContext())).a(localImageView);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((CardView)findViewById(2131362277));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.CoverCardHorizontal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
