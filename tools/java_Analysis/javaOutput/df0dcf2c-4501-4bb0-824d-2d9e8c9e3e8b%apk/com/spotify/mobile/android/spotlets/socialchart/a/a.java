package com.spotify.mobile.android.spotlets.socialchart.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.socialchart.model.ArtistModel;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.ui.stuff.g;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class a extends BaseAdapter
{
  private final Context a;
  private TrackModel[] b = new TrackModel[0];
  private String c;
  private int d;
  private Drawable e;

  public a(Context paramContext)
  {
    this.a = paramContext;
    this.c = this.a.getResources().getString(2131690130);
    this.e = com.spotify.mobile.android.ui.stuff.i.e(paramContext);
  }

  public final void a(int paramInt)
  {
    this.d = paramInt;
    notifyDataSetChanged();
  }

  public final void a(TrackModel[] paramArrayOfTrackModel)
  {
    if (paramArrayOfTrackModel == null)
    {
      this.b = new TrackModel[0];
      notifyDataSetInvalidated();
      return;
    }
    this.b = paramArrayOfTrackModel;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.b.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.b[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView;
    LinearLayout localLinearLayout2;
    if (paramView == null)
    {
      localListItemView = h.h(this.a, paramViewGroup);
      localLinearLayout2 = new LinearLayout(this.a);
      localLinearLayout2.setOrientation(0);
      localListItemView.b(localLinearLayout2);
    }
    TrackModel localTrackModel;
    for (LinearLayout localLinearLayout1 = localLinearLayout2; ; localLinearLayout1 = (LinearLayout)localListItemView.f())
    {
      localTrackModel = (TrackModel)getItem(paramInt);
      localListItemView.b(true);
      localListItemView.setTag(localTrackModel);
      localLinearLayout1.removeAllViews();
      for (int i = 0; (i < 5) && (i < localTrackModel.getInfluencers().length); i++)
      {
        InfluencerModel localInfluencerModel = localTrackModel.getInfluencers()[i];
        ImageView localImageView = new ImageView(this.a);
        localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int j = d.b(25.0F, paramViewGroup.getResources());
        localImageView.setLayoutParams(new LinearLayout.LayoutParams(j, j));
        localImageView.setPadding(0, 0, d.b(2.0F, paramViewGroup.getResources()), 0);
        localLinearLayout1.addView(localImageView);
        ae localae = ((dd)c.a(dd.class)).a().a(com.spotify.mobile.android.provider.i.b(localInfluencerModel.getImageUrl()));
        localae.a(com.spotify.mobile.android.ui.b.a.a());
        localae.a(this.e);
        localae.a(localImageView);
      }
      localListItemView = (ListItemView)paramView;
    }
    localLinearLayout1.addView(g.a(this.a));
    String str;
    if (TextUtils.isEmpty(localTrackModel.getTrackName()))
    {
      str = this.c;
      localListItemView.a(str);
      localListItemView.b(localTrackModel.getArtists()[0].getName());
      if (this.d != paramInt)
        break label330;
    }
    label330: for (boolean bool = true; ; bool = false)
    {
      localListItemView.c(bool);
      return localListItemView;
      str = localTrackModel.getTrackName();
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
