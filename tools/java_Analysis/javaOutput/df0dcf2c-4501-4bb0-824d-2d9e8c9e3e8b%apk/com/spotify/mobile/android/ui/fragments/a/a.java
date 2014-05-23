package com.spotify.mobile.android.ui.fragments.a;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity;
import com.spotify.mobile.android.ui.adapter.v;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public final class a extends m
{
  private String Y;
  private v Z;
  private ListItemView aa;
  private dt ab;
  private o<Cursor> ac = new a.1(this);
  private Intent i;

  public a()
  {
  }

  public static a a(Intent paramIntent, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", paramIntent);
    localBundle.putString("title", paramString);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903181, paramViewGroup, false);
    this.Z = new v(i(), this.i);
    ListView localListView = (ListView)localView.findViewById(16908298);
    this.aa = h.h(i(), localListView);
    this.aa.a(a(2131690255));
    this.aa.a().setImageResource(2130838108);
    localListView.addHeaderView(this.aa);
    a(this.Z);
    return localView;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.i = ((Intent)g().getParcelable("intent"));
    this.Y = g().getString("title");
    a_(false);
    this.ab = dv.a(i(), ViewUri.ap);
    t().a(2131362171, null, this.ac);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0)
    {
      if (!this.aa.isEnabled())
        return;
      Intent localIntent2 = new Intent(i(), ShareToSpotifyActivity.class);
      localIntent2.setFlags(1073741824);
      localIntent2.putExtra("android.intent.extra.INTENT", this.i);
      localIntent2.putExtra("title", this.Y);
      a(localIntent2);
      i().finish();
      return;
    }
    ResolveInfo localResolveInfo = (ResolveInfo)this.Z.getItem(paramInt - 1);
    Intent localIntent1 = new Intent(this.i);
    localIntent1.setPackage(localResolveInfo.activityInfo.packageName);
    a(localIntent1);
    i().finish();
  }

  public final void w()
  {
    super.w();
    this.ab.a();
  }

  public final void x()
  {
    super.x();
    this.ab.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
