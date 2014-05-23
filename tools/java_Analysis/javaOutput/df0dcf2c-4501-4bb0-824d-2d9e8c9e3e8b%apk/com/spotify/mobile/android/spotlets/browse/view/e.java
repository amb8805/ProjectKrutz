package com.spotify.mobile.android.spotlets.browse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import com.spotify.mobile.android.spotlets.browse.util.a;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public final class e extends LinearLayout
{
  private int a;
  private final com.spotify.mobile.android.spotlets.browse.b.f b = new com.spotify.mobile.android.spotlets.browse.b.f(new com.spotify.mobile.android.spotlets.browse.b.e(ClientEvent.SubEvent.P, ViewUri.k, ViewUri.SubView.g));

  public e(Context paramContext, ViewGroup paramViewGroup, int paramInt)
  {
    super(paramContext);
    setOrientation(0);
    setBackgroundResource(2130838194);
    int j = getResources().getDimensionPixelSize(2131427383);
    setPadding(j, j, j, j);
    this.a = paramInt;
    if (i < paramInt)
    {
      if (com.spotify.android.paste.widget.f.a(paramContext))
        addView(NewReleaseCell.a(paramContext, paramViewGroup), i, new LinearLayout.LayoutParams(-1, -1, 1.0F));
      while (true)
      {
        i++;
        break;
        addView(a.a(getContext()), i);
      }
    }
  }

  public final void a(List<NewRelease> paramList)
  {
    int i = 0;
    if (i < this.a)
    {
      View localView = getChildAt(i);
      if (i < paramList.size())
        if (com.spotify.android.paste.widget.f.a(getContext()))
        {
          ((NewReleaseCell)localView).a((NewRelease)paramList.get(i), i);
          label54: localView.setVisibility(0);
        }
      while (true)
      {
        i++;
        break;
        CardView localCardView = (CardView)localView;
        NewRelease localNewRelease = (NewRelease)paramList.get(i);
        String str1 = localNewRelease.a();
        String str2 = localNewRelease.d();
        String str3 = localNewRelease.c();
        localCardView.a(true);
        localCardView.a(str1);
        localCardView.b(str3);
        ae localae = ((dd)c.a(dd.class)).a().a(localNewRelease.b());
        localae.a(2130837634);
        localae.b(2130837634);
        localae.a(localCardView.c());
        localCardView.b(localNewRelease.e());
        localCardView.setOnClickListener(new e.1(this, i, str1, str2));
        break label54;
        localView.setVisibility(4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
