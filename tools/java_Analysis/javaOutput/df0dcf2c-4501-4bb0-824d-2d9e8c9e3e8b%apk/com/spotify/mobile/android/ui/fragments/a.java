package com.spotify.mobile.android.ui.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;

public final class a extends Fragment
{
  private ListView a;
  private String b;
  private String c;
  private com.spotify.mobile.android.ui.adapter.a d;
  private AdapterView.OnItemClickListener e = new a.1(this);
  private o<Cursor> f = new a.2(this);

  public a()
  {
  }

  public static a a(String paramString)
  {
    return a(null, paramString);
  }

  public static a a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("folder_uri", paramString1);
    localBundle.putString("track_uri", paramString2);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903127, paramViewGroup, false);
    this.a = ((ListView)localView.findViewById(2131362356));
    this.a.setBackgroundColor(g.a(i(), 2130772359));
    ListItemView localListItemView = h.h(i(), this.a);
    localListItemView.a(a(2131689966));
    e locale = new e(i(), SpotifyIcon.aR);
    locale.a(g.b(i(), 2130772374));
    localListItemView.a().setImageDrawable(locale);
    localListItemView.a().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.d = new com.spotify.mobile.android.ui.adapter.a(i());
    this.a.addHeaderView(localListItemView, null, true);
    this.a.setAdapter(this.d);
    this.a.setOnItemClickListener(this.e);
    return localView;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = g().getString("folder_uri");
    this.b = g().getString("track_uri");
    t().a(2131362083, null, this.f);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
