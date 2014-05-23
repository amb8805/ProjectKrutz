package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.common.collect.ak;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.artist.a.a;
import com.spotify.mobile.android.spotlets.artist.a.d;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track;
import com.spotify.mobile.android.ui.cell.e;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.view.TopHitNumberView;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class h extends BaseAdapter
{
  private final Context a;
  private final List<ArtistModel.Track> b;
  private final Map<String, com.spotify.mobile.android.spotlets.artist.view.b.h> c = ak.a();
  private a d;
  private e e;

  public h(Context paramContext, List<ArtistModel.Track> paramList)
  {
    this.a = paramContext;
    this.b = paramList;
    this.e = new e();
  }

  public final void a(a parama)
  {
    this.d = parama;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    ListItemView localListItemView = (ListItemView)paramView;
    TopHitNumberView localTopHitNumberView;
    ArtistModel.Track localTrack;
    String str;
    label129: boolean bool;
    if (localListItemView == null)
    {
      localListItemView = e.a(this.a);
      ColorStateList localColorStateList = localListItemView.c().getTextColors();
      localTopHitNumberView = new TopHitNumberView(this.a);
      localTopHitNumberView.a();
      com.spotify.android.paste.widget.g.b(this.a, localTopHitNumberView, 2130772386);
      localTopHitNumberView.setTextColor(localColorStateList);
      localListItemView.a(localTopHitNumberView);
      localTopHitNumberView.a(paramInt + 1);
      localTrack = (ArtistModel.Track)this.b.get(paramInt);
      localListItemView.a(localTrack.name);
      if (localTrack.playcount >= 1000)
        break label323;
      str = "< 1000";
      localListItemView.c(str);
      if ((this.d == null) || (!localTrack.uri.equals(this.d.h.a)))
        break label347;
      bool = i;
      label168: localListItemView.c(bool);
      if (f.a(this.a))
      {
        if (!bool)
          break label353;
        int k = i;
        label194: localListItemView.b().setTypeface(null, k);
        localListItemView.c().setTypeface(null, k);
      }
      if (!this.c.containsKey(localTrack.uri))
        this.c.put(localTrack.uri, new com.spotify.mobile.android.spotlets.artist.view.b.h(localTrack.uri));
      localListItemView.setTag(this.c.get(localTrack.uri));
      localListItemView.b(com.spotify.mobile.android.ui.stuff.g.a(this.a));
      if (FeatureFragment.h.a())
        break label359;
    }
    while (true)
    {
      localListItemView.a(i);
      return localListItemView;
      localTopHitNumberView = (TopHitNumberView)localListItemView.e();
      break;
      label323: int j = localTrack.playcount;
      str = NumberFormat.getNumberInstance(Locale.getDefault()).format(j);
      break label129;
      label347: bool = false;
      break label168;
      label353: int m = 0;
      break label194;
      label359: i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
