package com.spotify.mobile.android.spotlets.browse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ViewConstructor"})
public final class g extends LinearLayout
{
  private int a;
  private final com.spotify.mobile.android.spotlets.browse.b.f b = new com.spotify.mobile.android.spotlets.browse.b.f(new e(ClientEvent.SubEvent.R, ViewUri.k, ViewUri.SubView.g));
  private final com.spotify.mobile.android.spotlets.browse.b.a c = new com.spotify.mobile.android.spotlets.browse.b.a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public g(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130838194);
    int j = getResources().getDimensionPixelSize(2131427383);
    setPadding(j, j, j, j);
    this.a = paramInt;
    if (i < paramInt)
    {
      if (com.spotify.android.paste.widget.f.a(getContext()))
        addView(PlaylistCell.a(paramContext, paramViewGroup), i, new LinearLayout.LayoutParams(-1, -1, 1.0F));
      while (true)
      {
        i++;
        break;
        addView(com.spotify.mobile.android.spotlets.browse.util.a.a(getContext()), i);
      }
    }
  }

  public final void a(List<Playlist> paramList, d paramd)
  {
    int i = 0;
    if (i < this.a)
    {
      View localView = getChildAt(i);
      if (i < paramList.size())
        if (com.spotify.android.paste.widget.f.a(getContext()))
        {
          ((PlaylistCell)localView).a((Playlist)paramList.get(i), i, paramd);
          localView.setVisibility(0);
        }
      while (true)
      {
        i++;
        break;
        CardView localCardView = (CardView)localView;
        Playlist localPlaylist = (Playlist)paramList.get(i);
        int j = localPlaylist.f();
        String str1 = localPlaylist.b();
        String str2 = localPlaylist.d();
        String str3 = localPlaylist.a();
        localCardView.a(true);
        localCardView.a(str1);
        Resources localResources = getResources();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        String str4 = localResources.getQuantityString(2131623938, j, arrayOfObject);
        if (!com.spotify.android.paste.widget.f.a(getContext()))
          localCardView.c(str4.toUpperCase(Locale.getDefault()));
        while (true)
        {
          ae localae = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(localPlaylist.c());
          localae.a(2130837638);
          localae.b(2130837638);
          localae.a(localCardView.c());
          localCardView.b(localPlaylist.e());
          ImageButton localImageButton = (ImageButton)localCardView.d();
          if (localImageButton != null)
          {
            com.spotify.mobile.android.a.c localc = new com.spotify.mobile.android.a.c(getContext(), new SpotifyLink(str2), ViewUri.k, ViewUri.k, paramd);
            String str5 = localPlaylist.a();
            ClientEvent localClientEvent1 = this.c.a(-1, str1, str2, str5, "play");
            ClientEvent localClientEvent2 = this.c.a(-1, str1, str2, str5, "pause");
            localc.a(ViewUri.SubView.g, localClientEvent1, localClientEvent2);
            localImageButton.setOnClickListener(new g.1(this, localPlaylist, localc));
          }
          localCardView.setOnClickListener(new g.2(this, i, str3, str1, str2));
          break;
          localCardView.c(str4);
        }
        localView.setVisibility(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
