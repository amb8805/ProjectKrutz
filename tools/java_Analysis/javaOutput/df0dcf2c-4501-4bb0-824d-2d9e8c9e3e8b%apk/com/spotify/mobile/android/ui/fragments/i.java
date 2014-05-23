package com.spotify.mobile.android.ui.fragments;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.user.ProfilePanelFragment;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.NavigationItem.NavigationGroup;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.fragments.logic.r;
import com.spotify.mobile.android.ui.k;
import com.spotify.mobile.android.ui.view.PremiumUpsellBanner;
import com.spotify.mobile.android.ui.view.s;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;

public final class i extends android.support.v4.app.m
  implements com.spotify.mobile.android.ui.fragments.logic.n, s
{
  private static final String[] ad = { "capping_enabled", "total_playback_time", "should_show_remaining_time", "remaining_playback_time" };
  private com.spotify.mobile.android.ui.adapter.m Y;
  private View Z;
  private TextView aa;
  private PremiumUpsellBanner ab;
  private a ac = (a)c.a(a.class);
  private o<Cursor> ae = new i.1(this);
  private k af = new i.2(this);
  private boolean i;

  public i()
  {
  }

  private void H()
  {
    int j = 8;
    TextView localTextView = this.aa;
    if (this.i);
    for (int k = 0; ; k = j)
    {
      localTextView.setVisibility(k);
      boolean bool = this.ab.a();
      View localView = this.Z;
      if ((this.i) || (bool))
        j = 0;
      localView.setVisibility(j);
      return;
    }
  }

  private void I()
  {
    MainActivity localMainActivity = (MainActivity)i();
    if (localMainActivity != null)
    {
      Fragment localFragment = localMainActivity.f().b();
      if ((localFragment instanceof NavigationItem))
        this.Y.a(((NavigationItem)localFragment).D());
    }
    else
    {
      return;
    }
    this.Y.a(NavigationItem.NavigationGroup.a);
  }

  public final void C()
  {
    this.Y.notifyDataSetChanged();
  }

  public final void D()
  {
    FragmentActivity localFragmentActivity = i();
    a.a(localFragmentActivity, ViewUri.c, new ClientEvent(ClientEvent.Event.f));
    ((InputMethodManager)localFragmentActivity.getSystemService("input_method")).hideSoftInputFromWindow(localFragmentActivity.getWindow().getDecorView().getWindowToken(), 0);
    t().b(2131362092, null, this.ae);
  }

  public final void E()
  {
    a.a(i(), ViewUri.c, new ClientEvent(ClientEvent.Event.g));
  }

  public final void F()
  {
    H();
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (com.spotify.android.paste.widget.f.a(i()));
    for (int j = 2130903204; ; j = 2130903205)
    {
      View localView = paramLayoutInflater.inflate(j, paramViewGroup, false);
      localView.setPadding(0, ActionBarManager.b(i()), 0, 0);
      this.Y = new com.spotify.mobile.android.ui.adapter.m(i());
      this.Y.a(((r)m_().a("tag_session_fragment")).b());
      a(this.Y);
      I();
      ((MainActivity)i()).f().a(this.af);
      this.Z = localView.findViewById(2131362541);
      this.aa = ((TextView)this.Z.findViewById(2131362542));
      this.ab = ((PremiumUpsellBanner)this.Z.findViewById(2131362543));
      this.ab.a(2);
      this.ab.a(ViewUri.c, ViewUri.SubView.h);
      H();
      return localView;
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    t().a(2131362092, null, this.ae);
    com.spotify.mobile.android.ui.fragments.logic.m.a(this);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    if (!com.spotify.android.paste.widget.f.a(i()))
    {
      v().findViewById(2131362540).setVisibility(0);
      ProfilePanelFragment localProfilePanelFragment = new ProfilePanelFragment();
      l().a().b(2131362540, localProfilePanelFragment, "tag_profile_panel_fragment").b();
    }
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.h);
    localClientEvent.a("target", this.Y.b(paramInt).toString());
    a.a(i(), ViewUri.c, localClientEvent);
    String str = this.Y.a(paramInt);
    a(MainActivity.a(i(), str));
  }

  public final void y()
  {
    super.y();
    ((MainActivity)i()).f().b(this.af);
    com.spotify.mobile.android.ui.fragments.logic.m.b(this);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
