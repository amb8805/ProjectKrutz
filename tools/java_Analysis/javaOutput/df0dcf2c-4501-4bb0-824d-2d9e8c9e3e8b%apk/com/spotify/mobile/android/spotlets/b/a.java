package com.spotify.mobile.android.spotlets.b;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.model.l;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.menus.e;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dx;

public class a extends Fragment
  implements l, com.spotify.mobile.android.ui.fragments.g, ab
{
  private static final String[] ae = { "name", "artist_name", "artist_uri", "image_large_uri", "year", "copyright", "is_available", "is_radio_available", "is_artist_browsable", "is_queueable", "tracks_in_collection_count", "tracks_count", "artist_image_uri" };
  private ViewUri.Verified Y;
  private b Z;
  private String a;
  private LoadingView aa;
  private com.spotify.mobile.android.util.tracking.h ab;
  private EmptyView ac;
  private aa ad;
  private o<Cursor> af = new a.1(this);
  private String b;
  private String c;
  private String d;
  private String e;
  private boolean f;
  private boolean g;
  private boolean h;
  private Collection.State i;

  public a()
  {
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = MainActivity.a(paramContext, paramString1, paramString2);
    localIntent.putExtra("album_uri", paramString1);
    localIntent.putExtra("lookup_track_uri", paramString3);
    return localIntent;
  }

  public static a a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("album_uri", paramString1);
    localBundle.putString("title", paramString2);
    localBundle.putString("lookup_track_uri", paramString3);
    localBundle.putBoolean("autoplay", paramBoolean);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public static String a(String paramString)
  {
    String[] arrayOfString = paramString.split("\n");
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    Object localObject = null;
    int j = arrayOfString.length;
    int k = 0;
    while (k < j)
    {
      String str = arrayOfString[k];
      if (!str.equals(localObject))
      {
        if (localStringBuilder.length() != 0)
          localStringBuilder.append((char)'\n');
        localStringBuilder.append(str);
      }
      k++;
      localObject = str;
    }
    return localStringBuilder.toString();
  }

  public static boolean b(Intent paramIntent)
  {
    return paramIntent.hasExtra("album_uri");
  }

  public static Intent c(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null, null);
  }

  public final Fragment C()
  {
    return this;
  }

  public final Uri a()
  {
    return Uri.parse(this.b);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout1 = new FrameLayout(i());
    localFrameLayout1.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
    FrameLayout localFrameLayout2 = new FrameLayout(i());
    localFrameLayout1.addView(localFrameLayout2);
    this.Z = new b(i(), localFrameLayout1, t(), this.b, this.Y);
    localFrameLayout2.addView(this.Z.e());
    this.ac = com.spotify.mobile.android.ui.stuff.h.a(i(), a(2131689499));
    this.ac.setVisibility(8);
    localFrameLayout2.addView(this.ac);
    localFrameLayout2.setVisibility(4);
    this.aa = LoadingView.a(paramLayoutInflater, i(), localFrameLayout2);
    localFrameLayout1.addView(this.aa);
    Bundle localBundle = g();
    this.Z.a(localBundle.getBoolean("autoplay", false));
    this.Z.g(localBundle.getString("lookup_track_uri"));
    localBundle.putBoolean("autoplay", false);
    return localFrameLayout1;
  }

  public final String a(Context paramContext)
  {
    if (this.e == null)
      return paramContext.getString(2131689500);
    return this.e;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.b = g().getString("album_uri");
    this.e = g().getString("title");
    this.Y = ((ViewUri.Verified)g().getParcelable("referer"));
    if (this.Y == null)
      this.Y = ViewUri.aV;
    this.ad = new aa(i(), this);
    t().a(2131362084, null, this.af);
    t().a(2131362086, null, this.ad);
    a_(true);
    this.ab = new com.spotify.mobile.android.util.tracking.h(i(), this.b);
    this.ab.b(paramBundle);
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    ViewUri.Verified localVerified = ViewUri.E.a(this.b);
    if ((this.f) && (ds.b(i())) && (!f.a(i())))
    {
      Uri localUri = com.spotify.mobile.android.provider.a.b(this.b);
      com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, localVerified, localUri);
    }
    if (this.g)
      com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, localVerified, this.b);
    if (this.f)
    {
      FragmentActivity localFragmentActivity = i();
      String str = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.c;
      com.spotify.mobile.android.ui.menus.a.a(localFragmentActivity, paramMenu, localVerified, str, a(2131690252, arrayOfObject), this.b);
      e.a(i(), paramMenu, localVerified, this.i, this.b);
      e.a(i(), paramMenu, localVerified, this.b);
      if (this.h)
        e.c(i(), paramMenu, localVerified, this.b);
    }
  }

  public final void a(boolean paramBoolean)
  {
    int j = 8;
    EmptyView localEmptyView = this.ac;
    int k;
    View localView;
    if (!paramBoolean)
    {
      k = 0;
      localEmptyView.setVisibility(k);
      localView = this.Z.e();
      if (paramBoolean)
        break label47;
    }
    while (true)
    {
      localView.setVisibility(j);
      return;
      k = j;
      break;
      label47: j = 0;
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.ab.a(paramBundle);
  }

  public final void p_()
  {
    super.p_();
    this.ab.a();
  }

  public final void q_()
  {
    super.q_();
    this.ab.c();
  }

  public final void w()
  {
    super.w();
    this.aa.a();
    this.Z.a();
  }

  public final void x()
  {
    this.Z.b();
    super.x();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
