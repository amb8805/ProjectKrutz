package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.model.g;
import com.spotify.mobile.android.model.k;
import com.spotify.mobile.android.ui.b.b;
import com.spotify.mobile.android.ui.cell.RadioCoverCell;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.bc;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class p extends android.support.v4.widget.a
{
  private final Drawable j;
  private dd k = (dd)c.a(dd.class);
  private LayoutInflater l;
  private String m;
  private String n;
  private final boolean o;
  private String p = "";

  public p(Context paramContext)
  {
    super(paramContext);
    this.o = f.a(paramContext);
    this.l = LayoutInflater.from(paramContext);
    this.m = paramContext.getString(2131690130);
    this.n = paramContext.getString(2131690147);
    this.j = com.spotify.mobile.android.ui.stuff.i.a(paramContext, SpotifyIcon.ah);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (this.o)
      return RadioCoverCell.a(paramContext, paramViewGroup);
    View localView = this.l.inflate(2130903249, paramViewGroup, false);
    CardView localCardView = (CardView)localView.findViewById(2131362277);
    localCardView.a(com.spotify.mobile.android.ui.stuff.a.a(this.d));
    localCardView.a(d.a(8.0F, paramContext.getResources()));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    g localg = new g(paramCursor);
    paramView.setTag(localg);
    if (this.o)
    {
      ((RadioCoverCell)paramView).a(localg);
      return;
    }
    CardView localCardView = (CardView)paramView.findViewById(2131362277);
    localCardView.a(true);
    String str1 = localg.b();
    if (TextUtils.isEmpty(str1))
      str1 = this.m;
    String str2 = localg.c();
    if (TextUtils.isEmpty(str2))
      str2 = " ";
    String str3 = localg.d();
    SpotifyLink localSpotifyLink = new SpotifyLink(localg.e());
    if (localSpotifyLink.a() == SpotifyLink.LinkType.ae)
      str1 = this.n;
    localCardView.a(str1);
    localCardView.b(str2);
    localCardView.b(this.p.equals(localg.e()));
    ImageView localImageView = localCardView.c();
    if (localSpotifyLink.a() == SpotifyLink.LinkType.K);
    for (String str4 = bc.a(localg.e()); ; str4 = str3)
    {
      if (TextUtils.isEmpty(str4))
      {
        localImageView.setImageDrawable(this.j);
        return;
      }
      ae localae = this.k.a().a(com.spotify.mobile.android.provider.i.a(str4)).a(this.j);
      if (localSpotifyLink.a() == SpotifyLink.LinkType.g)
        localae.a(b.a());
      localae.a(localImageView);
      return;
    }
  }

  public final void a(String paramString)
  {
    this.p = paramString;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
