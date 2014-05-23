package com.spotify.mobile.android.spotlets.artist;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.spotlets.artist.view.BiographyImageView;
import com.spotify.mobile.android.util.HtmlUtil;
import java.util.ArrayList;

public final class b extends a
{
  private TextView b;
  private ArrayList<ArtistModel.Image> c;
  private BiographyImageView d;
  private BiographyImageView e;

  public b()
  {
  }

  protected final View D()
  {
    View localView = LayoutInflater.from(i()).inflate(2130903192, null, false);
    this.b = ((TextView)localView.findViewById(2131362455));
    this.d = ((BiographyImageView)localView.findViewById(2131362519));
    this.e = ((BiographyImageView)localView.findViewById(2131362520));
    return localView;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690066);
  }

  protected final void b(ArtistModel paramArtistModel)
  {
    this.c = new ArrayList(paramArtistModel.info.portraits);
    if (!paramArtistModel.biography.a());
    do
    {
      do
      {
        return;
        Spannable localSpannable = (Spannable)Html.fromHtml((String)paramArtistModel.biography.b());
        HtmlUtil.a(localSpannable, null);
        this.b.setText(localSpannable);
        this.b.setMovementMethod(LinkMovementMethod.getInstance());
      }
      while (this.c == null);
      if (this.c.size() > 0)
      {
        this.d.a((ArtistModel.Image)this.c.get(0));
        this.d.setVisibility(0);
      }
    }
    while (this.c.size() < 2);
    this.e.a((ArtistModel.Image)this.c.get(1));
    this.e.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
