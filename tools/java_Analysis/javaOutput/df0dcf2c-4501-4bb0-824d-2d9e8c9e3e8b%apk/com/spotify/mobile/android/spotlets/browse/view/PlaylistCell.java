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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.spotlets.browse.b.a;
import com.spotify.mobile.android.spotlets.browse.b.e;
import com.spotify.mobile.android.spotlets.browse.b.f;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public class PlaylistCell extends FrameLayout
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private ImageView c;
  private PlayButton d;
  private View e;
  private String f;
  private String g;
  private String h;
  private int i;
  private boolean j;
  private final f k = new f(new e(ClientEvent.SubEvent.R, ViewUri.k, ViewUri.SubView.g));
  private final a l = new a(new e(ClientEvent.SubEvent.U, ViewUri.k, ViewUri.SubView.g));

  public PlaylistCell(Context paramContext)
  {
    super(paramContext);
    setOnClickListener(this);
  }

  public PlaylistCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnClickListener(this);
  }

  public static PlaylistCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    int m = (int)paramContext.getResources().getDimension(2131427458);
    PlaylistCell localPlaylistCell = (PlaylistCell)LayoutInflater.from(paramContext).inflate(2130903085, paramViewGroup, false);
    ViewGroup.LayoutParams localLayoutParams = ((LinearLayout)localPlaylistCell.findViewById(2131362283)).getLayoutParams();
    localLayoutParams.width = m;
    localLayoutParams.height = m;
    return localPlaylistCell;
  }

  public final void a(Playlist paramPlaylist, int paramInt, d paramd)
  {
    this.f = paramPlaylist.b();
    this.g = paramPlaylist.d();
    this.h = paramPlaylist.a();
    this.i = paramInt;
    int m = paramPlaylist.f();
    this.a.setText(this.f);
    com.spotify.mobile.android.a.c localc;
    if (m == -1)
    {
      this.b.setVisibility(8);
      ae localae = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(paramPlaylist.c());
      localae.a(2130837638);
      localae.b(2130837638);
      localae.a(this.c);
      this.d.a(paramPlaylist.e());
      localc = new com.spotify.mobile.android.a.c(getContext(), new SpotifyLink(this.g), ViewUri.k, ViewUri.k, paramd);
      if (!this.j)
        break label271;
    }
    label271: for (String str = "overview"; ; str = this.h)
    {
      ClientEvent localClientEvent1 = this.l.a(-1, this.f, this.g, str, "play");
      ClientEvent localClientEvent2 = this.l.a(-1, this.f, this.g, str, "pause");
      localc.a(ViewUri.SubView.g, localClientEvent1, localClientEvent2);
      this.d.a(localc);
      return;
      TextView localTextView = this.b;
      Resources localResources = getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(m);
      localTextView.setText(localResources.getQuantityString(2131623938, m, arrayOfObject));
      break;
    }
  }

  public boolean hasFocusable()
  {
    return false;
  }

  public void onClick(View paramView)
  {
    if (this.j);
    for (String str = "overview"; ; str = this.h)
    {
      this.k.a(getContext(), this.i, str, this.f, this.g);
      return;
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131362227));
    this.b = ((TextView)findViewById(2131362282));
    this.d = ((PlayButton)findViewById(2131362283));
    this.c = ((ImageView)findViewById(2131362223));
    this.e = findViewById(2131362279);
  }

  public void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    View localView = this.e;
    if (paramBoolean);
    for (int m = 0; ; m = 8)
    {
      localView.setVisibility(m);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.view.PlaylistCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
