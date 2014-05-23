package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Image;
import com.spotify.mobile.android.ui.view.SpotifyImageView;

public class BiographyImageView extends FrameLayout
{
  SpotifyImageView a;

  public BiographyImageView(Context paramContext)
  {
    super(paramContext);
  }

  public BiographyImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(ArtistModel.Image paramImage)
  {
    this.a.a(paramImage.getUri());
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((SpotifyImageView)LayoutInflater.from(getContext()).inflate(2130903078, this).findViewById(2131362223));
    this.a.a(2130838180);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.BiographyImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
