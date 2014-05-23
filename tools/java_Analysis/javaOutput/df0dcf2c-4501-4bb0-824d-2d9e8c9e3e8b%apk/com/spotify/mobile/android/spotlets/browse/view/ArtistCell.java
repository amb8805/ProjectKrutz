package com.spotify.mobile.android.spotlets.browse.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.a.c;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.provider.i;
import com.spotify.mobile.android.spotlets.browse.b.a;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.b.g;
import com.spotify.mobile.android.spotlets.browse.model.Artist;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.ui.view.SpotifyImageView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;

public class ArtistCell extends FrameLayout
  implements View.OnClickListener
{
  private TextView a;
  private SpotifyImageView b;
  private PlayButton c;
  private View d;
  private String e;
  private String f;
  private int g;
  private boolean h;
  private g i = new g(new e(ClientEvent.SubEvent.Q, ViewUri.k, ViewUri.SubView.g));
  private final a j = new a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public ArtistCell(Context paramContext)
  {
    super(paramContext);
    setOnClickListener(this);
  }

  public ArtistCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnClickListener(this);
  }

  public static ArtistCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    int k = (int)paramContext.getResources().getDimension(2131427458);
    ArtistCell localArtistCell = (ArtistCell)LayoutInflater.from(paramContext).inflate(2130903088, paramViewGroup, false);
    ViewGroup.LayoutParams localLayoutParams = ((LinearLayout)localArtistCell.findViewById(2131362283)).getLayoutParams();
    localLayoutParams.width = k;
    localLayoutParams.height = k;
    return localArtistCell;
  }

  public final void a(Artist paramArtist, int paramInt, d paramd)
  {
    this.e = paramArtist.a();
    this.f = paramArtist.d();
    this.g = paramInt;
    this.a.setText(this.e);
    this.b.a(i.b(paramArtist.b()));
    this.c.a(paramArtist.e());
    c localc = new c(getContext(), new SpotifyLink(this.f), ViewUri.k, ViewUri.k, paramd);
    if (this.h);
    for (String str = "overview"; ; str = "root")
    {
      ClientEvent localClientEvent1 = this.j.a(-1, this.e, this.f, str, "play");
      ClientEvent localClientEvent2 = this.j.a(-1, this.e, this.f, str, "pause");
      localc.a(ViewUri.SubView.g, localClientEvent1, localClientEvent2);
      this.c.a(localc);
      return;
    }
  }

  public boolean hasFocusable()
  {
    return false;
  }

  public void onClick(View paramView)
  {
    if (this.h);
    for (String str = "overview"; ; str = "root")
    {
      this.i.a(getContext(), this.g, str, this.e, this.f);
      return;
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((SpotifyImageView)findViewById(2131362223));
    this.c = ((PlayButton)findViewById(2131362283));
    this.b.a(2130837638);
    this.d = findViewById(2131362279);
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.d;
    if (paramBoolean);
    for (int k = 0; ; k = 8)
    {
      localView.setVisibility(k);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.ArtistCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
