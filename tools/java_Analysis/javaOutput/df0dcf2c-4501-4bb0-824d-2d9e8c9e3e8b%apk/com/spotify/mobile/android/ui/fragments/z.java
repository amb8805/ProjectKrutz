package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.adapter.SettingsAdapter;
import com.spotify.mobile.android.ui.adapter.j;
import com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public class z extends m
  implements NavigationItem, g
{
  private static final String aa = z.class.getSimpleName();
  private static final String[] ab = { "private_session_timeout", "logged_in", "current_user_name", "product_type" };
  public static final String[] i = { "offline_mode", "private_session", "broadcast_play_state", "download_over_3g", "download_quality", "stream_quality", "facebook_connected", "post_to_facebook", "seconds_to_offline_expiry", "lastfm_username", "lastfm_password", "gapless", "crossfade", "crossfade_time_seconds", "ap" };
  protected boolean Y;
  protected boolean Z;
  private View ac;
  private SettingsAdapter ad;
  private LoadingView ae;
  private j af;
  private dt ag;
  private o<Cursor> ah = new z.2(this);
  private o<Cursor> ai = new z.3(this);

  public z()
  {
  }

  public final Fragment C()
  {
    return this;
  }

  public final NavigationItem.NavigationGroup D()
  {
    return NavigationItem.NavigationGroup.n;
  }

  protected final void E()
  {
    if ((!this.Y) || (!this.Z))
      return;
    this.ae.b();
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ad = new SettingsAdapter(i());
    this.af = new z.1(this, i(), this.ad);
    this.af.a(this.ad.a());
    a(this.af);
    this.ac = paramLayoutInflater.inflate(2130903181, paramViewGroup, false);
    ListView localListView = (ListView)this.ac.findViewById(16908298);
    localListView.setDivider(null);
    localListView.setDividerHeight(0);
    localListView.setVisibility(4);
    this.ae = LoadingView.a(paramLayoutInflater, i(), this.ac.findViewById(16908298));
    return this.ac;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(2131690248);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    t().a(2131362166, null, this.ai);
    t().a(2131362170, null, this.ah);
    a_(true);
    this.ag = dv.a(i(), ViewUri.q);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if ((paramView instanceof AbstractSettingsCell))
      ((AbstractSettingsCell)paramView).a();
  }

  public final void w()
  {
    super.w();
    this.ad.notifyDataSetChanged();
    this.ae.a();
    this.ag.a();
  }

  public final void x()
  {
    super.x();
    this.ag.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
