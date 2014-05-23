package com.spotify.mobile.android.spotlets.artist.view.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.List;

public class HeaderViewSingleImage extends FrameLayout
  implements a
{
  private ImageView a;
  private TextView b;
  private b c;

  private HeaderViewSingleImage(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public HeaderViewSingleImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public static HeaderViewSingleImage a(Context paramContext, ArtistModel.ArtistInfo paramArtistInfo)
  {
    HeaderViewSingleImage localHeaderViewSingleImage = new HeaderViewSingleImage(paramContext);
    localHeaderViewSingleImage.a(paramArtistInfo);
    return localHeaderViewSingleImage;
  }

  private void a()
  {
    LayoutInflater.from(getContext()).inflate(2130903200, this);
    this.a = ((ImageView)findViewById(2131362223));
    this.b = ((TextView)findViewById(2131362314));
    this.a.setOnClickListener(new HeaderViewSingleImage.1(this));
  }

  public final void a(int paramInt)
  {
  }

  public final void a(ArtistModel.ArtistInfo paramArtistInfo)
  {
    if (!paramArtistInfo.portraits.isEmpty())
      ((dd)c.a(dd.class)).a().a(((ArtistModel.Image)paramArtistInfo.portraits.get(0)).uri).a(this.a);
    this.b.setText(paramArtistInfo.name);
  }

  public final void a(b paramb)
  {
    cc.b();
    this.c = paramb;
  }

  public final int b()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewSingleImage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
