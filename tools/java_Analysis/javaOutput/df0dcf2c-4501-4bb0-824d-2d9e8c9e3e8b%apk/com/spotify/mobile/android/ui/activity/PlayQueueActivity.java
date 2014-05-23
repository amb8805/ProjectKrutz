package com.spotify.mobile.android.ui.activity;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.adapter.ae;
import com.spotify.mobile.android.ui.fragments.k;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;
import java.util.Locale;

public class PlayQueueActivity extends BaseFragmentActivity
{
  private ImageButton n;
  private ae o;
  private d p = (d)c.a(d.class);
  private TrackMenuDelegate q = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.b, TrackMenuDelegate.CanBrowseArtist.b, TrackMenuDelegate.CanRemoveFromCollection.b, TrackMenuDelegate.CanRemoveTrack.b, new PlayQueueActivity.1(this));
  private View.OnCreateContextMenuListener r = new PlayQueueActivity.3(this);
  private AdapterView.OnItemClickListener s = new PlayQueueActivity.4(this);
  private o<Cursor> t = new PlayQueueActivity.5(this);
  private o<Cursor> u = new PlayQueueActivity.6(this);

  public PlayQueueActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = ((dk)c.a(dk.class)).b();
    if (!bool)
      setTheme(2131755264);
    super.onCreate(paramBundle);
    if (bool)
      setContentView(2130903247);
    while (true)
    {
      this.o = new ae(this, bool);
      d().a(2131362135, null, this.t);
      d().a(2131362136, null, this.u);
      ListView localListView = (ListView)findViewById(16908298);
      localListView.setAdapter(this.o);
      localListView.setOnCreateContextMenuListener(this.r);
      localListView.setOnItemClickListener(this.s);
      this.n = ((ImageButton)findViewById(2131362265));
      this.n.setOnClickListener(new PlayQueueActivity.2(this));
      a(dv.a(this, ViewUri.u));
      if (bool)
      {
        ((TextView)findViewById(2131362227)).setText(getString(2131690159).toUpperCase(Locale.getDefault()));
        this.n.setImageDrawable(k.i(this));
      }
      return;
      setContentView(2130903248);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PlayQueueActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
