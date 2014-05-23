package com.spotify.mobile.android.spotlets.artist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.ProgressAndErrorViewManager;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ds;

public abstract class a extends Fragment
  implements com.spotify.mobile.android.spotlets.artist.model.b, g
{
  protected ArtistModel a;
  private com.spotify.mobile.android.spotlets.artist.b.b b;
  private ProgressAndErrorViewManager c;
  private com.spotify.mobile.android.spotlets.artist.model.a d;

  public a()
  {
  }

  private void F()
  {
    this.c.a();
    this.d = com.spotify.mobile.android.spotlets.artist.model.a.a(i().getApplicationContext(), this);
    this.d.a(this.b);
  }

  private void c(ArtistModel paramArtistModel)
  {
    b(paramArtistModel);
    this.c.b();
  }

  public final Fragment C()
  {
    return this;
  }

  protected abstract View D();

  protected void E()
  {
  }

  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = (FrameLayout)paramLayoutInflater.inflate(2130903197, paramViewGroup, false);
    View localView = D();
    localFrameLayout.addView(localView);
    EmptyView localEmptyView = new EmptyView(i());
    localEmptyView.a(a(2131690065));
    if (!ds.b(i()))
      localEmptyView.a(i.b(i(), SpotifyIcon.cm));
    Button localButton = com.spotify.android.paste.widget.h.b(i(), null);
    localButton.setText(2131690071);
    localEmptyView.a(localButton);
    localButton.setOnClickListener(new a.1(this));
    localFrameLayout.addView(localEmptyView);
    this.c = new ProgressAndErrorViewManager(localView, localFrameLayout.findViewById(2131362406), localEmptyView);
    if (this.a == null)
    {
      F();
      return localFrameLayout;
    }
    c(this.a);
    return localFrameLayout;
  }

  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.b = com.spotify.mobile.android.spotlets.artist.b.h.b(g().getString("artist_uri"));
    if (paramBundle != null)
      this.a = ((ArtistModel)paramBundle.getParcelable("artist_model"));
    if (this.a == null)
      this.a = ((ArtistModel)g().getParcelable("artist_model"));
  }

  public final void a(ArtistModel paramArtistModel)
  {
    this.a = paramArtistModel;
    if (!n_())
      return;
    c(paramArtistModel);
  }

  protected final void a(String paramString)
  {
    if ((paramString != null) && (i() != null))
      ((l)i()).a(this, paramString);
  }

  public final void a(Throwable paramThrowable)
  {
    bp.b(paramThrowable, "Failed to load artist's biography");
    if (!n_())
      return;
    this.c.c();
  }

  protected final com.spotify.mobile.android.spotlets.artist.b.b b()
  {
    return this.b;
  }

  protected abstract void b(ArtistModel paramArtistModel);

  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putParcelable("artist_model", this.a);
  }

  public void e()
  {
    E();
    if (this.d != null)
      this.d.a();
    super.e();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
