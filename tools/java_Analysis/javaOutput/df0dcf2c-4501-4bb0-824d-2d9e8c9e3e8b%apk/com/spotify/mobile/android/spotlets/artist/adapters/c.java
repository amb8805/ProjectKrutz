package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.spotlets.artist.view.ImageViewWithFaceDetection;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

public final class c extends ah
{
  private final List<ArtistModel.Image> a;
  private final Context b;
  private final com.spotify.mobile.android.spotlets.artist.view.f c;
  private d d;
  private Drawable e;

  public c(Context paramContext, List<ArtistModel.Image> paramList, com.spotify.mobile.android.spotlets.artist.view.f paramf)
  {
    this.b = paramContext;
    this.a = ImmutableList.a(paramList);
    this.c = paramf;
    this.d = new d(paramContext, (byte)0);
    if (com.spotify.android.paste.widget.f.a(this.b));
    for (Drawable localDrawable = this.b.getResources().getDrawable(2130837636); ; localDrawable = i.a(this.b))
    {
      this.e = localDrawable;
      return;
    }
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    ImageViewWithFaceDetection localImageViewWithFaceDetection = d.a(this.d);
    localImageViewWithFaceDetection.a(this.c);
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(localImageViewWithFaceDetection);
    localImageViewWithFaceDetection.a(((ArtistModel.Image)this.a.get(paramInt)).uri);
    localImageViewWithFaceDetection.setBackgroundColor(this.b.getResources().getColor(17170444));
    localImageViewWithFaceDetection.setImageDrawable(this.e);
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(((ArtistModel.Image)this.a.get(paramInt)).uri).a(this.e).b(this.e).a(localImageViewWithFaceDetection);
    paramViewGroup.addView(localImageViewWithFaceDetection);
    localImageViewWithFaceDetection.setTag(Integer.valueOf(paramInt));
    return localImageViewWithFaceDetection;
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    ImageViewWithFaceDetection localImageViewWithFaceDetection = (ImageViewWithFaceDetection)paramObject;
    localImageViewWithFaceDetection.a();
    paramViewGroup.removeView(localImageViewWithFaceDetection);
    ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(localImageViewWithFaceDetection);
    d.a(this.d, localImageViewWithFaceDetection);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }

  public final int b()
  {
    return this.a.size();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
