package com.spotify.mobile.android.spotlets.user;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.smash.Connection;
import com.spotify.cosmos.smash.Request;
import com.spotify.cosmos.smash.util.JacksonParser;
import com.spotify.cosmos.smash.util.RequestBuilder;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import java.util.Locale;

public final class ProfilesListFragment extends m
  implements g, ab
{
  private Connection Y;
  private JacksonParser<ProfileListModel> Z = new JacksonParser(ProfileListModel.class);
  private ProfileModel[] aa;
  private String ab;
  private String ac;
  private aa ad;
  private NotAvailableViewManager ae;
  private o<Cursor> af = new ProfilesListFragment.2(this);
  private e i;

  public ProfilesListFragment()
  {
  }

  public static ProfilesListFragment a(String paramString, ProfilesListFragment.Type paramType)
  {
    ProfilesListFragment localProfilesListFragment = new ProfilesListFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("uri", paramString);
    localBundle.putSerializable("type", paramType);
    localProfilesListFragment.b_(localBundle);
    return localProfilesListFragment;
  }

  public final Fragment C()
  {
    return this;
  }

  protected final void D()
  {
    if (this.ae.a().booleanValue())
      return;
    this.ae.a(NotAvailableViewManager.DataState.b);
    this.ab = g().getString("uri");
    ProfilesListFragment.Type localType = (ProfilesListFragment.Type)g().getSerializable("type");
    switch (ProfilesListFragment.3.a[localType.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    for (String str = d.c(this.ab); ; str = Uri.encode(this.ac))
    {
      Request localRequest = RequestBuilder.get(String.format(Locale.US, localType.mHermesUrlTemplate, new Object[] { str })).build();
      this.Y = Cosmos.getConnection(i(), SpotifyService.class);
      this.Y.resolve(localRequest, this.Z, new ProfilesListFragment.1(this));
      return;
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903184, null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(16908298);
    this.ae = new NotAvailableViewManager(i(), paramLayoutInflater, localViewGroup2, localViewGroup1);
    this.ad = new aa(i(), this);
    t().a(2131362150, null, this.ad);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return null;
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    String str = ((ProfileModel)this.i.getItem(paramInt)).getUri();
    a(MainActivity.a(i(), str, null));
  }

  public final void a(boolean paramBoolean)
  {
    this.ae.a(paramBoolean);
    if ((paramBoolean) && (this.ac != null))
      D();
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    int j = ((ProfilesListFragment.Type)g().getSerializable("type")).mTitleResource;
    String str = j().getString(j);
    ((l)i()).a(this, str);
    t().a(2131362155, null, this.af);
  }

  public final void y()
  {
    if (this.Y != null)
      this.Y.disconnect();
    if (this.i != null)
      this.i.a();
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.ProfilesListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
