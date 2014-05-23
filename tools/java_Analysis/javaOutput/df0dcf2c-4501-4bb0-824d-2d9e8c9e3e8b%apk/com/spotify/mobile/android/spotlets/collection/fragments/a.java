package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.model.l;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import com.spotify.mobile.android.spotlets.collection.adapter.AlbumTracksAdapter;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.Collection.State;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.ar;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import com.spotify.mobile.android.util.dx;
import java.util.Locale;

public class a extends android.support.v4.app.m
  implements l, com.spotify.mobile.android.ui.fragments.g, com.spotify.mobile.android.ui.o
{
  private static final String[] i = { "name", "uri", "offline_state", "sync_progress", "can_undownload", "is_available", "is_radio_available", "tracks_in_collection_count", "tracks_count", "artist_name", "artist_uri", "is_artist_browsable", "image_uri", "year", "artist_image_uri" };
  private String Y;
  private String Z;
  private dt aA;
  private ViewUri.Verified aB;
  private com.spotify.mobile.android.ui.actions.a aC = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private d aD = (d)com.spotify.mobile.android.c.c.a(d.class);
  private com.spotify.mobile.android.ui.actions.c aE = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
  private com.spotify.mobile.android.util.tracking.h aF;
  private ar<Integer> aG;
  private TrackMenuDelegate aH = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.b, TrackMenuDelegate.CanBrowseArtist.b, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new a.1(this));
  private com.spotify.mobile.android.ui.view.paste.a aI;
  private View.OnClickListener aJ = new a.7(this);
  private View.OnClickListener aK = new a.11(this);
  private View.OnClickListener aL = new a.12(this);
  private com.spotify.mobile.android.ui.view.f aM = new a.13(this);
  private android.support.v4.app.o<Cursor> aN = new a.3(this);
  private android.support.v4.app.o<Cursor> aO = new a.4(this);
  private String aa;
  private String ab;
  private String ac;
  private boolean ad;
  private boolean ae;
  private boolean af;
  private boolean ag;
  private Collection.State ah;
  private q ai;
  private AlbumTracksAdapter aj;
  private Cursor ak;
  private View al;
  private DownloadHeaderView am;
  private LoadingView an;
  private EmptyView ao;
  private View ap;
  private Button aq;
  private Parcelable ar;
  private com.spotify.mobile.android.ui.prettylist.c as;
  private com.spotify.mobile.android.util.g at;
  private boolean au;
  private Handler av;
  private TextView aw;
  private ToggleButton ax;
  private int ay = 0;
  private int az = 0;

  public a()
  {
  }

  public static a a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("collection_album_uri", paramString1);
    localBundle.putString("title", paramString2);
    localBundle.putBoolean("is_sub_fragment", paramBoolean);
    a locala = new a();
    locala.b_(localBundle);
    return locala;
  }

  public final Fragment C()
  {
    return this;
  }

  public final Uri a()
  {
    return Uri.parse(this.ac);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    MainActivity localMainActivity;
    com.spotify.mobile.android.ui.prettylist.c localc1;
    ListView localListView1;
    label285: FrameLayout localFrameLayout;
    EmptyView localEmptyView;
    int j;
    label412: LinearLayout localLinearLayout;
    int k;
    label433: Button localButton;
    LinearLayout.LayoutParams localLayoutParams2;
    int m;
    if (!this.au)
    {
      localMainActivity = (MainActivity)i();
      if (ds.b(localMainActivity))
      {
        localc1 = com.spotify.mobile.android.ui.prettylist.e.b(localMainActivity);
        this.as = localc1;
        this.as.a(com.spotify.android.paste.widget.g.a(localMainActivity, 2130772373));
        this.as.a(this.Y);
        com.spotify.mobile.android.ui.prettylist.c localc2 = this.as;
        View localView = LayoutInflater.from(i()).inflate(2130903161, null);
        this.aw = ((TextView)localView.findViewById(2131362282));
        this.ax = ((ToggleButton)localView.findViewById(2131362452));
        this.ax.setOnClickListener(new a.8(this));
        localc2.a(localView);
        this.ap = this.as.i();
        ListView localListView2 = this.as.c();
        if (ds.a(i()))
        {
          this.al = com.spotify.mobile.android.ui.stuff.f.a(i(), null);
          this.al.setOnClickListener(this.aJ);
          this.as.b(this.al);
        }
        this.aI = new com.spotify.mobile.android.ui.view.paste.a(i());
        a.9 local9 = new a.9(this);
        this.aI.a(local9);
        this.aI.c(a(2131689497));
        this.as.f().a(new a.10(this));
        localListView1 = localListView2;
        localFrameLayout = new FrameLayout(i());
        localFrameLayout.setBackgroundColor(com.spotify.android.paste.widget.g.a(i(), 16842836));
        localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        localFrameLayout.addView(this.ap);
        localListView1.setFastScrollEnabled(true);
        this.ap.setVisibility(4);
        this.an = LoadingView.a(paramLayoutInflater, i(), this.ap);
        localFrameLayout.addView(this.an);
        this.ao = com.spotify.mobile.android.spotlets.collection.a.a.d(i());
        localEmptyView = this.ao;
        if ((!ds.b(i())) || (this.au))
          break label905;
        j = 1;
        localLinearLayout = new LinearLayout(i());
        if (j == 0)
          break label911;
        k = 0;
        localLinearLayout.setOrientation(k);
        localLinearLayout.setGravity(1);
        localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        localButton = com.spotify.android.paste.widget.h.d(i(), localLinearLayout);
        localButton.setId(2131362050);
        localButton.setOnClickListener(this.aK);
        localButton.setText(a(2131690109).toUpperCase(Locale.getDefault()));
        localButton.setSingleLine(true);
        LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localButton.getLayoutParams();
        localLayoutParams1.width = i().getResources().getDimensionPixelSize(2131427412);
        if (j != 0)
          localLayoutParams1.weight = 1.0F;
        localButton.setLayoutParams(localLayoutParams1);
        this.aq = com.spotify.android.paste.widget.h.b(i(), localLinearLayout);
        this.aq.setId(2131362051);
        this.aq.setOnClickListener(this.aL);
        this.aq.setText(a(2131690108).toUpperCase(Locale.getDefault()));
        this.aq.setSingleLine(true);
        this.aq.setEllipsize(TextUtils.TruncateAt.END);
        localLayoutParams2 = (LinearLayout.LayoutParams)this.aq.getLayoutParams();
        localLayoutParams2.width = i().getResources().getDimensionPixelSize(2131427412);
        m = i().getResources().getDimensionPixelSize(2131427411);
        if (j == 0)
          break label917;
        localLayoutParams2.leftMargin = m;
        localLayoutParams2.weight = 1.0F;
      }
    }
    while (true)
    {
      this.aq.setLayoutParams(localLayoutParams2);
      localLinearLayout.addView(localButton);
      localLinearLayout.addView(this.aq);
      localEmptyView.a(localLinearLayout);
      this.ao.setVisibility(8);
      localFrameLayout.addView(this.ao);
      this.aj = new AlbumTracksAdapter(i(), FeatureFragment.h.a());
      this.aj.a(a(2131690130));
      this.ai = new q(i());
      this.ai.a(this.aj, null, 0);
      this.ai.d(0);
      this.am = ((DownloadHeaderView)com.spotify.mobile.android.ui.view.i.a(i()));
      this.am.a(this.aM);
      localListView1.addHeaderView(this.am, null, false);
      localListView1.setAdapter(this.ai);
      return localFrameLayout;
      localc1 = com.spotify.mobile.android.ui.prettylist.e.a(localMainActivity);
      break;
      this.ap = paramLayoutInflater.inflate(2130903181, paramViewGroup, false);
      localListView1 = (ListView)this.ap.findViewById(16908298);
      break label285;
      label905: j = 0;
      break label412;
      label911: k = 1;
      break label433;
      label917: localLayoutParams2.topMargin = m;
    }
  }

  public final String a(Context paramContext)
  {
    if (this.Y == null)
      return paramContext.getString(2131689500);
    return this.Y;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
      this.ar = paramBundle.getParcelable("list");
    Bundle localBundle = g();
    this.ac = localBundle.getString("collection_album_uri");
    this.Y = localBundle.getString("title");
    this.au = localBundle.getBoolean("is_sub_fragment");
    this.aB = ViewUri.aD.a(this.ac);
    this.aA = dv.a(i(), this.aB);
    this.aF = new com.spotify.mobile.android.util.tracking.h(i(), this.aB.toString());
    this.aF.b(paramBundle);
    this.aG = new ar(2, new a.6(this));
    if (!this.au);
    for (boolean bool = true; ; bool = false)
    {
      a_(bool);
      this.at = new com.spotify.mobile.android.util.g();
      this.av = new Handler();
      return;
    }
  }

  public final void a(Menu paramMenu)
  {
    paramMenu.clear();
    c(paramMenu);
  }

  public final void a(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    int j = paramInt - paramListView.getHeaderViewsCount();
    switch (this.ai.b(j))
    {
    default:
      return;
    case 0:
    }
    Uri localUri = com.spotify.mobile.android.provider.c.d(this.ac);
    com.spotify.mobile.android.model.m localm = (com.spotify.mobile.android.model.m)paramView.getTag();
    if (FeatureFragment.h.a())
    {
      com.spotify.mobile.android.ui.actions.a.a(i(), this.aB, ClientEvent.a("album", ClientEvent.SubEvent.au, localm.h(), Long.valueOf(paramLong)));
      if ((this.al instanceof ShufflePlayHeaderView))
      {
        ((ShufflePlayHeaderView)this.al).b();
        return;
      }
      ShufflePlayHeaderView.a(this.at, this.al);
      return;
    }
    com.spotify.mobile.android.ui.actions.a.a(i(), this.aB, ClientEvent.a("album", ClientEvent.SubEvent.at, localm.h(), Long.valueOf(paramLong)));
    d.a(i(), this.aB, localUri, paramLong);
  }

  public final void a(Collection.State paramState)
  {
    this.ah = paramState;
    if (this.as != null);
    switch (a.5.a[paramState.ordinal()])
    {
    default:
      return;
    case 1:
      this.ax.setText(2131689651);
      this.ax.setChecked(false);
      return;
    case 2:
      this.ax.setText(2131689650);
      this.ax.setChecked(false);
      return;
    case 3:
    }
    this.ax.setText(2131689652);
    this.ax.setChecked(true);
  }

  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    b().setOnCreateContextMenuListener(this);
    this.an.a();
    t().a(2131362095, null, this.aN);
    t().a(2131362097, null, this.aO);
  }

  public final void c(Menu paramMenu)
  {
    if ((this.aj != null) && (this.aj.getCount() > 0));
    for (int j = 1; ; j = 0)
    {
      if (this.Z != null)
      {
        if ((ds.b(i())) && (j != 0))
          this.al = com.spotify.mobile.android.ui.menus.a.a(i(), paramMenu, this.aB, com.spotify.mobile.android.provider.c.d(this.Z));
        if (this.ae)
          com.spotify.mobile.android.ui.menus.a.b(i(), paramMenu, this.aB, this.Z);
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, this.aB, this.ah, this.Z);
      }
      if ((j != 0) && ((Metadata.OfflineSync.a(this.ay)) || (this.ad)))
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, this.aB, com.spotify.mobile.android.provider.c.c(this.ac), new SpotifyLink(this.ac).a(), this.ay, this.az);
      if ((this.Z != null) && (this.af))
        com.spotify.mobile.android.ui.menus.e.a(i(), paramMenu, this.aB, this.Z, this.Y);
      if ((this.ab != null) && (!com.spotify.mobile.android.util.i.a(this.aa)) && (this.ag))
        com.spotify.mobile.android.ui.menus.e.b(i(), paramMenu, this.aB, this.ab, this.aa);
      return;
    }
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (b() != null)
      paramBundle.putParcelable("list", b().onSaveInstanceState());
    this.aF.a(paramBundle);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    View localView = ((AdapterView.AdapterContextMenuInfo)paramContextMenuInfo).targetView;
    if (!(localView instanceof ListItemView));
    Object localObject;
    do
    {
      return;
      localObject = localView.getTag();
    }
    while (!(localObject instanceof com.spotify.mobile.android.model.m));
    this.aH.a(paramContextMenu, (com.spotify.mobile.android.model.m)localObject);
  }

  public final void p_()
  {
    super.p_();
    this.aF.a();
  }

  public final void q_()
  {
    super.q_();
    this.aF.c();
  }

  public final void w()
  {
    super.w();
    this.aA.a();
  }

  public final void x()
  {
    super.x();
    this.aA.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
