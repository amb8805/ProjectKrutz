package com.spotify.mobile.android.spotlets.openaccess.b;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.spotlets.openaccess.model.Album;
import com.spotify.mobile.android.spotlets.openaccess.model.Image;
import com.spotify.mobile.android.spotlets.openaccess.model.Images;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.prettylist.StickyListView;
import com.spotify.mobile.android.ui.prettylist.e;
import com.spotify.mobile.android.ui.stuff.f;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import java.util.Locale;

public final class a extends Fragment
  implements com.spotify.mobile.android.spotlets.openaccess.b
{
  private static final com.spotify.mobile.android.spotlets.openaccess.a.b f = new a.1();
  private com.spotify.mobile.android.ui.prettylist.c a;
  private com.spotify.mobile.android.spotlets.openaccess.a b;
  private q c;
  private com.spotify.mobile.android.spotlets.openaccess.a.a d;
  private TextView e;

  public a()
  {
  }

  public static a a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("uri", paramString);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity1 = i();
    this.c = new q(i());
    SpotifyLink localSpotifyLink = new SpotifyLink(g().getString("uri"));
    this.a = e.a(localFragmentActivity1);
    this.a.b(f.a(localFragmentActivity1, null));
    this.a.a().a(true);
    if (this.a.b() != null)
    {
      com.spotify.mobile.android.ui.prettylist.c localc = this.a;
      FragmentActivity localFragmentActivity2 = i();
      LinearLayout localLinearLayout = new LinearLayout(localFragmentActivity2);
      localLinearLayout.setOrientation(1);
      localLinearLayout.setGravity(17);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      this.e = h.a(localFragmentActivity2, localLinearLayout);
      this.e.setGravity(17);
      this.e.setIncludeFontPadding(false);
      this.e.setMaxLines(2);
      this.e.setEllipsize(TextUtils.TruncateAt.END);
      this.e.setLineSpacing(d.a(4.0F, j()), 1.0F);
      g.b(localFragmentActivity2, this.e, 2130772390);
      this.e.setVisibility(0);
      localLinearLayout.addView(this.e);
      localc.a(localLinearLayout);
    }
    localFragmentActivity1.getApplicationContext();
    this.b = com.spotify.mobile.android.spotlets.openaccess.a.a(this);
    this.b.a(localSpotifyLink.c());
    this.d = new com.spotify.mobile.android.spotlets.openaccess.a.a(i(), f);
    this.c.a(this.d, 2131690195, 0);
    this.a.c().setAdapter(this.c);
    return this.a.i();
  }

  public final void a(Album paramAlbum)
  {
    String str = paramAlbum.getImages().getLargestImage().getImageUrl();
    Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
    localPicasso.a(str).a(new com.spotify.mobile.android.ui.c.a(i())).b(i.b(i())).a(this.a.d());
    localPicasso.a(str).a(i.b(i())).a(this.a.e());
    this.a.a(paramAlbum.getName());
    TextView localTextView = this.e;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramAlbum.getArtistString();
    localTextView.setText(a(2131689498, arrayOfObject).toUpperCase(Locale.getDefault()));
    this.d.a(paramAlbum.getTracks());
  }

  public final void a(Throwable paramThrowable)
  {
    bp.a(paramThrowable, paramThrowable.getMessage());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
