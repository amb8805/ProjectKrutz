package com.spotify.mobile.android.spotlets.user;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
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
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;

public final class g extends m
  implements com.spotify.mobile.android.ui.fragments.g, ab
{
  private aa Y;
  private TopArtistModel[] Z;
  private String aa;
  private boolean ab;
  private f ac;
  private NotAvailableViewManager ad;
  private Resolver i;

  public g()
  {
  }

  private void D()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.aa;
    Request localRequest = RequestBuilder.get(String.format("hm://user-profile-view/v1/android/profile/%s/most-played-artists", arrayOfObject)).build();
    this.i.resolve(localRequest, new TopArtistsFragment.1(this, new Handler(Looper.getMainLooper()), TopArtistsListModel.class));
  }

  public static g a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("user-uri", paramString);
    g localg = new g();
    localg.b_(localBundle);
    return localg;
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903181, null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(16908298);
    this.ad = new NotAvailableViewManager(i(), paramLayoutInflater, localViewGroup2, localViewGroup1);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getResources().getString(2131690172);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (g().containsKey("artists-json"))
    {
      arrayOfParcelable = g().getParcelableArray("artists-json");
      arrayOfTopArtistModel = new TopArtistModel[arrayOfParcelable.length];
      for (j = 0; j < arrayOfParcelable.length; j++)
        arrayOfTopArtistModel[j] = ((TopArtistModel)arrayOfParcelable[j]);
      this.Z = arrayOfTopArtistModel;
    }
    while (!g().containsKey("user-uri"))
    {
      Parcelable[] arrayOfParcelable;
      TopArtistModel[] arrayOfTopArtistModel;
      int j;
      return;
    }
    this.aa = new SpotifyLink(g().getString("user-uri")).b();
    this.i = Cosmos.getResolver("com.spotify.user.artists", i());
    this.i.connect();
    this.ab = true;
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.ac = new f(i(), (byte)0);
    a(this.ac);
    if (this.Z != null)
    {
      this.ac.a(this.Z);
      this.ad.a(NotAvailableViewManager.DataState.d);
      return;
    }
    if (this.ab)
    {
      this.ad.a(NotAvailableViewManager.DataState.b);
      this.Y = new aa(i(), this);
      t().a(2131362156, null, this.Y);
      D();
      return;
    }
    this.ad.a(NotAvailableViewManager.DataState.c);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    TopArtistModel localTopArtistModel = (TopArtistModel)paramListView.getItemAtPosition(paramInt);
    a(MainActivity.a(i(), localTopArtistModel.getUri()));
  }

  public final void a(boolean paramBoolean)
  {
    this.ad.a(paramBoolean);
    if ((paramBoolean) && (this.ab))
      D();
  }

  public final void y()
  {
    super.y();
    if (this.i != null)
      this.i.destroy();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
