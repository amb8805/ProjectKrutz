package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.browse.b.a;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.b.f;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class PlaylistCellHorizontal extends RelativeLayout
{
  private TextView a;
  private ImageView b;
  private View c;
  private Playlist d;
  private final f e = new f(new e(ClientEvent.SubEvent.R, ViewUri.k, ViewUri.SubView.g));
  private final a f = new a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public PlaylistCellHorizontal(Context paramContext)
  {
    super(paramContext);
  }

  public PlaylistCellHorizontal(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static PlaylistCellHorizontal a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (PlaylistCellHorizontal)LayoutInflater.from(paramContext).inflate(2130903086, paramViewGroup, false);
  }

  public final Playlist a()
  {
    return this.d;
  }

  public final void a(Playlist paramPlaylist)
  {
    this.d = paramPlaylist;
    paramPlaylist.f();
    this.a.setText(this.d.b());
    ae localae = ((dd)c.a(dd.class)).a().a(paramPlaylist.c());
    localae.a(2130837638);
    localae.b(2130837638);
    localae.a(this.b);
  }

  public boolean hasFocusable()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((ImageView)findViewById(2131362223));
    this.c = findViewById(2131362279);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int j = getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    if (k == 0)
    {
      k = 1073741824;
      j = i;
    }
    int n = getResources().getDimensionPixelSize(2131427422);
    int i1 = getResources().getDimensionPixelSize(2131427421);
    int i2 = Math.min(i, j);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i1 + (i2 - n), m), View.MeasureSpec.makeMeasureSpec(i2, k));
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.c;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.PlaylistCellHorizontal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
