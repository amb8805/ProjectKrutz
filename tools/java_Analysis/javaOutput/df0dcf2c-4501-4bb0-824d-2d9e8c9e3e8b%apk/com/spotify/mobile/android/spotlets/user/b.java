package com.spotify.mobile.android.spotlets.user;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.android.util.RequestBuilder;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import java.util.Locale;

public final class b extends m
  implements g, ab
{
  private Resolver Y;
  private String Z;
  private a aa;
  private NotAvailableViewManager ab;
  private aa i;

  public b()
  {
  }

  public static b a(String paramString)
  {
    b localb = new b();
    Bundle localBundle = new Bundle();
    localBundle.putString("username", new SpotifyLink(paramString).b());
    localb.b_(localBundle);
    return localb;
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903181, null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(16908298);
    this.ab = new NotAvailableViewManager(i(), paramLayoutInflater, localViewGroup2, localViewGroup1);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getResources().getString(2131690158);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = g().getString("username");
    this.Y = Cosmos.getResolver("com.spotify.profile.playlists", i());
    this.Y.connect();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.aa = new a(i(), (byte)0);
    a(this.aa);
    this.i = new aa(i(), this);
    t().a(2131362154, null, this.i);
    this.ab.a(NotAvailableViewManager.DataState.b);
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Uri.encode(this.Z);
    Request localRequest = RequestBuilder.get(String.format(localLocale, "hm://user-profile-view/v1/android/profile/%s/playlists", arrayOfObject)).build();
    this.Y.resolve(localRequest, new PlaylistsFragment.1(this, new Handler(Looper.getMainLooper()), PlaylistListModel.class));
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    PlaylistModel localPlaylistModel = (PlaylistModel)paramListView.getItemAtPosition(paramInt);
    a(MainActivity.a(i(), localPlaylistModel.getUri()));
  }

  public final void a(boolean paramBoolean)
  {
    this.ab.a(paramBoolean);
  }

  public final void y()
  {
    if (this.Y != null)
      this.Y.destroy();
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
