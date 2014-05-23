package com.spotify.mobile.android.spotlets.follow;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.android.util.RequestBuilder;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.l;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.fragments.g;
import com.spotify.mobile.android.util.aa;
import com.spotify.mobile.android.util.ab;
import java.util.Locale;

public final class d extends m
  implements g, ab
{
  private ProfileModel[] Y;
  private ProfileModel[] Z;
  private ProfileModel[] aa;
  private ProfileModel[] ab;
  private Integer ac = Integer.valueOf(3);
  private q ad;
  private String ae;
  private String af;
  private NotAvailableViewManager ag;
  private aa ah;
  private ViewGroup ai;
  private o<Cursor> aj = new d.1(this);
  private Resolver i;

  public d()
  {
  }

  private void D()
  {
    if (this.ag.a().booleanValue())
      return;
    this.ag.a(NotAvailableViewManager.DataState.b);
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Uri.encode(this.ae);
    String str = String.format(localLocale, "hm://follow-suggestions-view/v1/android/suggestions/%s/people", arrayOfObject);
    Handler localHandler = new Handler(Looper.getMainLooper());
    Request localRequest = RequestBuilder.get(str).build();
    this.i.resolve(localRequest, new FollowOverviewFragment.2(this, localHandler, FollowOverviewModel.class));
  }

  public final Fragment C()
  {
    return this;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ViewGroup localViewGroup1 = (ViewGroup)paramLayoutInflater.inflate(2130903184, null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(16908298);
    this.ag = new NotAvailableViewManager(i(), paramLayoutInflater, localViewGroup2, localViewGroup1);
    this.ag.a(2131689960);
    return localViewGroup1;
  }

  public final String a(Context paramContext)
  {
    return this.af;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.af = j().getString(2131689961);
    this.i = Cosmos.getResolver("com.spotify.follow", i());
    this.i.connect();
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    t().a(2131362155, null, this.aj);
    this.ah = new aa(i(), this);
    t().a(2131362150, null, this.ah);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (this.ai != null)
    {
      if (paramInt != 0)
        break label62;
      this.ai.performClick();
    }
    while (true)
    {
      Object localObject = this.ad.getItem(paramInt);
      if ((localObject instanceof ProfileModel))
      {
        String str = ((ProfileModel)localObject).getUri();
        a(MainActivity.a(i(), str, null));
      }
      return;
      label62: paramInt--;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.ag.a(paramBoolean);
    if ((paramBoolean) && (this.ae != null))
      D();
  }

  public final void p_()
  {
    super.p_();
    ((l)i()).a(this, this.af);
  }

  public final void y()
  {
    this.i.destroy();
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
